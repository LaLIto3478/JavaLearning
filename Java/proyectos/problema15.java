import java.util.Scanner;

public class problema15 {

	public static void main(String[] args) {
		
		Scanner entradadatos = new Scanner(System.in);
		int t = 0, a = 0, b = 0, x = 0;

		System.out.println("Ingrese los tamales robados 't' y el numero de miembros de la banda 'b': ");
		
		t = entradadatos.nextInt();
		b = entradadatos.nextInt();

		System.out.println("el numero de tamales robados es: " + t + "\n" + "el numero de miembros de la banda es: " + b);
		
		x = t / 2;
		x += t % 2;
		b -= 1;
		x = x + ((t-x) % b);

		System.out.println("los tamales que se comera el lider es: " + x);
	

	}
}

	

