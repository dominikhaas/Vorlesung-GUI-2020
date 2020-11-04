package de.throsenheim.gui.events.event;

import javafx.beans.property.*;

import java.time.LocalDate;

/**
 * Model for events (event in the meaning of eventFX's business logic, not JavaFX event!)
 *
 * @author dominik.haas
 */
public class EventModel {
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();

    private ObjectProperty<LocalDate> date = new SimpleObjectProperty<>();
    private ObjectProperty<Integer> start = new SimpleObjectProperty<>();
    private ObjectProperty<Integer> end = new SimpleObjectProperty<>();

    private StringProperty participants = new SimpleStringProperty();
    private BooleanProperty privateFlag = new SimpleBooleanProperty();

    private StringProperty street = new SimpleStringProperty();
    private StringProperty streetNumber = new SimpleStringProperty();

    private StringProperty zip = new SimpleStringProperty();
    private StringProperty city = new SimpleStringProperty();

    private StringProperty notes = new SimpleStringProperty();

    /**
     *  Constructor for events - this initialies the immutable id
     */
    public EventModel() {
        id.set(java.util.UUID.randomUUID().toString());
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public LocalDate getDate() {
        return date.get();
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
    }

    public Integer getStart() {
        return start.get();
    }

    public ObjectProperty<Integer> startProperty() {
        return start;
    }

    public void setStart(Integer start) {
        this.start.set(start);
    }

    public Integer getEnd() {
        return end.get();
    }

    public ObjectProperty<Integer> endProperty() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end.set(end);
    }

    public String getParticipants() {
        return participants.get();
    }

    public StringProperty participantsProperty() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants.set(participants);
    }

    public Boolean getPrivateFlag() {
        return privateFlag.get();
    }

    public BooleanProperty privateFlagProperty() {
        return privateFlag;
    }

    public void setPrivateFlag(Boolean privateFlag) {
        this.privateFlag.set(privateFlag);
    }

    public String getStreet() {
        return street.get();
    }

    public StringProperty streetProperty() {
        return street;
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public String getStreetNumber() {
        return streetNumber.get();
    }

    public StringProperty streetNumberProperty() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber.set(streetNumber);
    }

    public String getZip() {
        return zip.get();
    }

    public StringProperty zipProperty() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip.set(zip);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getNotes() {
        return notes.get();
    }

    public StringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    @Override
    public String toString() {
        return "EventModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", start=" + start +
                ", end=" + end +
                ", participants='" + participants + '\'' +
                ", privateFlag=" + privateFlag +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

    public void reset() {
        this.nameProperty().set(null);
        //....
    }
}
