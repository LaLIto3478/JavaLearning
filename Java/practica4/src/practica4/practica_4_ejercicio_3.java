package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_3 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0;
        boolean bandera, iguales = true;
        
        // PEDIR AL USUARIO EL TAMAÑO DE LAS SECUENCIAS
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA LONGITUD DE SUS SECUENCIAS"));
                if(N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (100 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        // CREAR SECUENCIAS
        int secuencia1[] = new int[N];
        int secuencia2[] = new int[N];
        
        // LLENAR PRIMER ARREGLO
        for(int i = 0 ; i < N ; i++){
            do{
                bandera = true;
                try{
                    secuencia1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del primer entero."));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
        
        // LLENAR SEGUNDO ARREGLO
        for(int i = 0 ; i < N ; i++){
            do{
                bandera = true;
                try{
                    secuencia2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del segundo arreglo."));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
        
        // COMPARAR  ARREGLOS
        for(int i = 0 ; i < N ; i++){
            if (secuencia1[i] != secuencia2[i]){
                iguales = false;
                break;
            }
        }
        
        // IMPRIMIR UNO SI SON IGUALES Y 0 EN OTRO CASO
        if (iguales == false){
            JOptionPane.showMessageDialog(null, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, 1);
        }
    }
}
