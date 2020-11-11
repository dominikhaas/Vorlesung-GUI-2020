package de.throsenheim.gui.events.eventform;

import de.throsenheim.gui.events.event.EventModel;
import de.throsenheim.gui.events.eventbus.SimpleEventBus;
import de.throsenheim.gui.events.status.StatusEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Presenter for the event form. This class is used in the GUI defined in FXML and provides the necessary functions
 * to implement the dialog's logic.
 *
 * @author dominik.haas
 */
public class EventFormPresenter implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventFormPresenter.class);

    @FXML
    private Text headerText;

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

    private EventModel eventModel = new EventModel();
    private final EventFormModel eventFormModel = new EventFormModel();

    private Set<SaveListener> saveListeners = new HashSet<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeBindings();
        initializeEventHandlers();
    }

    private void initializeBindings() {
        initializeComboBoxBindings();
        initializeFormBindings();
    }

    private void initializeComboBoxBindings() {
        startInput.itemsProperty().bind(eventFormModel.startValuesProperty());
        endInput.itemsProperty().bind(eventFormModel.endValuesProperty());
        eventFormModel.currentStartProperty().bind(startInput.valueProperty());
    }

    private void initializeFormBindings() {
        headerText.textProperty().bind(eventModel.nameProperty());

        idInput.textProperty().bind(eventModel.idProperty());

        startInput.valueProperty().bindBidirectional(eventModel.startProperty());

        dateInput.valueProperty().bindBidirectional(eventModel.dateProperty());

        nameInput.textProperty().bindBidirectional(eventModel.nameProperty());

        notesInput.textProperty().bindBidirectional(eventModel.notesProperty());

        cityInput.textProperty().bindBidirectional(eventModel.cityProperty());

        zipInput.textProperty().bindBidirectional(eventModel.zipProperty());

        streetInput.textProperty().bindBidirectional(eventModel.streetProperty());

        streetNumberInput.textProperty().bindBidirectional(eventModel.streetNumberProperty());

        endInput.valueProperty().bindBidirectional(eventModel.endProperty());

        participantsInput.textProperty().bindBidirectional(eventModel.participantsProperty());

        privateInput.selectedProperty().bindBidirectional(eventModel.privateFlagProperty());
    }

    private void unbindForm() {
        headerText.textProperty().unbind();

        idInput.textProperty().unbind();

        startInput.valueProperty().unbindBidirectional(eventModel.startProperty());

        dateInput.valueProperty().unbindBidirectional(eventModel.dateProperty());

        nameInput.textProperty().unbindBidirectional(eventModel.nameProperty());

        notesInput.textProperty().unbindBidirectional(eventModel.notesProperty());

        cityInput.textProperty().unbindBidirectional(eventModel.cityProperty());

        zipInput.textProperty().unbindBidirectional(eventModel.zipProperty());

        streetInput.textProperty().unbindBidirectional(eventModel.streetProperty());

        streetNumberInput.textProperty().unbindBidirectional(eventModel.streetNumberProperty());

        endInput.valueProperty().unbindBidirectional(eventModel.endProperty());

        participantsInput.textProperty().unbindBidirectional(eventModel.participantsProperty());

        privateInput.selectedProperty().unbindBidirectional(eventModel.privateFlagProperty());
    }

    private void initializeEventHandlers() {
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
        LOGGER.info("OnSave: {}", eventModel);
        for (SaveListener listener : saveListeners) {
            listener.onSave(eventModel);
        }
        SimpleEventBus.get().publish(new StatusEvent("Save done!"));
    }

    /**
     * Cancels the current editing
     */
    private void cancel() {
        LOGGER.info("cancel");
        SimpleEventBus.get().publish(new StatusEvent("Cancel done!"));
    }


    /**
     * Resets the current input
     */
    private void reset() {
        LOGGER.info("reset");

        this.eventModel.reset();
        SimpleEventBus.get().publish(new StatusEvent("Reset done!"));
    }

    /**
     * Adds a save listener to this component. All save listeners will be informed if the user
     * wants to save the form.
     *
     * @param listener callback for the save event
     */
    public void addSaveListener(SaveListener listener) {
        this.saveListeners.add(listener);
    }


    public void setEvent(EventModel eventModel) {
        unbindForm();
        this.eventModel = eventModel;
        initializeFormBindings();
    }
}
