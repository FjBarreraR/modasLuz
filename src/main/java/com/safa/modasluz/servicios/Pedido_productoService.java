package com.safa.modasluz.servicios;

import com.safa.modasluz.dto.Pedido_productoPostDTO;
import com.safa.modasluz.modelos.Pedido_producto;
import com.safa.modasluz.repositorios.IPedido_productoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Pedido_productoService {
    private IPedido_productoRepository pedido_productoRepository;

    public List<Pedido_producto> buscarTodos() {
        return pedido_productoRepository.findAll();
    }

    public Pedido_producto buscarPorIdPedido_producto(Integer id) {
        return pedido_productoRepository.findById(id).orElse(null);
    }

    public void crearPedido_producto(Pedido_productoPostDTO dto) {
        Pedido_producto pedido_productoNuevo = new Pedido_producto();

        pedido_productoNuevo.setProducto(dto.getProducto());
        pedido_productoNuevo.setCantidad(dto.getCantidad());
        pedido_productoNuevo.setTalla( dto.getTalla());
        pedido_productoNuevo.setPedido(dto.getPedido());

        pedido_productoRepository.save(pedido_productoNuevo);
    }

    public void editarPedido_producto(Integer id, Pedido_productoPostDTO dto) {
        Pedido_producto pedido_producto = pedido_productoRepository.findById(id).orElse(null);

        if (pedido_producto != null) {
            pedido_producto.setProducto(dto.getProducto());
            pedido_producto.setCantidad(dto.getCantidad());
            pedido_producto.setTalla( dto.getTalla());
            pedido_producto.setPedido(dto.getPedido());

            pedido_productoRepository.save(pedido_producto);
        }
    }

    public void eliminarPedido_producto(Integer id) {
        pedido_productoRepository.deleteById(id);
    }
}
