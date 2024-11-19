package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_22 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int p = 0, s = 0, r = 0, d = 0, aux = 0;
        boolean bandera;
        
        // PEDIR AL USUARIO VARIABLES Y VALIDAR QUE SEAN ENTEROS
        do{
            bandera = true;
            try{
                p = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA PROFUNDIDAD DEL AGUJERO"));
                s = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE METROS QUE SUBE DIARIO"));
                r = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE METROS QUE RESBALA DIARIO"));
                
                if (s <= r){
                    JOptionPane.showMessageDialog(null, "ERROR: La cantidad de metros que sube diario DEBE ser mayor a la que se resbala.");
                    bandera = false;
                }
                
                if (p < 1 || p > 1000000){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                
                if (s < 1 || s > 1000000){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                
                if (r < 1 || r > 1000000){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido: "+ ex.getMessage());
                bandera = false;
            }
        } while(bandera == false);
        
        //PROCESAMIENTO
        while (aux < p){
            aux += s;
            if (aux < p){
                aux -= r;
            }
            d++;
        }
        
        // IMPRIMIR EN PANTALLA EL RESULTADO
        JOptionPane.showMessageDialog(null, "El caracol tardará "+d+" dias en salir del agujero.");
    }
}
