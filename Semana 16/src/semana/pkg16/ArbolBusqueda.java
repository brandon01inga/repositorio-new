/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg16;

/**
 *
 * @author LAB-USR-PIURA
 */
public class ArbolBusqueda {
    public static void preOrderValue(Nodo nodo_root) {
        if (nodo_root != null) {
            System.out.printf("%s", nodo_root.getValue());
            preOrderValue(nodo_root.getLchild());
            preOrderValue(nodo_root.getRchild());
            
        }
    }
    
    public static void preOrderKey(Nodo nodo_root) {
        if (nodo_root != null) {
            System.out.printf("%d", nodo_root.getKey());
            preOrderKey(nodo_root.getLchild());
            preOrderKey(nodo_root.getRchild());
            
        }
    }
    
    public static void inOrderValue(Nodo nodo_root) {
        if (nodo_root != null) {
            inOrderValue(nodo_root.getLchild());
            System.out.printf("%s", nodo_root.getValue());
            preOrderValue(nodo_root.getRchild());
            
        }
    }
    
    public static void inOrderKey(Nodo nodo_root) {
        if (nodo_root != null) {
            inOrderKey(nodo_root.getLchild());
            System.out.printf("%d-", nodo_root.getValue());
            inOrderKey(nodo_root.getRchild());
            
        }
    }  
    
    public static void postOrderValue(Nodo nodo_root) {
        postOrderValue(nodo_root.getLchild());
        postOrderValue(nodo_root.getRchild());
        System.out.printf("%s-"+nodo_root.getValue());
        
    }
    
    public static void postOrderKey(Nodo nodo_root) {
        if (nodo_root != null) {
            postOrderKey(nodo_root.getLchild());
            postOrderKey(nodo_root.getRchild());
            System.out.printf("%d-"+nodo_root.getKey());
        }
    }
    
    public static Nodo insertar(Nodo root, int key, String value) {
        if (root == null ) {
            root = new Nodo(key, value);
        } else if (key < root.getKey()) {
            root.setLchild(insertar(root.getLchild(), key, value));
        } else {
            root.setRchild(insertar(root.getRchild(), key, value));
        }
        return root;
    }
    
    public static Nodo buscar(Nodo root, int key) {
        if (root == null || key == root.getKey()) {
            return root;
        } 
        if (key < root.getKey()) {
            return buscar(root.getLchild(), key);
        }
        return buscar(root.getRchild(), key);
    }
    
    public static Nodo eliminar(Nodo root, int key) {
        if (root == null ) {
            return root;
        }
        
        if (key < root.getKey()) {
            root.setLchild(eliminar(root.getLchild(), key));
        } else if (key > root.getKey()) {
            root.setRchild(eliminar(root.getRchild(), key));
        } else {
            if (root.getLchild() == null && root.getRchild() == null) {
                return null;
            } else if (root.getLchild() == null) {
                return root.getRchild();
            } else if (root.getRchild() == null ){
                return root.getLchild();
            }
            
            Nodo temp = minValorNodo(root.getRchild());
            root.setKey(temp.getKey());
            root.setValue(temp.getValue());
            root.setRchild(eliminar(root.getRchild(), temp.getKey()));
        }
        return root;
    }
    
    public int minValorNodo(Nodo n) {
        return 0;
    }
    public static  Nodo minValorNodo (Nodo root){
        Nodo menor=root;
        while (menor!=null && menor.getLchild()!=null) {            
            menor=menor.getLchild();
        }
        return menor;
    }
    
}
