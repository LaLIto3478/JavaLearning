package practica3;

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class practica_3_ejercicio_13 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0;
        boolean bandera;
        String NString = " ";
        BigInteger producto = BigInteger.ONE;
        
        // PEDIR AL USUARIO LAS VARIABLES Y VALIDAR QUE SEA ENTERO
        do{
            NString = JOptionPane.showInputDialog("INGRESE EL VALOR DE N \nNOTA: debe ser un valor entero.");
            bandera = true;
            for (int i = 0 ; i < NString.length() ; i++){
                if (NString.charAt(i) < 48 || NString.charAt(i) > 57){
                bandera = false;
                JOptionPane.showMessageDialog(null, "ERROR: ¡Entero NO válido!");
                break;
                }
            }
        }while(bandera == false);
        // PROCESAMIENTO
        N = Integer.parseInt(NString);
        if (N != 0){
            for (int i = 1 ; i <= N ; i++){
                producto = producto.multiply(BigInteger.valueOf(i));
            }
        }
        else{
            producto = BigInteger.valueOf(0);
        }
        JOptionPane.showMessageDialog(null, producto);
    }
}
