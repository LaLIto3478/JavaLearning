package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_3 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int s = 0;
        String N = " ", validador = " ";
        boolean bandera;
        
        // PEDIR AL USUARIO EL NÚMERO Y VALIDAR QUE SEA UN NÚMERO
        do {
            N = JOptionPane.showInputDialog("INGRESE SU NÚMERO");
            bandera = true;
            
            for (int i = 0 ; i < N.length() ; i++){
                if (N.charAt(i) < 48 || N.charAt(i) > 57){
                    JOptionPane.showMessageDialog(null, "ERROR: Número NO válido.");
                    bandera = false;
                    break;
                }
            }
        }while (bandera == false);
        
        // PROCESAMIENTO
        for (int i = 0 ; i < N.length() ; i++){
            s += N.charAt(i) - 48;
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
