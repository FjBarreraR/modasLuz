package com.safa.modasluz.servicios;

import com.safa.modasluz.dto.InventarioPostDTO;
import com.safa.modasluz.modelos.Inventario;
import com.safa.modasluz.repositorios.IInventarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InventarioServive {
    private IInventarioRepository inventarioRepository;

    public List<Inventario> buscarTodos() {
        return inventarioRepository.findAll();
    }

    public Inventario buscarPorId(Integer id) {
        return inventarioRepository.findById(id).orElse(null);
    }

    public void crearInventario(InventarioPostDTO dto) {
        Inventario inventario = new Inventario();

        inventario.setProducto(dto.getProducto());
        inventario.setCantidad(dto.getCantidad());
        inventario.setTalla(dto.getTalla());

        inventarioRepository.save(inventario);
    }

    public void editarInventario(Integer id, InventarioPostDTO dto) {
        Inventario  inventario = inventarioRepository.findById(id).orElse(null);
        if (inventario != null) {
            inventario.setProducto(dto.getProducto());
            inventario.setCantidad(dto.getCantidad());
            inventario.setTalla(dto.getTalla());

            inventarioRepository.save(inventario);
        }
    }

    public void eliminarInventario(Integer id) {
        inventarioRepository.deleteById(id);
    }
}
