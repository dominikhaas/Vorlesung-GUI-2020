module de.throsenheim.gui.architektur.exercise.customer.gui {
    requires de.throsenheim.gui.architektur.exercise.customer.business;

    requires  javafx.fxml;
    requires  javafx.controls;

    uses de.throsenheim.gui.architektur.exercise.customer.business.api.CustomerService;

    opens de.throsenheim.gui.architektur.exercise.customer.gui;

}

