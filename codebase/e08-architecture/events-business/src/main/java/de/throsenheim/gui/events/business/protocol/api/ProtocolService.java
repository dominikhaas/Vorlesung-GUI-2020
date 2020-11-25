package de.throsenheim.gui.events.business.protocol.api;

import java.time.LocalDate;

public interface ProtocolService {
    void writeProtocol(ProtocolEntryDto entry);
}
