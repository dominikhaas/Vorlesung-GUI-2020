package de.throsenheim.gui.events.eventbus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Very basic implementation of the event bus that is implemented as singleton.
 *
 * @author dominik.haas
 */
public class SimpleEventBus implements EventBus{

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleEventBus.class);
    private static final SimpleEventBus INSTANCE = new SimpleEventBus();

    private final Map<Class<?>, Set<EventBusListener<?>>> subscriptions = new HashMap<>();

    //singleton implementation
    private SimpleEventBus() {
    }

    @Override
    public <T> void subscribe(Class<T> type, EventBusListener<T> listener) {
        if(!subscriptions.containsKey(type)) {
            subscriptions.put(type, new HashSet<>());
        }

        subscriptions.get(type).add(listener);
    }

    @Override
    public void publish(Object event) {
        Class<?> eventClass = event.getClass();

        if(subscriptions.containsKey(eventClass)) {
            for (EventBusListener listener: subscriptions.get(eventClass)) {
                listener.eventPublished(event);
            }
        } else {
            LOGGER.warn("No listeners for event class {} registered!", eventClass);
        }
    }

    public static SimpleEventBus get() {
        return INSTANCE;
    }
}
