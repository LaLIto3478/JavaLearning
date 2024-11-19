package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_24 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, numero = 0, sumatoria = 0;
        String validador = " ";
        boolean bandera;
        
        // PEDIR AL USUARIO LA CANTIDAD DE NÚMEROS A SUMAR Y VALIDAR QUE SEA UN NÚMERO
        do {
            validador = JOptionPane.showInputDialog("CUÁNTOS NÚMEROS SE SUMARÁN?");
            bandera = true;
            
            for (int i = 0 ; i < validador.length() ; i++){
                if (validador.charAt(i) < 48 || validador.charAt(i) > 57){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido, vuelva a ingresarlo.");
                    bandera = false;
                    break;
                }
            }
        }while(bandera == false);
        
        // PROCESAMIENTO
        N = Integer.parseInt(validador);
        for (int i = 0 ; i < N ; i++){
                    // PEDIR N NÚMEROS Y VALIDAR QUE SEAN NÚMEROS
            do {
                validador = JOptionPane.showInputDialog("INGRESE UN NÚMERO");
                bandera = true;
                
                for (int j = 0 ; j < validador.length() ; j++){
                    if (validador.charAt(j) < 48 || validador.charAt(j) > 57){
                        JOptionPane.showMessageDialog(null, "ERROSR: Entero NO válido, vuelva a ingresarlo.");
                        bandera = false;
                        break;
                    }
                }
            }while(bandera == false);
            numero = Integer.parseInt(validador);
            sumatoria += numero;
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, sumatoria);
    }
}
