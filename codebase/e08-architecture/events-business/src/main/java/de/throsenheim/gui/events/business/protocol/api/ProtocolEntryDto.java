package de.throsenheim.gui.events.business.protocol.api;

import java.time.LocalTime;

public class ProtocolEntryDto {
    private final LocalTime timestamp;
    private final String message;

    public ProtocolEntryDto(String message) {
        timestamp = LocalTime.now();
        this.message = message;
    }

    public LocalTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ProtocolEntry{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }
}
