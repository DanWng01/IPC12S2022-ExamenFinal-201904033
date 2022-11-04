
package ipc12s2022examenfinal;

import java.util.Scanner;

public class IPC12S2022examenFinal {

    static int a,b,n,x,y,i,j,nV,pesoC;
    static String lista1,lista2;
    static String[] listaPesos;
    static String[] listaLitros;
    
    static Scanner scA = new Scanner(System.in);
    static Scanner scB = new Scanner(System.in);
    
    static void ejercicio1(){
        
        System.out.println("Ingrese 2 numeros");
        a = scA.nextInt();
        b = scA.nextInt();
        
        if(a>b){
            System.out.println(a+" es mayor que "+b); 
        } if(b>a){
            System.out.println(b+" es mayor que "+a);
        } else {
            System.out.println(a+" es igual a "+b);
        }
    }
    
    static void ejercicio2(){
       
        System.out.println("Ingrese nivel de la piramide");
        n = scB.nextInt();
        
        while((n%2)==0 || n==1){
            System.out.println("debe ser impar, vuelva a ingresar");
            n = scB.nextInt();
        }
        
        x=n/2;
        y=1;

        while(x>0){
            
            for(j=0;j<x;j++){
                System.out.print(" ");       
            }
            
            
            for(j=0;j<y;j++){
                System.out.print("*");
            }
            
            System.out.println("");
            
            x--;
            y=y+2;
        }
        
        for(i=0;i<n;i++){
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
    static void ejercicio3(){
        
        System.out.println("Ingrese numero de vacas disponibles");
        nV = scA.nextInt();
        System.out.println("Ingrese peso limite del camion");
        pesoC = scA.nextInt();
        
        listaPesos = new String[nV];
        listaLitros = new String[nV];
        System.out.println("Ingrese listado de pesos");
        lista1 = scB.nextLine();
        System.out.println("Ingrese listado de litros");
        lista2 = scB.nextLine();
        
        listaPesos = lista1.split(",");
        listaLitros = lista2.split(",");
    
        vaca[] listaVaca = new vaca[nV];
        
        for(i=0;i<nV;i++){
            listaVaca[i].setNumero(i);
            listaVaca[i].setPeso(Integer.parseInt(listaPesos[i]));
            listaVaca[i].setLitros(Integer.parseInt(listaLitros[i]));
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String op = "s";
        
        
        while(op.equals("s") || op.equals("S")){
        
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("Ingrese opcion");
            
            op = sc.nextLine();
            
            switch(op){
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                default:
                    
            }
            
            System.out.println("Desea regresar? s/n");
            op = sc.nextLine();
        }
        
    
    }
    
}
