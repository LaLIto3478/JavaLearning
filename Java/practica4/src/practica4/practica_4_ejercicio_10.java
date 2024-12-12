package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_10 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0;
        boolean bandera, capicua = true;
        
        // PEDIR EL VALOR DE N
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N"));
                if(N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }else if(1000 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
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
                    arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                }
            }while(bandera == false);
        }
                
        // VERIFICAR SI ES UN CONJUNTO CAPICÚA
        int j = 0;
        for(int i = N - 1 ; i >= 0 ; i--){
            if(arreglo[j] != arreglo[i]){
                capicua = false;
                break;
            }
            j++;
        }
        
        // IMPRIMIR EN PANTALLA
        if(capicua == true){
            JOptionPane.showMessageDialog(null, "SI");
        }
        else{
            JOptionPane.showMessageDialog(null, "NO");
        }
    }
}
