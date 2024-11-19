package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_4 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int numero = 0, pares = 0, impares = 0, positivos = 0, negativos = 0;
        boolean bandera;
        String validador = " ";
        
        // PROCESAMIENTO
        int i = 0;
        while (i < 50){
                // PEDIR AL USUARIO UN NÚMERO Y VALIDAR QUE SEA UN DÍGITO
            do{
                validador = JOptionPane.showInputDialog("INGRESE UN NÚMERO ENTERO");
                bandera = true;
                
                for (int j = 0 ; j < validador.length() ; j++){
                    if (validador.charAt(j) < 45 || validador.charAt(j) > 57 || validador.charAt(j) == 47 || validador.charAt(j) == 46){
                        JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                        bandera = false;
                        break;
                    } 
                }
            }while (bandera == false);
            
                // CLASIFICAR A QUÉ GRUPO PERTENECE
            numero = Integer.parseInt(validador);
            if (numero % 2 == 0){
                if (numero > 0){
                    pares++;
                    positivos++;
                }
                else if (numero < 0){
                    pares++;
                    negativos++;
                }
            }
            else{
                if (numero > 0){
                    impares++;
                    positivos++;
                }
                else if (numero < 0){
                    impares++;
                    negativos++;
                }
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "ESTADÍSTICA DE NÚMEROS DADOS"+ "\nPARES: "+pares+"\nIMPARES: "+impares+"\nPOSITIVOS: "+positivos+"\nNEGATIVOS: "+negativos);
    }
}
