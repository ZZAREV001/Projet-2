package com.hemebiotech.analytics;

import java.io.Serializable;

public class FilesSymptomsAnalyzer implements Serializable {

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMachId() {
        return machId;
    }

    public void setMachId(String machId) {
        this.machId = machId;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    //instance variables
    private String timestamp;
    private String machId;
    private String sensorType;


    public static void configure() throws ClassNotFoundException {


    }
}
