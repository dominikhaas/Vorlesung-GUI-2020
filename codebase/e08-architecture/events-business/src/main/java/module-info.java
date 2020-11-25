import de.throsenheim.gui.events.business.event.api.EventService;
import de.throsenheim.gui.events.business.event.impl.EventServiceImpl;

module de.throsenheim.gui.events.business {
    exports de.throsenheim.gui.events.business.event.api;

    requires de.throsenheim.gui.events.dataaccess;
    requires org.slf4j;

    provides EventService with EventServiceImpl;
}
