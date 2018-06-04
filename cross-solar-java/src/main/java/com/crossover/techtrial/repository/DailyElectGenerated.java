package com.crossover.techtrial.repository;

import java.util.List;

import com.crossover.techtrial.dto.DailyElectricity;

public interface DailyElectGenerated {
	List<DailyElectricity> getDailyElectGenerated(String idPanel);

}
