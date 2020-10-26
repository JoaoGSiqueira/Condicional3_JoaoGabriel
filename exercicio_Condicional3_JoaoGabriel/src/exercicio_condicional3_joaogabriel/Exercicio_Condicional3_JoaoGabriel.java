/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_condicional3_joaogabriel;

import java.util.Scanner;

/**
 *
 * @author João Gabriel
 */
public class Exercicio_Condicional3_JoaoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double A,B,C,delta,x1,x2;
     System.out.print("Digite o valor A: ");
     A = entrada.nextDouble();
     System.out.print("Digite o valor B: ");
     B = entrada.nextDouble();
     System.out.print("Digite o valor C: ");
     C = entrada.nextDouble();
     
     if(A!=0);
     delta = Math.pow(B,2)-(4*A*C);
     
      if(delta>0){
      x1 = ((-B)+Math.sqrt(delta))/(2*A);
      x2 = ((-B)-Math.sqrt(delta))/(2*A);
      System.out.print("As raizes são x1: "+x1+" e x2: "+x2);
      }
      
      else if  (delta == 0){
      x1 = ((-B)+Math.sqrt(delta))/(2*A);
      System.out.print("As raizes são:"+x1);
      }
      else if(delta<0)
      System.out.println("A equação não possui resultados reais");
     }
    
}
