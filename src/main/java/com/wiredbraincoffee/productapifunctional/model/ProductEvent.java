package com.wiredbraincoffee.productapifunctional.model;

import java.util.Objects;

public class ProductEvent {

    private Long eventId;

    private String eventType;

    public ProductEvent(Long eventId, String eventType) {
        this.eventId = eventId;
        this.eventType = eventType;
    }

    public ProductEvent() {

    }

    @Override
    public String toString() {
        return "ProductEvent{" +
                "eventId=" + eventId +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductEvent)) return false;
        ProductEvent that = (ProductEvent) o;
        return Objects.equals(getEventId(), that.getEventId()) &&
                Objects.equals(getEventType(), that.getEventType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEventId(), getEventType());
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
