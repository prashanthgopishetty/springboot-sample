package com.example.rest.controller;

import com.example.rest.model.Accounts;
import com.example.rest.model.DaySheet;
import com.example.rest.service.IDaySheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/daysheet")
public class DaySheetController {

    @Autowired
    IDaySheetService daySheetService;

    @GetMapping(path="/", produces = "application/json")
    public List<DaySheet> getAll()
    {
        return daySheetService.getAll();
    }

}
