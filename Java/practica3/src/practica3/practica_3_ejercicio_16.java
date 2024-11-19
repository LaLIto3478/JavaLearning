package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_16 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float nota = 0, media = 0, numeronotas = 0;
        boolean bandera, fin;
        String validador = " ";
        
        // PROCESAMIENTO
        do {
            fin = false;
            do{
                    // VALIDAR QUE EL NÚMERO DADO SEA UN NÚMERO
                validador = JOptionPane.showInputDialog("INGRESE EL VALOR DE UNA NOTA\nNota: DEBE ser un valor entre 0 y 10.");
                    // VALIDAR QUE EL NÚMERO DADO NO SEA -30, SI LO ES, SE TERMINA LA INTRODUCCIÓN DE DATOS
                if ("-30".equals(validador)){
                   fin = true;
                   break;
                }
                bandera = true;
                
                for (int i = 0 ; i < validador.length() ; i++){
                        // VALIDAR QUE SEA UN NÚMERO
                    if (validador.charAt(i) < 46 || validador.charAt(i) == 47 || validador.charAt(i) > 57){
                        JOptionPane.showMessageDialog(null, "ERROR: Número NO válido");
                        bandera = false;
                        break;
                    }
                }
                if (bandera == true){
                        // VALIDAR QUE NO SEA MENOR DE CERO O MAYOR DE 10, SI SÍ, VUELVE A PEDIR EL DATO
                    nota = Float.parseFloat(validador);
                    if (nota >= 0){
                        if (nota <= 10){
                            media += nota;
                            numeronotas++; 
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "ERROR: Su nota DEBE ser entre 0 y 10!");
                            bandera = false;
                            break;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ERROR: Su nota DEBE ser entre 0 y 10!");
                        bandera = false;
                        break;
                    }
                }
            }while(bandera == false);
        }while(fin == false);
        
        media /= numeronotas;
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "La media de su conjunto de notas es: " + media);
    }
}