import java.util.Scanner;

public class problema10 {
	
	public static void main (String[] args) {
		//declaracion de variables
		float r=0, p=0, v1=0, v2=0, vrel=0, t=0;
		
		//entrada de datos 'r' y 'p'
		Scanner entradadatos = new Scanner(System.in);	
		
		System.out.println("ingrese los valores de 'r' y 'p': ");
	
		r = entradadatos.nextInt();
		p = entradadatos.nextInt();
		
		//proceso
		v1 = 1/r;
		v2 = 1/p;
		vrel = v1 - v2;
		t = 1/vrel;
		
		//impresion del resultado
		System.out.println("\n" + t + "\n");
		
	}
}
