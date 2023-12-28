package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Zapatos extends Ropa implements Serializable {
   private int tamanioTacon;
   public String cambiarTacon(){
       return "Se estría cambiando el tacon";
   }

    public Zapatos(double precio, String proveedor, int numPrendas, int tamanioTacon) {
        super(precio, proveedor, numPrendas);
        this.tamanioTacon = tamanioTacon;
    }

}
