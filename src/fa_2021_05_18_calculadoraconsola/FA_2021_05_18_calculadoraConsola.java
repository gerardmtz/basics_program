/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa_2021_05_18_calculadoraconsola;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gerardo Martínez
 */
public class FA_2021_05_18_calculadoraConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        double valor1D, valor2D, resultadoD;
        int valor1E, valor2E, opcion;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
        
            System.out.println("\n0 - Salida");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("5 - Potencia entera");
            System.out.println("6 - factorial entero");
            System.out.println("7 - DIV");
            System.out.println("8 - MOD");
            System.out.println("9 - Raíz Cuadrada");
            System.out.println("10 - Valor absoluto");
            System.out.println("11 - Sin del ángulo");
            System.out.println("12 - Cos del ángulo");
            System.out.println("13 - Tan del ángulo");
            System.out.println("14 - Permutaciones");
            System.out.println("15 - Combinaciones");
            
            

            System.out.print("\nSeleccione opción: ");
            opcion = teclado.nextInt();

            switch (opcion){
                
                case 0: //salir
                    System.out.println("Gracias por usar la calculadora versión 0.1 ");
                    
                    
                    break;

                case 1: //suma

                    valor1D = leerReal("Primer sumando: ");
                    valor2D = leerReal("Segundo sumando: ");

                    resultadoD = valor1D + valor2D;

                    System.out.println(valor1D + " + " + valor2D + " = " + resultadoD);


                    break;

                case 2: //resta

                    valor1D = leerReal("Primer minuendo: ");
                    valor2D = leerReal("Segundo sustraendo: ");

                    resultadoD = valor1D - valor2D;

                    System.out.println(valor1D + " - " + valor2D + " = " + resultadoD);



                    break;

                case 3: //multiplicación

                    valor1D = leerReal("Primer factor: ");
                    valor2D = leerReal("Segundo factor: ");

                    resultadoD = valor1D * valor2D;

                    System.out.println(valor1D + " x " + valor2D + " = " + resultadoD);

                    break;

                case 4: //división

                    valor1D = leerReal("Dividendo: ");
                    valor2D = leerReal("Divisor: ");

                    do{
                        valor2D = leerReal("Divisor: ");

                    }while(valor2D == 0);



                    resultadoD = valor1D / valor2D;

                    System.out.println(valor1D + " ÷ " + valor2D + " = " + resultadoD);

                    break;
                    
                case 5: //potencia entera
                    
                    valor1D = leerReal("Base: ");
                    valor1E = leerEntero("Exponente: ");
                    
                    System.out.println(valor1D + " a la " + valor1E + " = " + Mate.potencia(valor1D, valor1E));
                    
                    break;
                    
                case 6: //factorial
                    valor1E = leerEntero("Numero: ");
                    System.out.println(valor1E  + "! = " + Mate.factorial(valor1E) );
                
                    break;
                    
                case 7: //Dvisión div y mod
                    valor1D = leerReal("Dividendo: ");
                    valor2D = leerReal("Divisor: ");

                    System.out.println(valor1D + " DIV " + valor2D + " = " + Mate.div(valor1D, valor2D));
                    
                    break;
                    
                case 8: //
                    valor1D = leerReal("Dividendo: ");
                    valor2D = leerReal("Divisor: ");

                    System.out.println(valor1D + " DIV " + valor2D + " = " + Mate.mod(valor1D, valor2D));
                    
                    break;
                    
                case 9:
                    valor1D = leerReal("Número: ");
                    System.out.println("Raíz cuadrada de :" + valor1D + " = " + Mate.raiz(valor1D));
                    
                    break;
                    
                case 10:
                    valor1D = leerReal("Número: ");
                    System.out.println("| " + valor1D + " | = " + Mate.absoluto(valor1D));
                    
                    break;
                    
                    
                case 11: //Seno del ángulo en grados
                    
                    valor1D = leerReal("Ángulo en grados ");
                    System.out.println("Seno de " + valor1D + "° = " + Mate.sin(valor1D) );
                    
                    break;
                
                 case 12: //Coseno del ángulo en grados
                    
                    valor1D = leerReal("Ángulo en grados ");
                    System.out.println("Conseno de " + valor1D + "° = " + Mate.cos(valor1D) );
                    
                    break;
                    
                 case 13: //Tan del ángulo en grados
                    
                    valor1D = leerReal("Ángulo en grados ");
                    System.out.println("Tangente de " + valor1D + "° = " + Mate.tan(valor1D) );
                    
                    break;
                    
                case 14: //permutaciones
                    valor1E = leerEntero("n: ");
                    valor2E = leerEntero("r: ");
                    System.out.println(valor1E  + "P" + valor2E + " = " +  Mate.perm(valor1E, valor2E));
                
                    break;
                    
                 case 15: //combinaciones
                    valor1E = leerEntero("n: ");
                    valor2E = leerEntero("r: ");
                    System.out.println(valor1E  + "C" + valor2E + " = " +  Mate.comb(valor1E, valor2E));
                
                    break;
                    
                default:
                    System.out.println("Opción no valida");
            } //fin del switch
            
            
            System.out.print("Presione ENTER para continuar...");
            System.in.read();
            
        }while(opcion != 0); //fin del do-while   
    }
    
    public static double leerReal (String mensaje){
        
        double valor;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(mensaje + ": ");
        valor = teclado.nextDouble();
        
        return valor;
        
        
    }
    
    public static int leerEntero (String mensaje){
        
        int valor;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(mensaje + ": ");
        valor = teclado.nextInt();
        
        return valor;
        
        
    }
    
    
    
}
