package de.throsenheim.gui.events.business.event.api;

import java.time.LocalDate;

/**
 * Sample Data Transfer Object
 */
public class EventDto {
    private  String id;
    private  String name;

    private LocalDate date;
    private  Integer start;
    private  Integer end;

    private  String participants;
    private  boolean privateFlag;
    private  String street;
    private  String streeNumber;
    private  String zip;
    private  String city;
    private  String notes;

    public EventDto(String id, String name, LocalDate date, Integer start, Integer end, String participants, boolean privateFlag, String street, String streeNumber, String zip, String city, String notes) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.start = start;
        this.end = end;
        this.participants = participants;
        this.privateFlag = privateFlag;
        this.street = street;
        this.streeNumber = streeNumber;
        this.zip = zip;
        this.city = city;
        this.notes = notes;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

    public String getParticipants() {
        return participants;
    }

    public boolean isPrivateFlag() {
        return privateFlag;
    }

    public String getStreet() {
        return street;
    }

    public String getStreeNumber() {
        return streeNumber;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getNotes() {
        return notes;
    }
}
