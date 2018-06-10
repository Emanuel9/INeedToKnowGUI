package com.emi.ineedgui.rest;

import com.emi.ineedgui.model.StreetData;
import com.emi.ineedgui.service.StreetDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreetDataController {

    @Autowired
    private StreetDataService streetDataService;

    @GetMapping(value = "/api/street_data", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StreetData> getStreetData(@RequestParam String street, @RequestParam String category) {
        return streetDataService.getStreetData(street, category);
    }
}
