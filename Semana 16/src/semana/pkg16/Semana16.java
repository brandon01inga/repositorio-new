/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg16;

/**
 *
 * @author LAB-USR-PIURA
 */
public class Semana16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo root = null;
        root = ArbolBusqueda.insertar(root, 50, "A");
        ArbolBusqueda.insertar(root, 20, "B");
        ArbolBusqueda.insertar(root, 60, "C");
        ArbolBusqueda.insertar(root, 10, "D");
        ArbolBusqueda.insertar(root, 25, "E");
        ArbolBusqueda.insertar(root, 55, "F");

        ArbolBusqueda.inOrderKey(root);
        System.out.println();
        ArbolBusqueda.preOrderKey(root);
        System.out.println();
        ArbolBusqueda.postOrderKey(root);

        Nodo res = ArbolBusqueda.buscar(root, 100);
        if (res == null) {
            System.out.printf("\nNOdo se encuentra");
        } else {
            System.out.printf("\n el valor de la clave es-> %s", res.getValue());
        }

        Nodo el = ArbolBusqueda.eliminar(root, 20);
         if (el) {
            System.out.printf("\nNodo con clave 20 fue eliminado.");
        } else {
            System.out.printf("\nNodo con clave 20 no fue encontrado.");
        }
    }

}
