package unsorted;

import jdk.jfr.Event;
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

    @Override
    public Set<EventDto> loadEvents() {
        LOGGER.info("Loading all events...");
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
