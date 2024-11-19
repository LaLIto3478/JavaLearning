package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_14 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, S = 0;
        boolean bandera;
        String cadena = " ";
        
        // PEDIR AL USUARIO EL NÚMERO Y VALIDAR QUE SEA UN ENTERO
        do {
            cadena = JOptionPane.showInputDialog("Ingrese hasta qué valor quiere calcular su sumatoria. \nNOTA: Debe ser mayor o igual a ocho enteros.");
            bandera = true;
            
            for (int i = 0 ; i < cadena.length() ; i++){
                if (cadena.charAt(i) < 48 || cadena.charAt(i) > 57){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido.");
                    bandera = false;
                    break;
                }
            }
        } while (bandera == false);
        
        // PROCESAMIENTO
        N = Integer.parseInt(cadena);
        for (int i = 1 ; i <= N ; i++){
            S += i + 7;             // se le suma siete para que el valor de la primera posición tenga ocho, el valor de la segunda nueve, etc.
        }
        JOptionPane.showMessageDialog(null, "El resultado de su sumatoria es: " + S);
    }
}
