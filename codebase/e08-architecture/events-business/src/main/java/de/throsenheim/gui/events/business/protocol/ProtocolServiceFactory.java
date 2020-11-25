package de.throsenheim.gui.events.business.protocol;

import de.throsenheim.gui.events.business.protocol.api.ProtocolService;
import de.throsenheim.gui.events.business.protocol.impl.ProtocolServiceImpl;

public class ProtocolServiceFactory {
    public static ProtocolService getProtocolService() {
        return new ProtocolServiceImpl();
    }
}
