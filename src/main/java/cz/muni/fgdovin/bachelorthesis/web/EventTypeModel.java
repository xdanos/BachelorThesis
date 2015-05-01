package cz.muni.fgdovin.bachelorthesis.web;

import java.util.List;

/**
 * Model class to represent event type,
 * which is needed by Spring for binding.
 * List of Property is used so Spring
 * can fill it from user-filled form.
 * @author Filip Gdovin
 * @version 26. 3. 2015
 */
public class EventTypeModel {

    private String eventType;
    private String properties;
    private List<Property> listProp;  //TODO figure out for map :/

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

    public List<Property> getListProp() {
        return listProp;
    }

    public void setListProp(List<Property> listProp) {
        this.listProp = listProp;
    }
}
