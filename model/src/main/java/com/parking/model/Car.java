package com.parking.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class Car {
   // @Id
   // @GeneratedValye(strategy = GenerationType.Auto)
    Long carId;
    private String carName;
    private String carNumber;
    private String nameCarDriver;
    Integer carPlace;
    //@DateTimeFormat (pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDate dayEnter;

    public Car(Long carId, String carName, String carNumber, String nameCarDriver, Integer carPlace, LocalDate dayEnter) {
        this.carId = carId;
        this.carName = carName;
        this.carNumber = carNumber;
        this.nameCarDriver = nameCarDriver;
        this.carPlace = carPlace;
        this.dayEnter = dayEnter;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getNameCarDriver() {
        return nameCarDriver;
    }

    public void setNameCarDriver(String nameCarDriver) {
        this.nameCarDriver = nameCarDriver;
    }

    public Integer getCarPlace() {
        return carPlace;
    }

    public void setCarPlace(Integer carPlace) {
        this.carPlace = carPlace;
    }

    public LocalDate getDayEnter() {
        return dayEnter;
    }

    public void setDayEnter(LocalDate dayEnter) {
        this.dayEnter = dayEnter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", nameCarDriver='" + nameCarDriver + '\'' +
                ", carPlace=" + carPlace +
                ", dayEnter=" + dayEnter +
                '}';
    }
}

