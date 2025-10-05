package com.safa.modasluz.controladores;

import com.safa.modasluz.dto.ClientePostDTO;
import com.safa.modasluz.dto.InventarioPostDTO;
import com.safa.modasluz.modelos.Cliente;
import com.safa.modasluz.modelos.Inventario;
import com.safa.modasluz.servicios.InventarioServive;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Ruta: http://localhost:8080/

@RestController
@RequestMapping("/inventario")
@AllArgsConstructor
public class InventarioController {
    private InventarioServive inventarioServive;

    @GetMapping("/all")
    public List<Inventario> getInventario() {
        return inventarioServive.buscarTodos();
    }

    @GetMapping("/{id}")
    public Inventario getInventarioPorId(@PathVariable Integer id) {
        return inventarioServive.buscarPorId(id);
    }

    @PostMapping("/post")
    public void postInventario(@RequestBody InventarioPostDTO dto) {
        inventarioServive.crearInventario(dto);
    }

    @PutMapping("/put/{id}")
    public void putInventario(@PathVariable Integer id, @RequestBody InventarioPostDTO dto) {
        inventarioServive.editarInventario(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInventario(@PathVariable Integer id) {
        inventarioServive.eliminarInventario(id);
    }
}
