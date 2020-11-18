package de.throsenheim.gui.events.eventform;

import de.throsenheim.gui.events.event.EventModel;

/**
 * Simple custom listener interface to display basic component interaction
 */
public interface SaveListener {

    /**
     * This method is called if the form should be saved
     *
     * @param event the event that should be saved
     */
    void onSave(EventModel event);
}
