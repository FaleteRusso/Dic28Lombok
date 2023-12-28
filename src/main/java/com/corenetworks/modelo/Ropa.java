package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ropa implements Serializable {
    protected  double precio;
    protected String proveedor;
    private  int numPrendas;


    public String probar(){
        return "se está probando";
    }
    public String desinfectar(){
        return "se está desinfectando";
    }
    public String vender(){
        return "se está vendiendo";
    }


    }
