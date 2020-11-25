package de.throsenheim.gui.events.eventform;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Model for the event form - contains the 'selectable values'.
 */
public class EventFormModel {
    private final ListProperty<Integer> startValues = new SimpleListProperty<>(FXCollections.observableArrayList());
    private final ListProperty<Integer> endValues = new SimpleListProperty<>(FXCollections.observableArrayList());

    private final ObjectProperty<Integer> currentStart = new SimpleObjectProperty<>();

    public EventFormModel() {
        //initialize values (two different ways)
        List<Integer> startValues = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            startValues.add(i);
        }
        this.startValues.set(FXCollections.observableList(startValues));

        updateEndValues(0);

        //register changelistener
        currentStart.addListener((observable, oldValue, newValue) -> {
            updateEndValues(newValue != null?newValue:0);
        });
    }

    private void updateEndValues(int start) {
        Integer[] endValuesArray = IntStream.rangeClosed(start, 23).boxed().toArray(Integer[]::new);
        endValues.set(FXCollections.observableArrayList(endValuesArray));
    }

    public ObservableList<Integer> getStartValues() {
        return startValues.get();
    }

    public ListProperty<Integer> startValuesProperty() {
        return startValues;
    }

    public ObservableList<Integer> getEndValues() {
        return endValues.get();
    }

    public ListProperty<Integer> endValuesProperty() {
        return endValues;
    }

    public Integer getCurrentStart() {
        return currentStart.get();
    }

    public ObjectProperty<Integer> currentStartProperty() {
        return currentStart;
    }
}
