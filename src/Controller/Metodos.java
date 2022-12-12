/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Boleta;
import Model.Sala;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.*;



public class Metodos {

    public static Sala salas[] = new Sala[3];
    public static int totalBoleta = 0, totalVenta = 0, x, y, sala, horario;
    private String asientoTotal = "";
    private java.util.Date fecha = new Date();
    private List<Boleta> boletas = new ArrayList<Boleta>();

    public void setSala(int sala) {
        this.sala = sala;
    }
    

    
    

    public void salaHorarioYAsientos(int horarioId) {
        horario = horarioId;
        for (int i = 0; i < 3; i++) {
            salas[i] = new Sala(i);
        }
        
       
        
        System.out.println("salayhorario"+sala);
        
        System.out.println(salas[sala].getId()+","+horario);
        salas[sala].seleccionarSalaHorario(horario);

        /*x = salas[sala].getX();
        y = salas[sala].getY();
        asientosSeleccionados(x, y);
        totalBoleta++;

        boleta();*/

    }

    public void boleta() {

        
        
        String horarios[] = {"Matine", "Vermut", "Vespentino"};
        int precioTotalBoleta;
        //ID
        int id = (int) (Math.random() * 9999 + 999);
        /*Sala
        Sala es la variable global "sala"*/
 /*Horario
         El horario lo obtengo de inmediato con el valor de la variable globlar horario*/
        //Costo
        precioTotalBoleta = totalBoleta * 3000;
        //Fecha
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.now();
        /*Asiento
        Asiento es la variable global "asientoTotal"*/
        Boleta boleta = new Boleta(id, sala + 1, precioTotalBoleta, horarios[horario], fecha.format(esDateFormat), asientoTotal);
        boletas.add(boleta);
        System.out.println(boleta.toString());

        totalVenta += totalBoleta;
        //Reseteo de la variable asientoTotal
        asientoTotal = " ";
        //Reseteo de la variable totalBoleta
        totalBoleta = 0;
    }

    public void asientosSeleccionados(int x, int y) {
        char letraAsiento[] = {'A', 'B', 'C', 'D', 'E'};
        int numeroAsiento = y + 1;

        String asiento = " " + letraAsiento[x] + numeroAsiento + " ";
        asientoTotal += asiento;
    }

    public void resumenDeVenta() {
        System.out.println("\n-- Venta total --\n");
        for (Boleta i : boletas) {
            System.out.println("ID: " + i.getId() + " Valor: $" + i.getCosto());
        }
        System.out.println("Total de venta: $" + totalVenta * 3000);
    }

    public void ventaPorSala() {
        int opcionVentaPorSala=0;
        do {
            System.out.println("\n--VENTA POR SALA--\n");
            System.out.println("1.- Sala 1");
            System.out.println("2.- Sala 2");
            System.out.println("3.- Sala 3");
            System.out.println("4.- Salir");
            System.out.print("Opcion: ");
            switch (opcionVentaPorSala) {
                case 1:
                    System.out.println("\n--VENTA SALA 1--\n");
                    boletas.stream().filter(bol -> bol.getSala() == 1).forEach(bol -> System.out.println("ID: " + bol.getId() + " Valor: $" + bol.getCosto()));
                    IntSummaryStatistics totalValorSala1 = boletas.stream().filter(bol -> bol.getSala() == 1).collect(Collectors.summarizingInt(Boleta::getCosto));
                    System.out.println("Total venta = " + totalValorSala1.getSum());
                    break;
                case 2:
                    System.out.println("\n--VENTA SALA 2--\n");
                    boletas.stream().filter(bol -> bol.getSala() == 2).forEach(bol -> System.out.println("ID: " + bol.getId() + " Valor: $" + bol.getCosto()));
                    IntSummaryStatistics totalValorSala2 = boletas.stream().filter(bol -> bol.getSala() == 2).collect(Collectors.summarizingInt(Boleta::getCosto));
                    System.out.println("Total venta = " + totalValorSala2.getSum());
                    break;
                case 3:
                    System.out.println("\n--VENTA SALA 3--\n");
                    boletas.stream().filter(bol -> bol.getSala() == 3).forEach(bol -> System.out.println("ID: " + bol.getId() + " Valor: $" + bol.getCosto()));
                    IntSummaryStatistics totalValorSala3 = boletas.stream().filter(bol -> bol.getSala() == 3).collect(Collectors.summarizingInt(Boleta::getCosto));
                    System.out.println("Total venta = " + totalValorSala3.getSum());
                    break;
                default:
                    break;
            }

            if (opcionVentaPorSala > 4 && opcionVentaPorSala < 1) {
                System.out.println("Error, opcion no valida");
            }
        } while (opcionVentaPorSala != 4);

    }
}
