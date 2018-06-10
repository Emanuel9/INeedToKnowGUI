package com.emi.ineedgui.jackson;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.format.DateTimeFormatter;

public class ISO8601LocalDateTimeSerializer extends LocalDateTimeSerializer {

    @Override
    protected DateTimeFormatter _defaultFormatter() {
        return DateTimeFormatter.ISO_DATE_TIME;
    }
}
