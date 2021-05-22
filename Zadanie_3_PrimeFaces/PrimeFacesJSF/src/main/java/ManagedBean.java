/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author marek
 */
@Named(value = "managedBean")
@RequestScoped
public class ManagedBean {

    /**
     * @return the a
     */
    public Integer getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Integer a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Integer getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Integer b) {
        this.b = b;
    }

    /**
     * @return the result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    private Integer a;
    private Integer b;
    private Integer result;
    private ArrayList<Student> studentsList = new ArrayList<>();
    private LineChartModel lineChart;

    /**
     * Creates a new instance of ManagedBean
     */
    public ManagedBean() {
        generateStudents();
        createLineChart();
    }

    public void calculateFunc() {
        if (a != null && b != null) {
            setResult(getA() + getB());

            String message = a.toString() + " + " + b.toString() + " = " + result.toString();
            FacesContext.getCurrentInstance().
                    addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "What happened message", message));
        }

    }

    public void createLineChart() {
        setLineChart(new LineChartModel());
        LineChartSeries sinus = new LineChartSeries();
        LineChartSeries cosinus = new LineChartSeries();
        sinus.setLabel("sinus");
        cosinus.setLabel("cosinus");
        for (int i = 0; i <= 360; i = i + 10) {
            sinus.set(i, Math.sin(Math.toRadians(i)));
            cosinus.set(i, Math.cos(Math.toRadians(i)));
        }
        getLineChart().addSeries(sinus);
        getLineChart().addSeries(cosinus);
        getLineChart().setZoom(true);
        getLineChart().setLegendPosition("sw");

    }

    public Date getCurrentDate() {
        return new Date();
    }

    private void generateStudents() {
        Random r = new Random();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Brajan", "Janusz", "Stefan", "Jessica", "Mariola"));
        ArrayList<String> surnames = new ArrayList<>(Arrays.asList("Kowalski", "Nowak", "Wisniecki", "Blachowicz"));
        for (int i = 0; i < 20; i++) {
            String name = names.get((int) (Math.random() * names.size()));
            String surname = surnames.get((int) (Math.random() * surnames.size()));

            Double avg = new BigDecimal(3.0 + r.nextFloat() * (5.0 - 3.0)).setScale(2, RoundingMode.HALF_UP).doubleValue();
            getStudentsList().add(new Student(name, surname, avg));
        }
    }

    /**
     * @return the studentsList
     */
    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    /**
     * @param studentsList the studentsList to set
     */
    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    /**
     * @return the lineChart
     */
    public LineChartModel getLineChart() {
        return lineChart;
    }

    /**
     * @param lineChart the lineChart to set
     */
    public void setLineChart(LineChartModel lineChart) {
        this.lineChart = lineChart;
    }
}
