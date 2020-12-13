package com.example.rest.dao;

import com.example.rest.model.DaySheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaySheetRepository extends JpaRepository<DaySheet, Long> {
}
