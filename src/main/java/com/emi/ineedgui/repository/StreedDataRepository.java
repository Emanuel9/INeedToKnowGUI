package com.emi.ineedgui.repository;

import com.emi.ineedgui.model.StreetData;
import com.emi.ineedgui.model.StreetDataKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreedDataRepository extends CassandraRepository<StreetData, StreetDataKey> {

    List<StreetData> findAllByKey_StreetAndKeyCategory(String street, String category);
}
