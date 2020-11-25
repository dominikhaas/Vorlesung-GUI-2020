package de.throsenheim.gui.events.eventbus;

/**
 * Interface for an event listener (event bus) - the callback interface.
 */
public interface EventBusListener<T> {

    /**
     * Method will be called by the bus if an event with matching type (subscription) is published.
     *
     * @param event the event.
     */
    void eventPublished(T event);
}
