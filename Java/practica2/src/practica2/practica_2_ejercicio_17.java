package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_17 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int A = 0, B = 0, C = 0, E = 0, F = 0, G =0, H = 0, I = 0, J = 0;
        
        // PEDIR AL USUARIO LAS VARIABLES
        A = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN AÑO ENTRE 1583 Y 9999: "));
        if (1583 <= A){
            if (A <= 9999){
                // PROCESAMIENTO
                B = A / 100 + 1;
                C = ((3 * B) / 4) - 12;
                E = (A % 19) + 1;
                F = ((8 * B + 5) / 25) - (5 + C);
                G = 5 * A / 4 - (C + 10);
                H = ((11 * E) + 20 + F) % 30;
                if (H != 25){
                    if(H == 24){
                        H++;
                    }
                }
                else{
                    if (E > 11){
                        H++;
                        if (H == 24){
                            H++;
                        }
                    }
                    else{
                        if (H == 24){
                            H++;
                        }
                    }
                }
                I = 44 - H;
                if (I < 21){
                    I += 30;
                    J = (I + 7) - ((G + 1) % 7);
                }
                else{
                    J = (I + 7) - ((G + I) % 7);
                }

                if (J <= 31){
                    JOptionPane.showMessageDialog(null, J + " 3");
                }
                else{
                    JOptionPane.showMessageDialog(null, J-31 + " 4");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "FUERA DE RANGO.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "FUERA DE RANGO");
        }
    }
}
