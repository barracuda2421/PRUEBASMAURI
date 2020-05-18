package Javadoc;

public  class Calcula_factorial { 
                    public static void main(String[] args)
                    {
                    System.out.println(Calculadoraotra.factorial(5)); 
                    } 
 }



 class Calculadoraotra 
        {  
        static public int factorial(int n) 
                {   
                int fact=1;   
                 while (n>0) {    fact *=n--;}
                return fact;  
                }
        }
        
 
 