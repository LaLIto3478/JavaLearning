package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_9 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, maximo = 0, M = 0;
        boolean bandera;
        String salida = "";
        
        // PEDIR EL VALOR DE N
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N"));
                if(N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }else if(100 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido.");
                bandera = false;
            }
        }while(bandera == false);
        
        // CREAR EL ARREGLO
        int arreglo[] = new int[N];
        
        // LLENAR EL ARREGLO
        for(int i = 0 ; i < N ; i++){
            do{
                bandera = true;
                try{
                    arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo."));
                    if(arreglo[i] < 0){
                        JOptionPane.showMessageDialog(null, "ERROR: Debe ser un valor POSITIVO");
                        bandera = false;
                    }                    
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
        
        // PROCESAMIENTO
        maximo = arreglo[0];
        for(int i = 0; i < N ; i++){
            if(maximo < arreglo[i]){
                maximo = arreglo[i];
            }
        }
        
        // CREAR SALIDA
        for(int i = 0 ; i < N ; i++){
            if(arreglo[i] != maximo){
                salida += arreglo[i] + " ";
                M++;
            }
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, M +"\n"+salida);
    }
}
