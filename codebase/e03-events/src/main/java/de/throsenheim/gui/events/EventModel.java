package de.throsenheim.gui.events;

import javafx.beans.property.*;

import java.time.LocalDate;

/**
 * Model for events (event in the meaning of eventFX's business logic, not JavaFX event!)
 *
 * @author dominik.haas
 */
public class EventModel {
    private String id;
    private String name;

    private LocalDate date;
    private Integer start;
    private Integer end;

    private String participants;
    private Boolean privateFlag;

    private String street;
    private String streetNumber;

    private String zip;
    private String city;

    private String notes;

    /**
     *  Constructor for events - this initialies the immutable id
     */
    public EventModel() {
        id = java.util.UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getStartHour() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public Boolean getPrivateFlag() {
        return privateFlag;
    }

    public void setPrivateFlag(Boolean privateFlag) {
        this.privateFlag = privateFlag;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
}
