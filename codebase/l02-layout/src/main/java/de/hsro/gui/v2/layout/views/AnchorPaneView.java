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
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author weigend
 */
public class AnchorPaneView extends AnchorPane {

    public AnchorPaneView() {
        Button b1 = new Button("1");
        AnchorPane.setTopAnchor(b1, 10.0);
        AnchorPane.setLeftAnchor(b1, 10.0);
        AnchorPane.setRightAnchor(b1, 65.0);
        Button b2 = new Button("2");
        AnchorPane.setLeftAnchor(b2, 20.0);
        super.getChildren().addAll(b1, b2);
    }
    
}
