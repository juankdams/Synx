package plugin.event;

public final class Event {

    private final EventType eventType;
    private final EventInformation information;
    private final Object source;

    public Event(EventType eventType, Object source, EventInformation information) {
        this.eventType = eventType;
        this.information = information;
        this.source = source;
    }

    public EventType getEventType() {
        return eventType;
    }

    public EventInformation getInformation() {
        return information;
    }

    public Object getSource() {
        return source;
    }

}
