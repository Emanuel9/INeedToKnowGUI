package com.emi.ineedgui.service;

import com.emi.ineedgui.model.StreetData;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emi.ineedgui.repository.StreedDataRepository;

import java.util.List;


@Service
public class StreetDataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StreetDataService.class);

    @Autowired
    private StreedDataRepository streetDataRepository;

    public List<StreetData> getStreetData( String street, String category ) {
        return streetDataRepository.findAllByKey_StreetAndKeyCategory(street, category);
    }
}
