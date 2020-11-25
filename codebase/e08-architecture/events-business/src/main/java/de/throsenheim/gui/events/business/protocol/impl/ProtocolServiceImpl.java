package de.throsenheim.gui.events.business.protocol.impl;

import de.throsenheim.gui.events.business.protocol.api.ProtocolEntryDto;
import de.throsenheim.gui.events.business.protocol.api.ProtocolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtocolServiceImpl implements ProtocolService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProtocolServiceImpl.class);

    @Override
    public void writeProtocol(ProtocolEntryDto entry) {
        LOGGER.info(entry.toString());
    }
}
