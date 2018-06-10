package com.emi.ineedgui.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("street_data")
public class StreetData {

    @PrimaryKey
    private StreetDataKey key;

    @Column("description")
    private String description;

    @Column("latitude")
    private Double latitude;

    @Column("longitude")
    private Double longitude;

    public StreetData() {}

    public StreetDataKey getKey() {
        return key;
    }

    public void setKey(StreetDataKey key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "StreetData{" +
                "streetDataKey=" + key +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
