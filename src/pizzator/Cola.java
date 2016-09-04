/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzator;

/**
 *
 * @author juanr
 */
public class Cola {
    
    private class Nodo {

        Nodo Sig;
        Pizza Pedidos;

        public Nodo() {
            Sig = null;
            Pedidos = null;
        }

        public Nodo(Pizza Pedido) {
            this.Pedidos = Pedido;
        }

    }

    public Cola() {
    }

    private Nodo Primero;
    private Nodo Ultimo;
    private Nodo Lista;

    public void Cola_Vacia() {
        Primero = null;
        Ultimo = null;
        Lista = null;
    }

    public boolean Esta_Vacia() {
        return Lista == null;
    }

    public void Insertar(Pizza Pedido) {
        Nodo Nuevo = new Nodo(Pedido);
        if (Ultimo != null) {
            Ultimo.Sig = Nuevo;
            Ultimo = Nuevo;
        } else {
            Lista = Nuevo;
            Primero = Nuevo;
            Ultimo = Nuevo;
        }

    }

    public Pizza Primero() {
        return Primero.Pedidos;
    }

    public void Quitar() {
        if (Primero != null) {
            Primero = Primero.Sig;
            Lista = Primero;
            if (Lista == null) {
                Ultimo = null;
            }
        }
    }
}
