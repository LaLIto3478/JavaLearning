package practica3;

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class practica_3_ejercicio_7 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        BigInteger producto = BigInteger.ONE;
        int numero = 18, suma = 0;
        
        // PROCESAMIENTO
        while (numero <= 400){
            numero += 2;
            suma += numero;
            producto = producto.multiply(BigInteger.valueOf(numero));
        }
        JOptionPane.showMessageDialog(null, "la suma es: " + suma + "\nel producto es: " + producto);
    }
}
