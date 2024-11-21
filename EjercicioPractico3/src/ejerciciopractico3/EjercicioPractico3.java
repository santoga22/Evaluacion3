
package ejerciciopractico3;

import javax.swing.JOptionPane;


public class EjercicioPractico3 {

    public static void main(String[] args) {
      int fila= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos"));
      int ventasTienda[][] = new int[7][fila];
        Ventas utilMatrix = new Ventas();
        utilMatrix.solData(ventasTienda, 7, fila);
        utilMatrix.printMatrix(ventasTienda, 7,fila);
        utilMatrix.random(ventasTienda, 7, fila);
        
        System.out.println("--------------------------");
    }
    
}
