package com.crossover.techtrial.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;

/**
 * DailyElectricity class will hold sum, average,minimum and maximum electricity for a given day.
 * @author Crossover
 *
 */

public class DailyElectricity implements Serializable {
  
  private static final long serialVersionUID = 3605549122072628877L;

  private String date;
  
  private String sum;
  
  private String average;
  
  private String min;
  
  private String max;
  
  

  public DailyElectricity() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
/*
public DailyElectricity(LocalDate date, Long sum, Long average, Long min, Long max) {
	super();
	this.date = date;
	this.sum = sum;
	this.average = average;
	this.min = min;
	this.max = max;
}*/



public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getSum() {
    return sum;
  }

  public void setSum(String sum) {
    this.sum = sum;
  }

  public String getAverage() {
    return average;
  }

  public void setAverage(String average) {
    this.average = average;
  }

  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  @Override
  public String toString() {
    return "DailyElectricity [date=" + date + ", sum=" + sum + ", average="
        + average + ", min=" + min + ", max=" + max + "]";
  }

}
