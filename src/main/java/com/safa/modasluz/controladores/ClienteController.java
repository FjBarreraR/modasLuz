package com.safa.modasluz.controladores;

import com.safa.modasluz.dto.ClientePostDTO;
import com.safa.modasluz.modelos.Cliente;
import com.safa.modasluz.servicios.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {
    // Servicio
    private ClienteService clienteService;

    @GetMapping("/all")
    public List<Cliente> getClientes() {
        return clienteService.buscarTodo();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Integer id) {
        return clienteService.buscarPorId(id);
    }

    @PostMapping("/post")
    public void postCliente(@RequestBody ClientePostDTO dto) {
        clienteService.crearCliente(dto);
    }

    @PutMapping("/put/{id}")
    public void putCliente(@PathVariable Integer id, @RequestBody ClientePostDTO dto) {
        clienteService.editarCliente(id, dto);
    }

    @DeleteMapping("/delete")
    public void postCliente(@PathVariable Integer id) {
        clienteService.eliminarCliente(id);
    }
}
