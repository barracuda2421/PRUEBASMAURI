/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javadoc;

/**
 *
 * @author barra
 * 
 * 
 * 
 */
public  class Calculadorapru { 
                    public static void main(String[] args)
                    {
                    System.out.println(Calculadora()); 
                    } 

    private static boolean Calculadora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
 class Calculadora {
    
    public int num1 ;
    public int num2 ;
    
    public Calculadora(int a, int b){ num1=a; num2=b; }
    
    public int suma() { int resultado= num1 +  num2 ; return resultado; }
    public int resta() { int resultado= num1 -  num2 ; return resultado; }
    public int multiplica() {int resultado= num1 * num2 ; return resultado; }
    public int divide() { int resultado= num1 / num2 ; return resultado;   }
}