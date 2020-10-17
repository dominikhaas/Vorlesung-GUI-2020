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

import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * Simple Layout for positioning nodes in a straight line (45 degree)
 * @author weigend
 */
public class CustomLayoutPane extends Pane {

    @Override
    protected void layoutChildren() {
        int pos = 0;
        for (Node node : super.getChildren()) {
            node.autosize();
            node.relocate(pos, pos);
            pos += 30;
        }
    }
    
    @Override
    protected double computePrefWidth(double width) {
        return 30 * super.getChildren().size();
    }

    @Override
    protected double computePrefHeight(double width) {
        return 30 * super.getChildren().size();
    }
    
    @Override
    protected double computeMinWidth(double height) {
        return 0;
    }
    @Override
    protected double computeMinHeight(double height) {
        return 0;
    }

    @Override
    protected double computeMaxHeight(double width) {
        return Double.MAX_VALUE;
    }
    
    @Override
    protected double computeMaxWidth(double width) {
        return Double.MAX_VALUE;
    }
       
}
