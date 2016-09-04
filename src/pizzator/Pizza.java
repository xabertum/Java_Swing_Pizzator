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
public class Pizza {

    String Tamanio;
    String Tipo;
    String Ingredientes[];
    float Precio;
    static int Num_Pedido;
    int Numero;
    
    static {
        Num_Pedido = 0;
    }

    public Pizza(String Tam, String Tipo, String Ingredientes[], float Precio) {
        this.Tamanio = Tam;
        this.Tipo = Tipo;
        this.Ingredientes = Ingredientes;
        this.Precio = Precio;
        Num_Pedido++;
        Numero = Num_Pedido;
    }

    public static int getNum_Pedido() {
        return Num_Pedido;
    }

    private String Mostrar_Ingredientes(){
        int C=0;
        String Ingrediente = "";
        while(Ingredientes[C] != null){
            Ingrediente = Ingredientes[C].toString();
            C++;
        }
        return Ingrediente;
    }
    
    
    @Override
    public String toString() {
        return "Pizza " + Numero + " " + Tamanio + " " + Tipo + " Ingredientes: " + Mostrar_Ingredientes() + " precio: " + Precio;    }
    
    

    
}
