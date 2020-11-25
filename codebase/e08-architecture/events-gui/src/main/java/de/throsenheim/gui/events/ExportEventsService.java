package de.throsenheim.gui.events;

import de.throsenheim.gui.events.event.EventModel;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 * Simple javafx.concurrent.Service implementation for the events export.
 */
public class ExportEventsService extends Service<Integer> {

    //This is actually the input for the export task. We have to provide it as property.
    private ListProperty<EventModel> events = new SimpleListProperty<>();

    public ObservableList<EventModel> getEvents() {
        return events.get();
    }

    public ListProperty<EventModel> eventsProperty() {
        return events;
    }

    public void setEvents(ObservableList<EventModel> events) {
        this.events.set(events);
    }

    @Override
    protected Task<Integer> createTask() {
        return new ExportEventsTask(events.get());
    }
}
