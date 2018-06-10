package com.emi.ineedgui.jackson;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import java.time.format.DateTimeFormatter;

public class ISO8601LocalDateTimeDeserializer extends LocalDateTimeDeserializer {

    public ISO8601LocalDateTimeDeserializer() {
        super(DateTimeFormatter.ISO_DATE_TIME);
    }
}
