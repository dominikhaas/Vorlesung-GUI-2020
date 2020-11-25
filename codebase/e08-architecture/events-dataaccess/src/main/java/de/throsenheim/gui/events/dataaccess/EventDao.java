package de.throsenheim.gui.events.dataaccess;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Sample Data Access Object - simple dummy implementation with hard coded events
 * This could be replaced with some real database access.
 */
public class EventDao {

    private Set<EventEt> events = new HashSet<>();

    public EventDao() {
        EventEt event = new EventEt();
        event.setId("id1");
        event.setName("Vogel Bingo");
        event.setDate(LocalDate.now());
        event.setStart(11);
        events.add(event);

        event = new EventEt();
        event.setId("id2");
        event.setName("Remote Meetup Cloud");
        event.setDate(LocalDate.now());
        event.setStart(15);
        events.add(event);

        event = new EventEt();
        event.setId("id3");
        event.setName("Run together");
        event.setDate(LocalDate.now());
        event.setStart(19);
        events.add(event);

        event = new EventEt();
        event.setId("id4");
        event.setName("Bundesliga");
        event.setDate(LocalDate.now());
        event.setStart(23);
        events.add(event);
    }

    public Set<EventEt> queryAllEvents() {
        return events;
    }
}
