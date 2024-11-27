/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg16;

/**
 *
 * @author LAB-USR-PIURA
 */
public class Nodo {
     private Nodo Rchild;
    private Nodo Lchild;
    private int key;
    private String value;

    public Nodo() {
    }

    public Nodo(Nodo Rchild, Nodo Lchild, int key, String value) {
        this.Rchild = Rchild;
        this.Lchild = Lchild;
        this.key = key;
        this.value = value;
    }

    public Nodo(int key, String value) {
        this.Rchild = null;
        this.Lchild = null;
        this.key = key;
        this.value = value;
    }
    
    

    public Nodo getRchild() {
        return Rchild;
    }

    public void setRchild(Nodo Rchild) {
        this.Rchild = Rchild;
    }

    public Nodo getLchild() {
        return Lchild;
    }

    public void setLchild(Nodo Lchild) {
        this.Lchild = Lchild;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
