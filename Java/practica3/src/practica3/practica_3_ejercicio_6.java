package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_6 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int numero = 0;
        float media = 0;
        String validador = " ";
        boolean bandera;
        // PROCESAMIENTO
        for (int i = 0 ; i < 100 ; i++){
            // PEDIR AL USUARIO UN NÚMERO Y VALIDAR QUE SEA UN ENTERO
            do {
                validador = JOptionPane.showInputDialog("INGRESE UN NÚMERO");
                bandera = true;
                
                for (int j = 0 ; j < validador.length() ; j++){
                    if (validador.charAt(j) < 48 || validador.charAt(j) > 57){
                        JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                        bandera = false;
                        break;
                    }
                }
            } while(bandera == false);
            
            numero = Integer.parseInt(validador);
            media += numero;
        }
        media /= 100;
        JOptionPane.showMessageDialog(null, "La media de sus números es: " +media);
    }
}