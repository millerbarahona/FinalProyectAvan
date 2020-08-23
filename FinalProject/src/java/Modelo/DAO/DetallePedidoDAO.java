/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.DTO.Detalle_Pedido;
import conexion.ConexionMsql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetallePedidoDAO {

    private static final String SQL_READ = "SELECT * FROM tb_detalle_pedido WHERE id_pedido = ?";
    private static final String SQL_READ_ALL = "select * from tb_detalle_pedido ";
    private static final String SQL_INSERT = "INSERT INTO tb_detalle_pedido (id_pedido, id_prod, cantidad_und) VALUES (?, ?, ?);";
    private static final String SQL_DELETE = "delete from tb_detalle_pedido where id_prod = ?";
    private static final String SQL_UPDATE = "update tb_detalle_pedido set cantidad_und = ? where id_pedido=? and id_prod=?";
    private static final ConexionMsql cnx = ConexionMsql.getInstance();

    public List<Detalle_Pedido> read(Detalle_Pedido index) {
        List<Detalle_Pedido> lst = null;
        PreparedStatement psnt;

        if (cnx != null) {
            try {
                psnt = cnx.getcnn().prepareStatement(SQL_READ);
                psnt.setInt(1, index.getId_pedido());
                ResultSet rs = psnt.executeQuery();
                lst = new ArrayList<>();
                while (rs.next()) {
                 Detalle_Pedido obj = new Detalle_Pedido(rs.getInt("id_pedido"), rs.getInt("id_prod"), rs.getInt("cantidad_und"));
                    lst.add(obj);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                cnx.cerrarConexion();
            }
        }
        return lst;
    }
}
