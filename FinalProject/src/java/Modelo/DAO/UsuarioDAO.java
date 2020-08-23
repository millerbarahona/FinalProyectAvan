package Modelo.DAO;

import Modelo.DTO.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDAO {
    private static final String SQL_READ = "select * from tb_usuario where id_usu = ?";
    private static final String SQL_READ_ALL = "select * from tb_usuario";
    private static final String SQL_INSERT = "insert into tb_usuario (nombres,apellidos,tipo_docto,num_docto,ciudad_residencia,direccion,rol) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "delete from tb_usuario where id_usu = ?";
    private static final String SQL_UPDATE = "update tb_usuario set nombres = ?,apellidos = ?,tipo_docto = ?,num_docto = ?,ciudad_residencia = ?,direccion = ?,rol = ?";
    private static final ConexionMsql cnx = ConexionMsql.getInstance();
    
    public boolean create(Usuario nuevo) {
        PreparedStatement ps;
        try {
            ps = cnx.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, nuevo.getNombres());
            ps.setString(3, nuevo.getApellidos());
            ps.setString(5, nuevo.getTipo_docto());
            ps.setString(6, nuevo.getNumero_docto());
            ps.setString(7, nuevo.getCiudad_residencia());
            ps.setString(8, nuevo.getDireccion());
            ps.setDate(9, nuevo.getRol());
            ps.setString(10, nuevo.getEstado());

            if (ps.executeUpdate() > 0) {
                System.out.println("se agrego");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        } finally {
            cnx.cerrarConexion();
        }
        return false;
    }
}
