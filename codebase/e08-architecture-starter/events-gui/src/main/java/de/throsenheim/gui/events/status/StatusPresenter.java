package de.throsenheim.gui.events.status;

import de.throsenheim.gui.events.eventbus.EventBusListener;
import de.throsenheim.gui.events.eventbus.SimpleEventBus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class StatusPresenter implements Initializable {
    @FXML
    private Text statusText;

    private StatusModel model = new StatusModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        statusText.textProperty().bind(model.messageProperty());

        SimpleEventBus.get().subscribe(StatusEvent.class, event -> {
            model.setMessage(event.getMessage());
        });
    }
}
