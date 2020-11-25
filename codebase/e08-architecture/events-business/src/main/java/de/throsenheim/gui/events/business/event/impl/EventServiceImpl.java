package de.throsenheim.gui.events.business.event.impl;


import de.throsenheim.gui.events.business.event.api.EventDto;
import de.throsenheim.gui.events.business.event.api.EventService;
import de.throsenheim.gui.events.business.protocol.ProtocolServiceFactory;
import de.throsenheim.gui.events.business.protocol.api.ProtocolEntryDto;
import de.throsenheim.gui.events.business.protocol.api.ProtocolService;
import de.throsenheim.gui.events.dataaccess.EventDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Sample implementation for a business service - very basic
 */
public class EventServiceImpl implements EventService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventServiceImpl.class);

    //hard coded dao - you should use Dependency Injection
    private EventDao dao = new EventDao();

    private ProtocolService protocolService = ProtocolServiceFactory.getProtocolService();

    @Override
    public Set<EventDto> loadEvents() {
        LOGGER.info("Loading all events...");
        protocolService.writeProtocol(new ProtocolEntryDto("Load all events"));

        return dao.queryAllEvents().stream().map((e) -> new EventDto(
                e.getId(),
                e.getName(),
                e.getDate(),
                e.getStart(),
                e.getEnd(),
                e.getParticipants(),
                e.isPrivateFlag(),
                e.getStreet(),
                e.getStreeNumber(),
                e.getZip(),
                e.getCity(),
                e.getNotes()
        )).collect(Collectors.toSet());
    }
}
