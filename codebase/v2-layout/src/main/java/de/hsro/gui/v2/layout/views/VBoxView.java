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

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author weigend
 */
public class VBoxView extends VBox {

    public VBoxView() {
        ObservableList<Node> children = super.getChildren();
        children.add(new Button("1"));
        children.add(new Button("2"));
        children.add(new Button("3"));
        children.add(new Button("4"));
        children.add(new Button("5"));
    }
    
}
