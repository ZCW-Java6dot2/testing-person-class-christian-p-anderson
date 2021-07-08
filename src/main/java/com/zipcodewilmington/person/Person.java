package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isFemale;
    private short numberOfCars;
    private char marriedOrSingle;
    private float salary;
    private Double milesToWork;
    private long insuranceLimits;
/*
    private long
*/


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.isFemale = true;
        this.numberOfCars = 0;
        this.marriedOrSingle = 's';
        this.salary = 0.00f;
        this.milesToWork = Double.valueOf(0);
        this.insuranceLimits = 0;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Boolean isFemale) {
        this.isFemale = isFemale;
    }

    public Person(Short numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public Person(char marriedOrSingle) {
        this.marriedOrSingle = marriedOrSingle;
    }

    public Person(float salary) {
        this.salary = salary;
    }

    public Person(Double milesToWork) {
        this.milesToWork = milesToWork;
    }

    public Person(long insuranceLimits) {
        this.insuranceLimits = insuranceLimits;
    }

    public Person(String name, int age, boolean isFemale, Short numberOfCars, char marriedOrSingle, float salary, Double milesToWork, long insuranceLimits) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.numberOfCars = numberOfCars;
        this.marriedOrSingle = marriedOrSingle;
        this.salary = salary;
        this.milesToWork = milesToWork;
        this.insuranceLimits = insuranceLimits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsFemale(Boolean isFemale) {
        this.isFemale = isFemale;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Boolean getIsFemale() {
        return this.isFemale;
    }

    public Short getNumberOfCars() {
        return this.numberOfCars;
    }

    public void setNumberOfCars(Short numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public Character getMarriedOrSingle() {
        return this.marriedOrSingle;
    }

    public void setMarriedOrSingle(Character marriedOrSingle) {
        this.marriedOrSingle = marriedOrSingle;
    }

    public Float getSalary() {
        return this.salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Double getMilesToWork() {
        return Double.valueOf(this.milesToWork);
    }

    public void setMilesToWork(Double milesToWork) {
        this.milesToWork = milesToWork;
    }

    public Long getInsuranceLimits() {
        return this.insuranceLimits;
    }

    public void setInsuranceLimits(Long insuranceLimits) {
        this.insuranceLimits = insuranceLimits;
    }
}
