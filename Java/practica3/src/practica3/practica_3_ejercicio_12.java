package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_12 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        String S = " ", aux1 = " ", NS = " ";
        int N = 0, aux = 0;    
        boolean bandera;
        // PEDIR AL USUARIO LA VARIABLE Y VALIDAR SI SÍ ES UN ENTERO
        do{
            bandera = true;
            NS = JOptionPane.showInputDialog("INGRESE EL VALOR DE N");
            for (int i = 0 ; i < NS.length() ; i++){
                if (NS.charAt(i) < 48 || NS.charAt(i) > 57){
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "ERROR: ¡Entero NO válido!");
                    break;
                }
            }
        }while(bandera == false);
        N = Integer.parseInt(NS);
        if (N == 0){
            S = "SIENDO CERO, SU SERIE NO TIENE POSICIONES";
        }
        else{
            // PROCESAMIENTO
            for (int i = 1 ; i <= N ; i++){
                aux = 2 * i;
                aux1 = Integer.toString(aux);
                S += aux1 + " ";
            }
        }
        JOptionPane.showMessageDialog(null, S);   
    }
}
