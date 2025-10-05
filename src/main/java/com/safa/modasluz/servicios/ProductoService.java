package com.safa.modasluz.servicios;

import com.safa.modasluz.dto.ProductoPostDTO;
import com.safa.modasluz.modelos.Producto;
import com.safa.modasluz.repositorios.IProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoService {
    private IProductoRepository productoRepository;

    public List<Producto> buscarProductos(){
        return productoRepository.findAll();
    }

    public Producto buscarProductoPorId(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

    public void crearProducto(ProductoPostDTO dto){
        Producto  producto = new Producto();
        producto.setColor(dto.getColor());
        producto.setPrecio(dto.getPrecio());
        producto.setDescripcion(dto.getDescripcion());
        producto.setTipo(dto.getTipo());

        productoRepository.save(producto);
    }

    public void editarProducto(Integer id, ProductoPostDTO dto){
        Producto producto = productoRepository.findById(id).orElse(null);

        if (producto != null){
            producto.setColor(dto.getColor());
            producto.setPrecio(dto.getPrecio());
            producto.setDescripcion(dto.getDescripcion());
            producto.setTipo(dto.getTipo());

            productoRepository.save(producto);
        }
    }

    public void eliminarProducto(Integer id){
        productoRepository.deleteById(id);
    }
}
