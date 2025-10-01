package com.safa.modasluz.controladores;

import com.safa.modasluz.dto.PedidoPostDTO;
import com.safa.modasluz.modelos.Pedido;
import com.safa.modasluz.servicios.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Ruta: http://localhost:8080/

@RestController
@RequestMapping("/pedido")
@AllArgsConstructor
public class PedidoController {
    private PedidoService pedidoService;

    @GetMapping("/all")
    public List<Pedido> getPedidos() {
        return pedidoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable Integer id) {
        return pedidoService.buscarPorId(id);
    }

    @PostMapping("/post")
    public void postPedido(@RequestBody PedidoPostDTO dto) {
        pedidoService.crearPedido(dto);
    }

    @PutMapping("/put/{id}")
    public void putPedido(@PathVariable Integer id, @RequestBody PedidoPostDTO dto) {
        pedidoService.editarPedido(id, dto);
    }

    @DeleteMapping("/delete")
    public void deletePedido(@PathVariable Integer id) {
        pedidoService.eliminarPedido(id);
    }
}
