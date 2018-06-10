package com.emi.ineedgui.model;

import com.emi.ineedgui.jackson.ISO8601LocalDateTimeDeserializer;
import com.emi.ineedgui.jackson.ISO8601LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.time.LocalDateTime;

@PrimaryKeyClass
public class StreetDataKey implements Serializable {

    @PrimaryKeyColumn(name = "street", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String street;

    @PrimaryKeyColumn(name = "category", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String category;

    @PrimaryKeyColumn(name = "import_date", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @JsonDeserialize(using = ISO8601LocalDateTimeDeserializer.class)
    @JsonSerialize(using = ISO8601LocalDateTimeSerializer.class)
    private LocalDateTime importDate;


    public StreetDataKey() {}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDateTime importDate) {
        this.importDate = importDate;
    }

    @Override
    public String toString() {
        return "StreetDataKey{" +
                "street='" + street + '\'' +
                ", category='" + category + '\'' +
                ", importDate=" + importDate +
                '}';
    }
}
