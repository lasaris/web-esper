package cz.muni.fgdovin.bachelorthesis.web;

/**
 * Created by Filip Gdovin on 26. 3. 2015.
 */
public class EventTypeModel {

    private String eventType;
    private String properties;

    public EventTypeModel() {
    }

    public EventTypeModel(String eventType, String properties) {
        this.eventType = eventType;
        this.properties = properties;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}