package com.safa.modasluz;

import com.safa.modasluz.modelos.Cliente;
import com.safa.modasluz.modelos.Inventario;
import com.safa.modasluz.repositorios.IClienteRepository;
import com.safa.modasluz.repositorios.IInventarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ModasLuzApplicationTests {

    @Autowired
    private IInventarioRepository repository;

    @Test
    void consultarTodosClientes() {
        List<Inventario> inventario = repository.findAll();

        for (Inventario i :inventario) {
            System.out.println(i);
        }

    }

    @Test
    void crearCliente() {

    }

    @Test
    void editarCliente() {

    }

    @Test
    void eliminarCliente() {



    }

}
