package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_1 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES A USAR
        int N = 0, sumatoria = 0;
        boolean bandera;
        String cadena = " ";
        
        // PEDIR AL USUARIO HASTA QUÉ NÚMERO QUIERE CALCULAR SU SUMATORIA Y VALIDAR QUE SEA ENTERO
        do {
            cadena = JOptionPane.showInputDialog("INGRESE HASTA QUÉ NÚMERO QUIERE CALCULAR LA SUMATORIA: ");
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
        for (int i = N ; i >= 0 ; i--){
            sumatoria += i;
        }
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "La sumatoria es: " + sumatoria);
    }
}
