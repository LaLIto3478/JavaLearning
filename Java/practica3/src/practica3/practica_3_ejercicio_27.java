package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_27 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int P1 = 0, P2 = 0, P3 = 0, P4 = 0, aux = 0;
        boolean bandera;
        
        // PEDIR VARIABLES Y VALIDAR QUE SEAN ENTEROS
        do{
            bandera = true;
            try{
                P1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA LONGITUD 1\n1 <= L <= 100"));
                P2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA LONGITUD 2\n1 <= L <= 100"));
                P3 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA LONGITUD 3\n1 <= L <= 100"));
                P4 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA LONGITUD 4\n1 <= L <= 100"));
                
                if (P1 < 1 || 100 < P1 || P2 < 1 || 100 < P2 || P3 < 1 || 100 < P3 || P4 < 1 || 100 < P4){
                    JOptionPane.showMessageDialog(null, "ERROR: Longitudes fuera de rango.\nVuelva a escribir los valores.");
                    bandera = false;
                }
                //PROCESAMIENTO
                if (P1 == P2){
                    if (P1 == P3){
                        JOptionPane.showMessageDialog(null, "1");
                    }
                    else{
                        if (P1 == P4){
                            JOptionPane.showMessageDialog(null, "1");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "0");
                        }
                    }
                }
                else{
                    if (P2 == P3){
                        if (P2 == P4){
                            JOptionPane.showMessageDialog(null, "1");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "0");
                        }
                    }
                    else{
                        if (P1 == P3){
                            if (P1 == P4){
                                JOptionPane.showMessageDialog(null, "1");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "0");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "0");
                        }
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Longitudes enteras NO válidas.\nVuelva a ingresar sus valores.");
                bandera = false;
            }
        }while(bandera == false);
    }
}
