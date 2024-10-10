package umg.principal.DaseDatos.Service;

import umg.principal.DaseDatos.Dao.ProductoDAO;
import umg.principal.DaseDatos.model.Producto;

import java.sql.SQLException;
import java.util.List;

public class ProductoService {
    private ProductoDAO productoDAO;

    public ProductoService() {
        this.productoDAO = new ProductoDAO();
    }

    public void crearProducto(Producto producto) throws SQLException {
        productoDAO.insertar(producto);
    }

    public Producto obtenerProducto(int id) throws SQLException {
        return productoDAO.obtenerPorId(id);
    }

    public List<Producto> obtenerTodosPorOrden(String condicion) throws SQLException {
        return productoDAO.obtenerTodosPorOrden(condicion);
    }

    public List<Producto> obtenerTodosMenores20(String condicion) throws SQLException {
        return productoDAO.obtenerTodosMenores20(condicion);
    }

    public void actualizarProducto(Producto producto) throws SQLException {
        productoDAO.actualizar(producto);
    }

    public void eliminarProducto(int id) throws SQLException {
        productoDAO.eliminar(id);
    }
}
