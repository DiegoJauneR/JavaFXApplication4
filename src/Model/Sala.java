package Model;

import java.util.Scanner;

public class Sala {

    private int id;
    private static int asientosM[][] = new int[5][5];
    private static int asientosVer[][] = new int[5][5];
    private static int asientosVes[][] = new int[5][5];
    private String horario[] = {"Matine", "Vermut", "Vespentino"};
    private char letraAsiento[] = {' ', 'A', 'B', 'C', 'D', 'E'};
    private static int x, y, pos;
    private static int asiento[][] = new int[5][5];

    public Sala() {
    }

    public int getId() {
        return id;
    }


    public Sala(int id) {
        this.id = id;
    }
    
    //LLenado de todas las tablas
    public void llenarTablas() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientosM[i][j] = 0;
                asientosVer[i][j] = 0;
                asientosVes[i][j] = 0;
            }
        }
    }

    public void mostrarTabla() {
        int k = 1;
        for (int i = 0; i < 6; i++) {
            System.out.print(letraAsiento[i]);

            for (int j = 0; j < 6; j++) {
                if (i == 0 && k < 6) {
                    System.out.print("[" + k + "]");
                }
                if (j > 0 && i > 0 && asiento[i - 1][j - 1] == 0) {
                    System.out.print("[-]");
                } else if (j > 0 && i > 0 && asiento[i - 1][j - 1] == 1) {
                    System.out.print("[X]");
                }
                k++;
            }
            System.out.println(" ");
        }

    }


    //Se selecciona el horario de la sala, los asientos y se verifican 
    public void seleccionarSalaHorario(int pos){
        this.pos = pos;
        System.out.println(horario[pos]);
        

            switch (pos) {
                case 0:
                    asiento = asientosM;
                    mostrarTabla();
                    break;
                case 1:
                    asiento = asientosVer;
                    mostrarTabla();
                    break;
                case 2:
                    asiento = asientosVes;
                    mostrarTabla();
                    break;
            }

    }
    
    public void asignarXeY(int fila, int columna){
        x=fila;
        y=columna;
    }

    public void seleccionarAsientos() {
        boolean verif;
            
            verif = verificarPosicionTabla();
            if (verif == false) {
                System.out.println("Error, el asiento está ocupado");
            }
            switch (pos) {
                case 0:
                    asientosM=asiento;
                    mostrarTabla();
                    break;
                case 1:
                    asientosVer=asiento;
                    mostrarTabla();
                    break;
                case 2:
                    asientosVes=asiento;
                    mostrarTabla();
                    break;
            }
            
            

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean verificarPosicionTabla() {
        boolean verif = true;
        if (asiento[x][y] == 0) {
            asiento[x][y] = 1;
        } else if (asiento[x][y] == 1) {
            verif = false;
        }
        return verif;
    }

    public int verifAsientosDisponibles(int iHorario) {
        int cantidad = 0;
        switch (iHorario) {
            case 0:
                cantidad = recorrerAsientosDisponibles(asientosM);
                break;
            case 1:
                cantidad = recorrerAsientosDisponibles(asientosVer);
                break;
            case 2:
                cantidad = recorrerAsientosDisponibles(asientosVes);
                break;
            default:
                break;
        }

        return cantidad;
    }

    /*
    Otra solucion para recorrerAsientosDisponibles es crear una variable que empiece en 25 y se vaya restando mediante se 
    vayan vendiendo entradas y así saber cuantos asientos hay disponibles
     */
    public int recorrerAsientosDisponibles(int asientosDisplonibles[][]) {
        int dispo = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asientosDisplonibles[i][j] == 0) {
                    dispo++;
                }
            }
        }
        return dispo;
    }

}
