package ec.edu.ister.contolador;

import java.util.Scanner;


public class numeroInvertido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int num , numeroInvertido ,division , restoDivision;
        
        System.out.println("Ingrese un numero que dese  ");
        num=entrada.nextInt();
        
        numeroInvertido = 0;
        division = num ;
        restoDivision = 0 ;
        while (division !=0){
            restoDivision = division %10 ;
            division = division /10;
            numeroInvertido = numeroInvertido * 10 + restoDivision;
        }
        System.out.println("El numero"+num+"ivertido es "+numeroInvertido);
        
        }
    }