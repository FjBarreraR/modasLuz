package com.safa.modasluz.controladores;

import com.safa.modasluz.dto.Pedido_productoPostDTO;
import com.safa.modasluz.modelos.Pedido_producto;
import com.safa.modasluz.servicios.Pedido_productoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Ruta: http://localhost:8080/

@RestController
@RequestMapping("/pedido_producto")
@AllArgsConstructor
public class Pedido_productoController {
    private Pedido_productoService pedido_productoService;

    @GetMapping("/all")
    public List<Pedido_producto> getPedidos_productos(){
        return pedido_productoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Pedido_producto getPedidos_productosPorId(@PathVariable Integer id) {
        return pedido_productoService.buscarPorIdPedido_producto(id);
    }

    @PostMapping("/post")
    public void postPedidos_productos(@RequestBody Pedido_productoPostDTO dto){
        pedido_productoService.crearPedido_producto(dto);
    }

    @PutMapping("/put/{id}")
    public void putPedidos_productos(@PathVariable Integer id, @RequestBody Pedido_productoPostDTO dto){
        pedido_productoService.editarPedido_producto(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePedidos_productos(@PathVariable Integer id){
        pedido_productoService.eliminarPedido_producto(id);
    }
}
