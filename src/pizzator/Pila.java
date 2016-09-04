/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzator;

/**
 *
 * @author dam116
 */
public class Pila {

    private class Nodo {

        Nodo Sig;
        Object Pedidos;

        public Nodo() {
            Sig = null;
            Pedidos = null;
        }

        public Nodo(Pizza Pedido) {
            this.Pedidos = Pedido;
        }
    }
    private Nodo Primero;
    private Nodo Ultimo;

    public void Pila_Vacia() {
        Primero = null;
        Ultimo = null;
    }

    public boolean Esta_Vacia() {
        return Primero == null;
    }

    public void Insertar(Pizza Pedido) {
        Nodo Nuevo = new Nodo(Pedido);
        if (Ultimo != null) {
            Ultimo.Sig = Nuevo;
            Ultimo = Nuevo;
        } else {
            Primero = Nuevo;
            Ultimo = Nuevo;
        }
    }

    public Pizza Primero() {
        return (Pizza) Primero.Pedidos;
    }
    
    public void Mostrar_Todos() {
        Nodo Aux = Primero;

        while (Aux != null) {
            
            Aux = Aux.Sig;
        }
    }
}
