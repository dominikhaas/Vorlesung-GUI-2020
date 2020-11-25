import de.throsenheim.gui.events.business.event.api.EventService;

module de.throsenheim.gui.events.gui {
    requires de.throsenheim.gui.events.business;

    requires  javafx.controls;
    requires  javafx.fxml;
    requires org.slf4j;

    opens de.throsenheim.gui.events;
    opens de.throsenheim.gui.events.eventform;
    opens de.throsenheim.gui.events.status;
    opens de.throsenheim.gui.events.event;

    uses EventService;
}
