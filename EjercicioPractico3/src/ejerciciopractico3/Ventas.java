/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Ventas {

    public void printMatrix(int matrix[][], int a, int fila) {

        String result = "";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < fila; j++) {
                result = result + matrix[i][j] + "-";
            }
            result = result + "\n";
            
        }
        JOptionPane.showMessageDialog(null, result);

    }

    public void definirFilas(int matrix[][], int a, int col) {
        col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos"));
    }

    public void solData(int matrix[][], int a, int fila) {
        String result = "";
        for (int i = 0; i < a; i++) {
            Random rand = new Random();
            for (int j = 0; j < fila; j++) {
            }
        }
        
    }

    public void llenaArreglo(int matrix[][], int a, int fila) {
        int[] array = null;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < fila; j++) {
                Random rand = new Random();
                matrix[i][j] = rand.nextInt(9, 9);
            }

        }
    }

    public void imprimeArreglo(int matrix[][], int a, int fila) {
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            result = result + "Valor " + i + ":" + matrix[i] + "\n";
            for (int j = 0; j < fila; j++) {
            }

        }
        JOptionPane.showMessageDialog(null, result);

    }
public void random(int matrix[][], int a, int fila) {
        String result = "";
        for (int i = 0; i < a; i++) {
            Random rand = new Random();
            for (int j = 0; j < fila; j++) {
                matrix[i][j] = rand.nextInt(9, 9);
            }
        }
}
}