/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Vendedor;

/**
 *
 * @author frnano
 */
public class VendedorDao {

    Conexion con;

    public VendedorDao() {
        con = new Conexion();
    }

    public ArrayList<Vendedor> getVendedor() {

        ArrayList<Vendedor> vendedor = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM vendedor ";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                String id = resultados.getString("id");
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                vendedor.add(new Vendedor(id, nombre, apellido, rut));
            }
            accesoBD.close();
            return vendedor;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }

    }
}
