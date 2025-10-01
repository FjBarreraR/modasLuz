package com.safa.modasluz.servicios;


import com.safa.modasluz.dto.ClientePostDTO;
import com.safa.modasluz.modelos.Cliente;
import com.safa.modasluz.repositorios.IClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {
    // Repositorio

    private IClienteRepository repository;

    /**
     * Consultar todo
     *
     * Obtener por id
     *
     * Crear
     *
     * Actualizar
     *
     * Eliminar
     */

    public List<Cliente> buscarTodo() {
        return repository.findAll();
    }

    public Cliente buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public void crearCliente(ClientePostDTO dto){
     Cliente clienteNuevo = new Cliente();

     clienteNuevo.setNombre(dto.getNombre());
     clienteNuevo.setCorreoElectronico(dto.getCorreoElectronico());
     clienteNuevo.setContrasenya( dto.getContrasenya());

     repository.save(clienteNuevo);
    }

    public void editarCliente(Integer id, ClientePostDTO dto){
        Cliente clienteNuevo = repository.findById(id).orElse(null);
        if (clienteNuevo != null){
            clienteNuevo.setNombre(dto.getNombre());
            clienteNuevo.setCorreoElectronico(dto.getCorreoElectronico());
            clienteNuevo.setContrasenya( dto.getContrasenya());

            repository.save(clienteNuevo);
        }
    }

    public void eliminarCliente(Integer id){
        repository.deleteById(id);
    }
}
