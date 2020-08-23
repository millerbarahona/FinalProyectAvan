
import Modelo.DAO.DetallePedidoDAO;
import Modelo.DAO.ProductoDAO;
import Modelo.DAO.UsuarioDAO;
import Modelo.DTO.Detalle_Pedido;
import Modelo.DTO.Producto;
import Modelo.DTO.Usuario;
import java.util.ArrayList;
import java.util.List;


public class main {
    
    public static void main(String[] args) {
        DetallePedidoDAO pp = new DetallePedidoDAO();
        Detalle_Pedido nuevo = new Detalle_Pedido();
        nuevo.setId_pedido(2);
        System.out.println("Holi");
        List<Detalle_Pedido> lista= new ArrayList<>();
        lista=pp.read(nuevo);
        for(Detalle_Pedido i: lista){
            System.out.println(i.getId_pedido()+" "+i.getProductoId() +" "+i.getCant_und());
        }
    }
    
}
