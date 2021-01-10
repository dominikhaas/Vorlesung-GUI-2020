/*
 * _____________________________________________________________________________
 *
 *           Project:    GUI 2015
 * _____________________________________________________________________________
 *
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2015
 * _____________________________________________________________________________
 *
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________
 */
package de.fhro.gui.v3.login;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Login.
 *
 * @author weigend
 */
public class LoginController implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @FXML
    private GridPane loginViewPane;

    @FXML
    private TextField userInput;
    @FXML
    private PasswordField passwordInput;

    @FXML
    private Button loginButton;


    public LoginController() {
        LOGGER.info("LoginController#constructor - start");
        LOGGER.info("LoginController#constructor - Button: {}", loginButton);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LOGGER.info("LoginController#initialize - start");

        LOGGER.info("LoginController#initialize - Button: {}", loginButton);

        loginButton.setOnAction((e) -> {
            LOGGER.info("loginButton on action");
            login();
        });

        loginViewPane.addEventHandler(KeyEvent.ANY, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                LOGGER.info("loginViewPane key event");
                updateLoginButtonState();
            }
        });
        updateLoginButtonState();

        LOGGER.info("LoginController#initialize - end");
    }

    private void login() {
        LOGGER.info("LoginController#login - {}:####", userInput.getText());
    }

    private void updateLoginButtonState() {
        loginButton.setDisable(!isValidUser() || !isValidPassword());
    }

    private boolean isValidUser() {
        return isValidTextInput(userInput.getText());
    }

    private boolean isValidPassword() {
        return isValidTextInput(passwordInput.getText());
    }

    private boolean isValidTextInput(String textValue) {
        return textValue.matches("[a-zA-Z0-9]{6}[a-zA-Z0-9]*");
    }
}
