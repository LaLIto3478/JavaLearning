package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_5 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int numero = 0, factorial = 1;
        String validador = " ";
        boolean bandera;
        
        // PEDIR AL USUARIO EL NÚMERO Y VALIDAR QUE SEA UN NÚMERO.
        do {
            validador = JOptionPane.showInputDialog("INGRESE EL NÚMERO DEL QUE DESEA CALCULAR SU FACTORIAL");
            bandera = true;
            
            for (int i = 0 ; i < validador.length() ; i++){
                if (validador.charAt(i) < 48 || validador.charAt(i) > 57){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido.");
                    bandera = false;
                    break;
                }
            }
        } while(bandera == false);
        
        // PROCESAMIENTO
        numero = Integer.parseInt(validador);
        for (int i = numero ; i > 0 ; i--){
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "EL FACTORIAL DE SU NÚMERO ES: "+factorial);
    }
}
