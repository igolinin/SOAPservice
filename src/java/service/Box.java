/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author igor
 */
public class Box {

    public Box(String name, int id, double weight, double w, double h, double d) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.w = w;
        this.h = h;
        this.d = d;
    }

    

    
    
    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    private double weight;

    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    private double w;

    /**
     * Get the value of w
     *
     * @return the value of w
     */
    public double getW() {
        return w;
    }

    /**
     * Set the value of w
     *
     * @param w new value of w
     */
    public void setW(double w) {
        this.w = w;
    }

    private double h;

    /**
     * Get the value of h
     *
     * @return the value of h
     */
    public double getH() {
        return h;
    }

    /**
     * Set the value of h
     *
     * @param h new value of h
     */
    public void setH(double h) {
        this.h = h;
    }

    private double d;

    /**
     * Get the value of d
     *
     * @return the value of d
     */
    public double getD() {
        return d;
    }

    /**
     * Set the value of d
     *
     * @param d new value of d
     */
    public void setD(double d) {
        this.d = d;
    }
    public void convertToImp(){
        
        
        weight/=0.4;
        d/=2.5;
        w/=2.5;
        h/=2.5;
    }
    public void convertToMetric(){
        weight*=0.4;
        d*=2.5;
        w*=2.5;
        h*=2.5;
    }

    
}
