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
package de.hsro.gui.v2.layout;

import de.hsro.gui.v2.layout.views.CustomLayoutView;
import de.hsro.gui.v2.layout.views.TilePaneView;
import de.hsro.gui.v2.layout.views.AnchorPaneView;
import de.hsro.gui.v2.layout.views.GridPaneView;
import de.hsro.gui.v2.layout.views.BorderPaneView;
import de.hsro.gui.v2.layout.views.FlowPaneView;
import de.hsro.gui.v2.layout.views.HBoxView;
import de.hsro.gui.v2.layout.views.VBoxView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author weigend
 */
public class V2LayoutApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        TabPane root = new TabPane();
        Tab tab = new Tab("BorderPane");
        root.getTabs().add(tab);
        tab.setContent(new BorderPaneView());

        tab = new Tab("FlowPane");
        root.getTabs().add(tab);
        tab.setContent(new FlowPaneView());

        tab = new Tab("HBox");
        root.getTabs().add(tab);
        tab.setContent(new HBoxView());

        tab = new Tab("VBox");
        root.getTabs().add(tab);
        tab.setContent(new VBoxView());

        tab = new Tab("GridPane");
        root.getTabs().add(tab);
        tab.setContent(new GridPaneView());
        
        tab = new Tab("TilePane");
        root.getTabs().add(tab);
        tab.setContent(new TilePaneView());
        
        tab = new Tab("AnchorPane");
        root.getTabs().add(tab);
        tab.setContent(new AnchorPaneView());
        
        tab = new Tab("CustomPane");
        root.getTabs().add(tab);
        tab.setContent(new CustomLayoutView());
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
