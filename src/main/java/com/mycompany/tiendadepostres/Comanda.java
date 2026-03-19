
package com.mycompany.tiendadepostres;


public class Comanda {
    private int nmesa;
    private int cantMesa;
    
    public Comanda(){}
   
   public int Mesa (int cantMesa){
       //saber si hay mesas libres o no
       return cantMesa;
   }
   public int Ingreso(int nmesa){
       // Lugar donde se quiere sentar
       return nmesa;
   }
   public int eliminarPedido (){
       return 0;
   }
   public int pedidoEntregado (){
       return 0;
   }
}
