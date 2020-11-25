package de.throsenheim.gui.events;

import de.throsenheim.gui.events.event.EventModel;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Events main model backing the events main dialog.
 */
public class EventsMainModel {
    private ListProperty<EventModel> events = new SimpleListProperty<>(FXCollections.observableList(new ArrayList<>()));

    public ObservableList<EventModel> getEvents() {
        return events.get();
    }

    public ListProperty<EventModel> eventsProperty() {
        return events;
    }

    public void addEvent(EventModel event) {
        getEvents().add(event);
    }

    public void setEvents(List<EventModel> events) {
        this.events.set(FXCollections.observableList(new ArrayList<>(events)));
    }
}
