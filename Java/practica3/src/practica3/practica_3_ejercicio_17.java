package practica3;

import javax.swing.JOptionPane;
//import java.util.Random;

public class practica_3_ejercicio_17 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float pago = 0, total = 0;
        boolean bandera;
        String validador = " ";
        
        // PROCESAMIENTO
        for (int i = 0; i < 130 ; i++){
                //PEDIR UN PAGO Y VALIDAR QUE SEA UN NÚMERO
            do {
                validador = JOptionPane.showInputDialog("INGRESE EL DINERO DE UN PAGO");
                bandera = true;
                
                for (int j = 0 ; j < validador.length() ; j++){
                    if (validador.charAt(j) < 46 || validador.charAt(j) > 57 || validador.charAt(j) == 47){
                        JOptionPane.showMessageDialog(null, "ERROR: Cantidad del pago invalida.");
                        bandera = false;
                        break;
                    }
                }
            }while(bandera == false);
            
            pago = Float.parseFloat(validador);
//            Random random = new Random();                 SE UTILIZÓ LA CLASE PARA LAS PRUEBAS DE ESCRITORIO DEL PROGRAMA
//            pago = random.nextFloat((400 - 0) + 1);
            if (pago > 130){
                pago *= 0.85f;
                total += pago;
            }
            else{
                total += pago;
            }
        }
        
        // IMPRIMIR EN PANTALLA EL CONSUMO TOTAL
        JOptionPane.showMessageDialog(null, "El consumo total es: "+total);
    }
}
