package de.throsenheim.gui.events;

import de.throsenheim.gui.events.event.EventModel;
import javafx.concurrent.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Export Events Task implemented as JavaFX concurrent task.
 * The input has to be provided in the constructor. The output is the generic parameter (integer = count of successfully
 * exported events).
 */
public class ExportEventsTask extends Task<Integer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventsMainPresenter.class);

    private List<EventModel> events;

    public ExportEventsTask(List<EventModel> events) {
        this.events = events;
    }

    /**
     * This method has to be implemented. It is called during execution and returns the result.
     *
     * @return count of successfully exported events
     */
    @Override
    protected Integer call()  {
        return exportEvents(events);
    }

    /**
     * Exports all events and returns the number of successfully exported events.
     *
     * @param events list of events ot export
     * @return  count of successfully exported events
     */
    private int exportEvents(List<EventModel> events) {
        updateProgress(0, events.size());
        int exportCount = 0;
        for (int i = 0; i < events.size(); i++) {
            try {
                exportEvent(events.get(i));
                updateProgress(i + 1, events.size());
                exportCount++;
            } catch (Exception e) {
                LOGGER.error("Export for event " + events.get(i) + " failed!", e);
            }
        }
        return exportCount;
    }

    private void exportEvent(EventModel event) {
        //simulated long running export
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info("Exported event {}", event);
    }
}
