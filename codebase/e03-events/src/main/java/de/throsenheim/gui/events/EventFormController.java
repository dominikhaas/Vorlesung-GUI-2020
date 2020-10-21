package de.throsenheim.gui.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the event form. This class is used in the GUI defined in FXML and provides the necessary functions
 * to implement the dialog's logic.
 *
 * @author dominik.haas
 */
public class EventFormController implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventFormController.class);

    @FXML
    private GridPane eventFormPane;

    @FXML
    private TextField idInput;
    @FXML
    private TextField nameInput;
    @FXML
    private DatePicker dateInput;
    @FXML
    private ComboBox<Integer> startInput;
    @FXML
    private ComboBox<Integer> endInput;
    @FXML
    private CheckBox privateInput;
    @FXML
    private TextField participantsInput;
    @FXML
    private TextField streetInput;
    @FXML
    private TextField streetNumberInput;
    @FXML
    private TextField zipInput;
    @FXML
    private TextField cityInput;
    @FXML
    private TextArea notesInput;

    @FXML
    private Button resetButton;
    @FXML
    private Button cancelButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //programmatic simple registration of events
        //event handler is implemented as anonymous
        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                reset();
            }
        });

        //programmatic registration of events (rich api)
        //event handler is implemented as lambda expression
        cancelButton.addEventHandler(ActionEvent.ACTION, (e) -> {
            cancel();
        });

        //example for event filter (pointless example)
        //handlers can be registered for parents too
        eventFormPane.addEventFilter(KeyEvent.KEY_TYPED, (KeyEvent e) -> {
            if(e.getCharacter().equals("a")) {
                e.consume();
            }
        });
    }

    /**
     * This method is triggered if the user presses the save button.
     *
     * @param event JavaFX's action event
     */
    @FXML
    private void onSave(ActionEvent event) {
        LOGGER.info("OnSave: {}", toEventModel());
    }

    /**
     * Cancels the current editing
     */
    private void cancel() {
        LOGGER.info("cancel");
    }

    /**
     * Resets the current input
     */
    private void reset() {
        LOGGER.info("reset");
    }

    private EventModel toEventModel() {
        //create a new model object
        EventModel result = new EventModel();

        //fill it with the user's input
        result.setStart(startInput.getValue());
        result.setDate(dateInput.getValue());
        result.setName(nameInput.getText());
        result.setNotes(notesInput.getText());
        result.setCity(cityInput.getText());
        result.setZip(zipInput.getText());
        result.setStreet(streetInput.getText());
        result.setEnd(endInput.getValue());
        result.setParticipants(participantsInput.getText());
        result.setPrivateFlag(privateInput.isSelected());
        result.setStreetNumber(streetNumberInput.getText());

        return result;
    }
}
