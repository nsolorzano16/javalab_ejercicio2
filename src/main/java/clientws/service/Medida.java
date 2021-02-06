/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientws.service;

/**
 *
 * @author nelsonsolorzano
 */
public class Medida {
    
    private String id;
    private double celsius;
    private double fahrenheit;

    public Medida(String id, double celsius, double fahrenheit) {
        this.id = id;
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public String toString() {
        return "Medida{\n" + "id=" + id + "\n, celsius=" + celsius 
                + "\n, fahrenheit=" + fahrenheit +"\n"+ '}';
    }
    
    
    
}
