package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Short expectedNumberOfCars = 0;
        Float expectedSalary = 0.00f;
        Double expectedMilesToWork = Double.valueOf(0);
        Long expectedInsuranceLimits = Long.valueOf(0);

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Boolean actualIsFemale = person.getIsFemale();
        Short actualNumberOfCars = person.getNumberOfCars();
        Float actualSalary = person.getSalary();
        Double actualMilesToWork = person.getMilesToWork();
        Long actualInsuranceLimits = person.getInsuranceLimits();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertTrue(actualIsFemale);
        Assert.assertEquals(expectedNumberOfCars, actualNumberOfCars);
        Assert.assertEquals(expectedSalary, actualSalary);
        Assert.assertEquals(expectedMilesToWork, actualMilesToWork);
        Assert.assertEquals(expectedInsuranceLimits, actualInsuranceLimits);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithIsFemale() {
        // Given
        Boolean expected = true;

        // When
        Person person = new Person(expected);

        // Then
        Boolean actual = person.getIsFemale();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithNumberOfCars() {
        // Given
        Short expected = 0;

        // When
        Person person = new Person(expected);

        // Then
        Short actual = person.getNumberOfCars();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithMarriedOrSingle() {
        // Given
        Character expected = 'm';

        // When
        Person person = new Person(expected);

        // Then
        Character actual = person.getMarriedOrSingle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithSalary() {
        // Given
        Float expected = 323.00f;

        // When
        Person person = new Person(expected);

        // Then
        Float actual = person.getSalary();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithMilesToWork() {
        // Given
        Double expected = Double.valueOf(10);

        // When
        Person person = new Person(expected);

        // Then
        Double actual = person.getMilesToWork();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithInsuranceLimits() {
        // Given
        Long expected = Long.valueOf(13);

        // When
        Person person = new Person(expected);

        // Then
        Long actual = person.getInsuranceLimits();
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void testConstructorWithNameAgeGenderCarsMarriedOrSingleSalaryMilesToWorkAndInsuranceLimits() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Boolean expectedIsFemale = false;
        Short expectedNumberOfCars = 0;
        Character expectedMarriedOrSingle = 's';
        Float expectedSalary = 0.00f;
        Double expectedMilesToWork = Double.valueOf(0);
        Long expectedInsuranceLimits = Long.valueOf(0);

        // When
        Person person = new Person(expectedName, expectedAge, expectedIsFemale, expectedNumberOfCars, expectedMarriedOrSingle, expectedSalary,
                expectedMilesToWork, expectedInsuranceLimits);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Boolean actualIsFemale = person.getIsFemale();
        Short actualNumberOfCars = person.getNumberOfCars();
        Character actualMarriedOrSingle =  person.getMarriedOrSingle();
        Float actualSalary = person.getSalary();
        Double actualMilesToWork = person.getMilesToWork();
        Long actualInsuranceLimits = person.getInsuranceLimits();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertFalse(actualIsFemale);
        Assert.assertEquals(expectedNumberOfCars, actualNumberOfCars);
        Assert.assertEquals(expectedMarriedOrSingle, actualMarriedOrSingle);
        Assert.assertEquals(expectedSalary, actualSalary);
        Assert.assertEquals(expectedMilesToWork, actualMilesToWork);
        Assert.assertEquals(expectedInsuranceLimits, actualInsuranceLimits);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsFemale() {
        // Given
        Person person = new Person();
         Boolean expected = true;

         // When
         person.setIsFemale(expected);

        // Then
        Boolean actual = person.getIsFemale();
        Assert.assertTrue(actual);

    }

    @Test
    public void testSetNumberOfCars() {
        // Given
        Person person = new Person();
        Short expected = 0;

        // When
        person.setNumberOfCars(expected);

        // Then
        Short actual = person.getNumberOfCars();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMarriedOrSingle() {
        // Given
        Person person = new Person();
        Character expected = 's';

        // When
        person.setMarriedOrSingle(expected);

        // Then
        Character actual = person.getMarriedOrSingle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetSalary() {
        // Given
        Person person = new Person();
        Float expected = 0.00f;

        // When
        person.setSalary(expected);

        // Then
        Float actual = person.getSalary();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMilesToWork() {
        // Given
        Person person = new Person();
        Double expected = Double.valueOf(0);

        // When
        person.setMilesToWork(expected);

        // Then
        Double actual = person.getMilesToWork();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetInsuranceLimits() {
        // Given
        Person person = new Person();
        Long expected = Long.valueOf(0);

        // When
        person.setInsuranceLimits(expected);

        // Then
        Long actual = person.getInsuranceLimits();
        Assert.assertEquals(expected, actual);
    }
}
