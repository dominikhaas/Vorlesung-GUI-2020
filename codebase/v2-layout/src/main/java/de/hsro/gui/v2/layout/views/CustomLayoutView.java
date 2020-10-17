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

/**
 *
 * @author weigend
 */
public class CustomLayoutView extends CustomLayoutPane {

    public CustomLayoutView() {
        super.getChildren().add(new Button("1"));
        super.getChildren().add(new Button("=2="));
        super.getChildren().add(new Button("===3==="));
        super.getChildren().add(new Button("====4===="));
        super.getChildren().add(new Button("=====5====="));
    }
    
}
