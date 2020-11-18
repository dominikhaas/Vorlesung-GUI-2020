package de.throsenheim.gui.events.eventbus;

/**
 *  Sinmple event bus interface
 *
 * @author dominik.haas
 */
public interface EventBus {

    /**
     * Subscribe for a given type of event. The type is not polymorphic.
     * You have to make a separate subscription for every concrete type.
     *
     * @param type the event type to subscribe.
     * @param listener your listener, which will be called if a event happens.
     */
    <T> void subscribe(Class<T> type, EventBusListener<T> listener);

    /**
     * Publish an event to all registered listeners.
     * The event is dispatched with event.getClass() as type/key.
     *
     * @param event the event.
     */
    void publish(Object event);
}
