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
import javafx.scene.layout.TilePane;

/**
 *
 * @author weigend
 */
public class TilePaneView extends TilePane {

    public TilePaneView() {
        super.setPrefColumns(2);
        ObservableList<Node> children = super.getChildren();
        children.add(new Button("1"));
        children.add(new Button("=2="));
        children.add(new Button("===3==="));
        children.add(new Button("====4===="));
        children.add(new Button("=====5====="));      
    }   
}
