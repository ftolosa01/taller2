/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import modelo.Venta;

/**
 *
 * @author frnano
 */
public class VentaDao extends Conexion{
    Conexion con;

    public VentaDao() {
        con = new Conexion();
    }
    
//        public void guardarRegistro(Venta  venta) {
//         Connection accesoBD = con.getConexion();
//        try {
//            String ps = con.prepareStatement("insert into venta (id_venta,sucursal,monto,fecha,id_Vendedor) values ("+venta.getId_venta()+venta.getSucursal()+venta.getMonto()+ venta.getFecha()+");");
//            
//            int res = ps.executeUpdate();
//            
//            if(res>0){
//                System.out.println("Dato ingresado correctamente");
//            }else{
//                System.out.println("Dato no ingresado");
//            }
//            
//            con.cerrarConexion();
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        
//    }
    
    
}
