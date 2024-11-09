/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorempleados;

/**
 *
 * @author marvi
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GestorEmpleados gestor = new GestorEmpleados();
            
            System.out.println("Sistema de Gestion de Empleados");
            
            OUTER:
            while (true) {
                System.out.println("1. Agregar Empleado");
                System.out.println("2. Mostrar Empleados");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        // Pedimos los datos del empleado
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombre = scanner.next();
                        System.out.print("Ingrese la edad del empleado: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese el salario del empleado: ");
                        double salario = scanner.nextDouble();
                        // aqui Creamos un nuevo empleado y se agrega al gestor
                        Empleado empleado = new Empleado(nombre, edad, salario);
                        gestor.agregarEmpleado(empleado);
                    }
                    case 2 -> // Mostramos todos los empleados
                        gestor.mostrarEmpleados();
                    case 3 -> {
                        // este sera el msj al Salir del programa
                        System.out.println("Saliendo Del Sistema, Gracias...");
                        break OUTER;
                    }
                    default -> System.out.println("Opcion no es valida. Intentelo nuevamente.");
                }
            }
        }
    }
}