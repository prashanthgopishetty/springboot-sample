package com.example.rest.service;

import com.example.rest.dao.DaySheetRepository;
import com.example.rest.model.DaySheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaySheetService implements  IDaySheetService{

    @Autowired
    DaySheetRepository daySheetRepository;

    @Override
    public List<DaySheet> getAll() {
        return daySheetRepository.findAll();
    }
}
