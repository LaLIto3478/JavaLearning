package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_8 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        String numeroS;
        int numero = 0, aux = 0, suma = 0;
        char aux2;
        boolean armstrong = true, bandera;
        do{
            // PEDIR VARIABLES
            suma = 0;
            aux = 0;
            numero = 0;
            aux2 =' ';
            do {
                numeroS = JOptionPane.showInputDialog("Ingrese su número");
                bandera = true;
                
                for (int i = 0 ; i < numeroS.length() ; i++){
                    if (numeroS.charAt(i) < 48 || numeroS.charAt(i) > 57){
                        JOptionPane.showMessageDialog(null, "ERROR: Número NO válido.");
                        bandera = false;
                        break;
                    } 
                }
            } while (bandera == false);
            if (!"0".equals(numeroS)){
                for (int i = 0 ; i < numeroS.length() ; i++){
                    aux = numeroS.charAt(i);
                    aux -= 48;
                    aux = (int) Math.pow(aux, numeroS.length());
                    suma += aux;
                }
                numero = Integer.parseInt(numeroS);
                if (suma == numero){
                    armstrong = false;
                    JOptionPane.showMessageDialog(null, "Su número: "+ numero+ " SÍ es un número de armstrong" );
                }
            }
            else{
                armstrong = false;
            }
        }while (armstrong);
    }
}
