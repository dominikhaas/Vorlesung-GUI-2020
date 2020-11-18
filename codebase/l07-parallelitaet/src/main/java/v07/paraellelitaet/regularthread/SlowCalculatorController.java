/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v07.paraellelitaet.regularthread;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FXML Controller class
 *
 * @author dominik.haas
 */
public class SlowCalculatorController implements Initializable {

    @FXML
    private Label resultLabel;

    @FXML
    private Button goButton;

    @FXML
    private Button resetButton;

    private SlowCalculatorModel model = new SlowCalculatorModel();

    private static final Logger LOGGER = LoggerFactory.getLogger(SlowCalculatorController.class);


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        resultLabel.textProperty().bind(model.resultProperty());

        goButton.setOnAction((event) -> {
            LOGGER.info("Event handler running in thread {}", Thread.currentThread().getName());
            new Thread(() -> {
                LOGGER.info("Thread start");
                String result = calculate();
                LOGGER.info("Calculate done");

                Platform.runLater(() -> {
                    updateUi(result);
                });

                LOGGER.info("Thread end");
            }).start();
        });

        resetButton.setOnAction((event) -> {
            model.reset();
        });

    }

    private void updateUi(String result) {
        LOGGER.info("updateUi running in thread {}", Thread.currentThread().getName());
        //only allowed in JavaFX main thread
        model.setResult(result);
    }

    private String calculate() {
        LOGGER.info("Calculate running in thread {}", Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "4";
    }

}
