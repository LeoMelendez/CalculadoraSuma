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
public class Suma1 {
    int numero1 = 20;
    int numero2 = 15;
    int sumar;
    int restar;
    int mulplicar;
    
    
    
    public void sumar (int a , int b){
       
        sumar =a+b;
        
    }
    public void restar (int a,int b){
        restar =a-b;
        
    }
    public void mulplicar (){
        mulplicar=numero1*numero2;
        
    }
    public void mostrar (){
        System.out.println(sumar);
        System.out.println(restar);
        System.out.println(mulplicar);
    }
    public static void main (String []args ){
        int a=30;
         int b=40;        
        Suma1 calcular = new Suma1();
        Suma1 calcularR=new Suma1();
        
        calcular.sumar(a,b);
        calcular.restar(a,b);
        calcular.mulplicar();
        calcular.mostrar();
        
       
        
        
    }
}
