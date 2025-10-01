package com.safa.modasluz.servicios;

import com.safa.modasluz.dto.PedidoPostDTO;
import com.safa.modasluz.modelos.Pedido;
import com.safa.modasluz.repositorios.IPedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService {
    private IPedidoRepository pedidoRepository;

    public List<Pedido> buscarTodos() {
       return pedidoRepository.findAll();
    }

    public Pedido buscarPorId(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void crearPedido(PedidoPostDTO dto) {
        Pedido pedidoNuevo = new  Pedido();

        pedidoNuevo.setCliente(dto.getCliente());
        pedidoNuevo.setPrecio(dto.getPrecio());
        pedidoNuevo.setFecha(dto.getFecha());

        pedidoRepository.save(pedidoNuevo);
    }

    public void editarPedido(Integer id, PedidoPostDTO dto) {
        Pedido pedido = pedidoRepository.findById(id).orElse(null);

        if (pedido != null) {
            pedido.setCliente(dto.getCliente());
            pedido.setPrecio(dto.getPrecio());
            pedido.setFecha(dto.getFecha());

            pedidoRepository.save(pedido);
        }
    }

    public void eliminarPedido(Integer id) {
        pedidoRepository.deleteById(id);
    }
}
