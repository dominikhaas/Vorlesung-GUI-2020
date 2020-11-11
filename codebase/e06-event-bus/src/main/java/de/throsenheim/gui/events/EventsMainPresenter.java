package de.throsenheim.gui.events;

import de.throsenheim.gui.events.event.EventModel;
import de.throsenheim.gui.events.eventform.EventFormPresenter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
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

    private EventsMainModel model = new EventsMainModel();



    private void saveEvent(EventModel event) {
        LOGGER.info("safeEvent");
        //add the current event to the list
        model.addEvent(event);
        //set up a new one
        eventFormController.setEvent(new EventModel());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Aufgabe 2 - don't do this!
        /*
        eventFormController.saveButton.setOnAction(e -> {
            System.out.println("### Parent (main) - received save from form");
        });*/


        //register save listener - component interaction
        eventFormController.addSaveListener(event -> {
            this.saveEvent(event);
        });

        //ui bindings - display events in table
        eventsTable.itemsProperty().bind(model.eventsProperty());
    }
}
