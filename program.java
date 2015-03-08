package teste;
import java.util.*;
public class Teste
{
    public static void primos (String[] args)
    {
    	 float n=0,cont=0,i=0,h=0,o=0;
    	 Scanner input = new Scanner (System.in);
    	 System.out.printf("entre um numero para calcular os primos até ele \n\n");
    	 h = input.nextFloat();
    	 do
    	 {
    		 i = 0;
    		 do
    		 {
    			 i=i+1;
    			 if(o%i == n)
    			 {
    				 cont = cont + 1;
    			 }	 
    		 }	 
    		 while(i < h+1);
    		 if(cont == 2)
    		 {
    			System.out.printf("%.0f \n",o); 
    		 }
    		 else
    		 {}
    		 o = o + 1;  	     
    		 cont = 0;
    	 }
         while(o < h+1);
    }
	
	public static void main (String[] args)
	{
		
		int pares,mult,i=0,h=0,num=0;
		char again;
       
       Scanner input = new Scanner (System.in);
       do
       {
       System.out.printf("selecione qual tipo de numeros voce quer ver:\n\n(1)primos\n(2)multiplos de cinco\n(3)pares\n\n");
       h = input.nextInt();
       
       if(h == 1) // Switch
       {
          primos(args);
       } 
       if(h == 2) //switch
       {
    	   h = 0;
    	   System.out.printf("digite a quantidade de multiplos de cinco que voce quer consultar\n\n");
           h = input.nextInt();
       do
       {
    	   mult = 0;
    	   i = i + 1;
    	   mult = 5 * i;
    	   System.out.printf("%d \n",mult);
       }
       while(i != h);
       while(h != num);
       }
       
       
       
              
       if(h==3) //switch
       {
    	    h=0;
    	    System.out.printf("digite a quantidade de numeros pares que voce quer consultar\n\n");
    	    h = input.nextInt();
       do
       {
    	   pares = 0;
    	   i = i + 1;
    	   pares = 2 * i;
    	   System.out.printf("%d \n",pares);
       }
       while(i != h);
       }
       
       System.out.printf("\n\nquer fazer outra consulta? s/n\n");
       again = input.next().charAt(0);
       }
       while(again == 's' || again == 'S');
       
       
       
	}
}
