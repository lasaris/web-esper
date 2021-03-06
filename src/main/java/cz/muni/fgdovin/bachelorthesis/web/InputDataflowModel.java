package cz.muni.fgdovin.bachelorthesis.web;

/**
 * Model class to represent input dataflow,
 * which is needed by Spring for binding.
 *
 * @author Filip Gdovin
 * @version 26. 3. 2015
 */
public class InputDataflowModel {

    private String dataflowName;
    private String eventType;
    private String queueName;

    public InputDataflowModel() {
    }

    public InputDataflowModel(String dataflowName, String eventType, String queueName) {
        this.dataflowName = dataflowName;
        this.eventType = eventType;
        this.queueName = queueName;
    }

    public String getDataflowName() {
        return dataflowName;
    }

    public void setDataflowName(String dataflowName) {
        this.dataflowName = dataflowName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
}
