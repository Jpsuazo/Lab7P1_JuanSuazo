/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_juansuazo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Lab7P1_JuanSuazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in);
          int opcion = -1;
          do {
            menu();
              System.out.println("ingrese una opcion : ");
              opcion = entrada.nextInt();
              switch (opcion){
                  case 1:
                      tableroeje1 ();
                      System.out.println("en el nombre del padre");
                      break;
                  case 2:
                      System.out.println("del hijo y del espiritu santo");
                      break;
                  case 3:
                      System.out.println("Amen");
              }
        } while (true);
    }
    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("--------Menu----------");
        System.out.println("1. Pancho ");
        System.out.println("2.El acomodo de matriz  ");
        System.out.println("3. Salir ");
        

    }//metodo
    public static void tableroeje1 (){
    char [][] tablero = new char[8][7];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                
                tablero[i][j] = '*';
            }//for 2
            System.out.print("");
            
        }// for1
        elementos(tablero);
         llamadodeEmergencia(tablero);
         
            
        }
    public static void llamadodeEmergencia (char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
                
            }//for2
            System.out.println("");
            
        }//for
    }//metodo
    public static char[][] suerte(char[][] tablero,char refri){
        int fila;
        int columna;
        Random random = new Random();
         do {
          fila = random.nextInt(tablero.length);
          columna = random.nextInt(tablero[0].length);
          
          
        } while (tablero[fila][columna] !='*');
         tablero[fila][columna] = refri;
         return tablero;
    }
    public static int [] elementos(char[][] tablero){
        int [] mover = new int[2];
      for (int i = 0; i < 4; i++)suerte(tablero,'V'); {
            
        }
        for (int i = 0; i < 3; i++)suerte(tablero,'T'); {
            
        }
        for (int i = 0; i < 3; i++)suerte(tablero,'S'); {
            
        }
        for (int i = 0; i < 1; i++)suerte(tablero,'P'); {
            
        }   
        return mover;
    } 
    public static int moverelemento(char[][] tablero){
        Scanner entrada = new Scanner (System.in);
        int[] mover = elementos(tablero);
        int filaelemento = mover[0];
        int columnaelemento = mover[1];
        int movimiento = -1;
        do {
            System.out.println("1. arriba");
            System.out.println("2. abajo");
            System.out.println("3. izquierda");
            System.out.println("4. derecha");
            movimiento = entrada.nextInt();
            } while (movimiento <1 || movimiento > 4);
        int tamanofilas = tablero.length;
        int tamanocolumnas = tablero[0].length;
        switch(movimiento){
            case 1-> {
                if (filaelemento - 1 < 0){
                    System.out.println("Se sale");
                }else{
                    if (tablero[filaelemento-1][columnaelemento] =='V'){
                        System.out.println("Verdura caducada");
                        
                    }else{
                        if(tablero[filaelemento-1][columnaelemento] =='*'){
                            
                        }//if3
                    }//else2
                }//else1
            }//case
            case 2->{
                 if (filaelemento + 1 < tamanofilas){
                     System.out.println("se sale");
                 }else{
                     
                 }
            }
            
        }
                
        
        
    }
    }//metodo
    
