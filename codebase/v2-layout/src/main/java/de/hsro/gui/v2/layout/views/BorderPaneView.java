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
package de.hsro.gui.v2.layout.views;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author weigend
 */
public class BorderPaneView extends BorderPane {

    public BorderPaneView() {
        bottomProperty().set(new Button("Bottom"));
        topProperty().set(new Button("Top")); 
        leftProperty().set(new Button("Left")); 
        rightProperty().set(new Button("Right")); 
        Button button = new Button("Center");
        button.setMaxWidth(Double.POSITIVE_INFINITY);
        button.setMaxHeight(Double.POSITIVE_INFINITY);
        centerProperty().set(button);
    }
    
}
