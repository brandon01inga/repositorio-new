/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9algortimos;


public class NodoCircular {
    private NodoCircular sgte;
    private int dato;

    public NodoCircular(NodoCircular sgte, int dato) {
        this.sgte = sgte;
        this.dato = dato;
    }

    public NodoCircular getSgte() {
        return sgte;
    }

    public void setSgte(NodoCircular sgte) {
        this.sgte = sgte;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
}
