import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner giris=new Scanner(System.in);
		        double a,b,c;
		        double delta,x1,x2;
		        System.out.println("�kinci dereceden denklemin k�klerini bulma");
		        System.out.println("ax^2+bx+c=0\n");
		        System.out.print("a de�erini girin=");
		        a= giris.nextInt();
		        System.out.print("b de�erini girin=");
		        b= giris.nextInt();
		        System.out.print("c de�erini girin=");
		        c= giris.nextInt();
		        delta=b*b-4*a*c;
		        if (delta < 0){
		        System.out.println("Delta < 0 K�k yoktur.");
		        } else if(delta == 0) {
		            x1=(-b+Math.sqrt(delta)/10)/2*a;
		        System.out.println("Delta = 0 ve 2 e�it k�k vard�r="+x1);
		        } else if(delta > 0){
		            x1=(-b+Math.sqrt(delta)/10)/2*a;
		            x2=(-b-Math.sqrt(delta)/10)/2*a;
		        System.out.println("Delta > 0 ve 2 farkl� k�k vard�r");
		        System.out.println("x1= "+x1+"  x2="+x2);
		    
		        
		        }
	
	}
		 
				
	}


