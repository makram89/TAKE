/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marek
 */
public class Student {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the average
     */
    public Double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    private String name;
    private String surname;
    private Double average;

    public Student(String _name, String _surname, Double _avg) {
        name = _name;
        surname = _surname;
        average = _avg;
    }

}
