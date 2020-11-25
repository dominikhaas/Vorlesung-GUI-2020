package de.throsenheim.gui.events.business.event.api;

import java.util.Set;

public interface EventService {
    Set<EventDto> loadEvents();
}
