package com.crossover.techtrial.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.stereotype.Repository;

import com.crossover.techtrial.dto.DailyElectricity;
import com.crossover.techtrial.model.HourlyElectricity;

@Repository
class DailyElectGeneratedImpl implements DailyElectGenerated {

	  private final EntityManager em;

	  @Autowired
	  public DailyElectGeneratedImpl(JpaContext context) {
	    this.em = context.getEntityManagerByManagedType(HourlyElectricity.class);
	   
	  }
	  
	  public List<DailyElectricity> getDailyElectGenerated(String idPanel) {
		  	List<DailyElectricity> dailyElectricityGenerated = new ArrayList();
	        String queryStr = "select reading_at date, sum(generated_electricity) sum, max(generated_electricity) max, min(generated_electricity) min, avg(generated_electricity) average from hourly_electricity  where reading_at < CURDATE() and panel_id = ?1 group by reading_at"; 

	        
	        try {
	            Query query = em.createNativeQuery(queryStr);
	            query.setParameter(1, idPanel);
	            List<Object[]> listing = query.getResultList();
	           for (Object[] objects : listing) {
	        	   DailyElectricity	de	=	new DailyElectricity();
	        	   
	        	   de.setDate((objects[0]).toString());
	        	   de.setSum((objects[1]).toString());
	        	   de.setMax((objects[2]).toString());
	        	   de.setMin((objects[3]).toString());
	        	   de.setAverage((objects[4]).toString());
	        	   dailyElectricityGenerated.add(de);
			}
	            



	           return dailyElectricityGenerated;
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw e;
	        }
	    }

	 
	}