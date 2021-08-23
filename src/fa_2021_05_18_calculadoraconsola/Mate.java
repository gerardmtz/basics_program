/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa_2021_05_18_calculadoraconsola;

/**
 *
 * @author Gerardo Martínez
 */
public class Mate {
    
    public static final double PI = 3.141592654;
    
    public static double  potencia(double base, int exponente){
        
        double pot = 1;
        
        for (int i = 1; i <= exponente; i++)
            pot = pot * base;
        
        return pot;
        
        
        
    }
    
    public static double factorial (int n){
            
            double fac = 1;
            
            for (int i = 1; i<= n; i++) //calcular el facotrial de cada valor de n
            fac = fac * i; // fac *= i
            
            return fac;
            
        
    }
    
    public static int div (double dividendo, double divisor){
        
        if (divisor <= 0)
            return 0;
        
        
        double residuo = dividendo;
        int cociente = 0;
        
        while (residuo >= divisor){
            
            residuo = residuo - divisor; // residuo - divisor
            cociente ++;
        }
        
        return cociente;
        
        
    }
    
    public static double mod (double dividendo, double divisor){
        
          if (divisor <= 0)
            return 0;
        
        double residuo = dividendo;
        
        while (residuo >= divisor){
            
            residuo = residuo - divisor; // residuo - divisor
        }
        
        return residuo;
        
        
    }
    
    public static double raiz (double numero){
        
         if(numero < 0)
           return 0;
        
        else{
            double a = numero;
            double b = 1;
            double promedio;
            
            while(absoluto(a - b) > 0.00000000001){
                
                promedio = (a + b )/2;
                a = promedio;
                b = numero / a;

            }
            
            return a;
        }
         
    }
    
    
     public static double absoluto(double valor){
        
        double valorAbs;
        
        if(valor < 0)
            valorAbs = valor * (-1);
        else 
            valorAbs = valor;
        
        return valorAbs; 
        
    }
     
     public static double sin (double angulo){
         
         double x, suma;
         int i; 
         
         suma = 0;
         
         x = angulo * PI / 180;
        
        for (i = 1; i<= 15; i++)
            suma += potencia(x,2*i-1) / factorial(2*i-1) * potencia(-1, i-1);

        return suma;
         
     }
     
     public static double cos (double angulo){
         
         return raiz(1-potencia(sin(angulo),2));
         
         
         
     }
     
     public static double tan (double angulo){
         
         return sin(angulo)/cos(angulo);

     }
     
     public static double perm(int n, int r){
         
         return factorial (n) / factorial(n-r);

         
     }
     
     public static double comb(int n, int r){
         
         return factorial (n) / (factorial(n-r) * factorial(r));

         
     }
     
     
     
     
     
     
     
    
    
    
    
    
    
}
