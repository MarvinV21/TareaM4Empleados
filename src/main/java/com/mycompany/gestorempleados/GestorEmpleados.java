/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorempleados;

/**
 *
 * @author marvi
 */

import java.util.ArrayList;

public class GestorEmpleados {
    // Lista para almacenar empleados
    private final ArrayList<Empleado> listaEmpleados;

    // Constructor para inicializar la lista
    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

    // aqui el Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    // aqui tenemos el Método para mostrar los detalles de todos los empleados
    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
        } else {
            for (Empleado empleado : listaEmpleados) {
                empleado.imprimirInformacion();
                //linea que nos hara las divisiones entre nombres al mostrarlos
                System.out.println("---------------------------");
            }
        }
    }
}
