package practica3;

import javax.swing.JOptionPane;
//import java.util.Random; CLASE UTILIZADA PARA LAS PRUEBAS DE ESCRITORIO

public class practica_3_ejercicio_18 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int maximo = 0, minimo = 0, numero = 0;
        boolean bandera;
//        Random random = new Random();         CLASE UTILIZADA PARA LAS PRUEBAS DE ESCRITORIO
        
        // PROCESAMIENTO
        do {
            bandera = true;
            
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO ENTERO"));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido. " + ex.getMessage());
                bandera = false;
            }
            
        }while(bandera == false);
//        numero = random.nextInt((10000 - 1000) + 1) + 1000;
        maximo = numero;
        minimo = numero;
        
        int i = 1;
        while (i < 100){
            do {
                bandera = true;
                
                try{
                    numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NÚMERO ENTERO"));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido. " + ex.getMessage());
                    bandera = false;
                }
                
            }while(bandera == false);
//            numero = random.nextInt((10000 - 1000) + 1) + 1000;
            if (numero > maximo){
                maximo = numero;
            }
            if (numero < minimo){
                minimo = numero;
            }
            i++;
        }
        // IMPRIMIR EN PANTALLA LOS VALORES MÁXIMOS Y MÍNIMOS
        JOptionPane.showMessageDialog(null, "Valor máximo: "+maximo+"\nValor mínimo: "+minimo);
    }
}
