/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author frnano
 */
public class Venta {
    private String id_venta; 
    private String sucursal;    
    private int monto;
    private int fecha;
    private int id_Vendedor;

    public Venta(String id_venta, String sucursal, int monto, int fecha, int id_Vendedor) {
        this.id_venta = id_venta;
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
        this.id_Vendedor = id_Vendedor;
    }



    public String getSucursal() {
        return sucursal;
    }

    public int getMonto() {
        return monto;
    }

    public int getFecha() {
        return fecha;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public String getId_venta() {
        return id_venta;
    }
    
    

}
