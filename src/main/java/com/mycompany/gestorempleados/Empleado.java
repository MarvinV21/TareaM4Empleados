/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorempleados;

/**
 *
 * @author marvi
 */

public class Empleado {
    // los Atributos privados
    private String nombre;
    private int edad;
    private double salario;

    // Constructor para inicializar los atributos
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Setter para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para obtener el salario
    public double getSalario() {
        return salario;
    }

    // Setter para establecer el salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Aqui tenemos los Método para imprimir los detalles del empleado
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}