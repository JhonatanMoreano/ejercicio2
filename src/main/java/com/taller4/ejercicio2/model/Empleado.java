/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taller4.ejercicio2.model;

public class Empleado {

    private double sueldoBase;
    private int horasExtra;

    public Empleado() {
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double calcularTarifaPorHora() {
        return sueldoBase / 160;
    }

    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtra * 8);
    }
}
