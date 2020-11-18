package de.throsenheim.gui.events;

import de.throsenheim.gui.events.event.EventModel;
import de.throsenheim.gui.events.eventbus.SimpleEventBus;
import de.throsenheim.gui.events.eventform.EventFormPresenter;
import de.throsenheim.gui.events.status.StatusEvent;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Controller/presenter for the events main dialog
 */
public class EventsMainPresenter implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventsMainPresenter.class);

    @FXML
    private TableView<EventModel> eventsTable;
    @FXML
    private EventFormPresenter eventFormController;
    @FXML
    private Button exportButton;
    @FXML
    private ProgressBar progressBar;

    private EventsMainModel model = new EventsMainModel();

    private ExportEventsService service = new ExportEventsService();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        populateListWithData();

        registerEventHandlers();

        initiateDataBindings();

        //exercise 3 - JavaFx concurrent
        service.eventsProperty().bind(model.eventsProperty());

        service.setOnSucceeded((value) -> {
            SimpleEventBus.get().publish(new StatusEvent("Exported " + service.getValue() + " events!"));
        });

        exportButton.disableProperty().bind(service.runningProperty());
        progressBar.progressProperty().bind(service.progressProperty());
        progressBar.visibleProperty().bind(service.runningProperty());
    }

    private void populateListWithData() {
        model.setEvents(Arrays.asList(
                new EventModel("Event a", LocalDate.now(), 10),
                new EventModel("Event b", LocalDate.now(), 11),
                new EventModel("Event c", LocalDate.now(), 12),
                new EventModel("Event d", LocalDate.now(), 13),
                new EventModel("Event e", LocalDate.now(), 14),
                new EventModel("Event f", LocalDate.now(), 15)
        ));
    }

    private void registerEventHandlers() {
        //register save listener - component interaction
        eventFormController.addSaveListener(event -> {
            this.saveEvent(event);
        });

        exportButton.setOnAction((e) -> {
            //exercise 2 - export using threads
            //ex2ExportInNewThread();

            //exercise 3 - export using the javaFx concurrent helper classes
            ex3ExportWithJavaFxConcurrent();
        });
    }

    private void initiateDataBindings() {
        //ui bindings - display events in table
        eventsTable.itemsProperty().bind(model.eventsProperty());
    }

    private void saveEvent(EventModel event) {
        LOGGER.info("Save event");
        //add the current event to the list
        model.addEvent(event);
        //set up a new one
        eventFormController.setEvent(new EventModel());
    }


    private void ex3ExportWithJavaFxConcurrent() {
        service.restart();
    }

    private void ex2ExportInNewThread() {
        //main GUI thread
        exportButton.setText("Export running ...");
        exportButton.setDisable(true);


        new Thread(() -> {
            //new thread
            int exportedEvents = exportEvents(model.getEvents());

          Platform.runLater(() -> {
                //main GUI thread
                SimpleEventBus.get().publish(new StatusEvent("Exported " + exportedEvents + " events!"));

                exportButton.setText("Export");
                exportButton.setDisable(false);
          });
        }).start();
    }

    private int exportEvents(List<EventModel> events) {
        int exportCount = 0;
        for (EventModel event : events) {
            try {
                exportEvent(event);
                exportCount++;
            } catch (Exception e) {
                LOGGER.error("Export for event " + event + " failed!", e);
            }
        }
        return exportCount;
    }

    private void exportEvent(EventModel event) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LOGGER.info("Exported event {}", event);
    }
}
