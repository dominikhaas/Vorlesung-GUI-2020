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
import javafx.scene.layout.GridPane;

/**
 *
 * @author weigend
 */
public class GridPaneView extends GridPane {

    public GridPaneView() {
        super.add(new Button("=1="), 0, 0);
        super.add(new Button("==2=="), 1, 0);
        super.add(new Button("===3==="), 0, 1);
        super.add(new Button("====4===="), 1, 1);
    }

}
