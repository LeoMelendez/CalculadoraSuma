/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
import java.util.Scanner;
public class Calculadora {
    int numero1=10; 
    int numero2=12;
    int sumar;
 public void sumar (){
     sumar=numero1+numero2;
 }
 public void Imprimir (){
     
     System.out.println("La suma es "+sumar);
     
 }
    public static void main (String [] args){
        
        
       Calculadora op1 = new Calculadora();
       
       Scanner sc = new Scanner(System.in);
        
      System.out.println("Ingrese el primer valor");
      
      op1.numero1 = sc.nextInt();
        // segundo valor
    
       System.out.println("Ingrese el segundo valor");
      
       op1.numero2 = sc.nextInt();
       
        
        op1.sumar();
        op1.Imprimir();
      //  System.out.println(" ");
        
       // System.out.println("La suma de los dos valore es : ");
        
        
        
        
        
        
        
    }
    
}
