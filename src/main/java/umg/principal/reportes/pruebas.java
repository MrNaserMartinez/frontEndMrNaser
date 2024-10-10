package umg.principal.reportes;

import umg.principal.DaseDatos.Service.ProductoService;
import umg.principal.DaseDatos.model.Producto;
import javax.swing.*;
import java.util.List;

public class pruebas {

    public static void GenerarReporte(String condicion) {
        try {
            List<Producto> prod = new ProductoService().obtenerTodosMenores20(condicion);
            //List<Producto> prod = new ProductoService().obtenerTodosLosProductos();
            new PdfReport().generateProductReport(prod, "C:\\tmp\\reporte.pdf");
            //mostrar un mensaje de que se genero el reporte
            //con jpanel
            JOptionPane.showMessageDialog(null, "Reporte generado en C:\\tmp\\reporte.pdf");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try{
           // List<Producto> prod = new ProductoService().obtenerTodosMenores30("precio >=200");
//            List<Producto> prod = new ProductoService().obtenerTodosLosProductos();
            List<Producto> prod = new ProductoService().obtenerTodosMenores20("cantidad >=20");
            new PdfReport().generateProductReport(prod, "C:\\tmp\\reporte.pdf");
            //mostrar un mensaje de que se genero el reporte
            //con jpanel
            JOptionPane.showMessageDialog(null, "Reporte generado en C:\\tmp\\reporte.pdf");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    public static void GenerarReportePorOrden(String condicion) {
        try {
            List<Producto> prod = new ProductoService().obtenerTodosPorOrden(condicion);
            //List<Producto> prod = new ProductoService().obtenerTodosLosProductos();
            new PdfReport().generateProductReport(prod, "C:\\tmp\\reporte.pdf");
            //mostrar un mensaje de que se genero el reporte
            //con jpanel
            JOptionPane.showMessageDialog(null, "Reporte generado en C:\\tmp\\reporte.pdf");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
