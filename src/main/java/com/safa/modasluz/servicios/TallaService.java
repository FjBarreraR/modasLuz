package com.safa.modasluz.servicios;

import com.safa.modasluz.dto.TallaPostDTO;
import com.safa.modasluz.modelos.Talla;
import com.safa.modasluz.repositorios.ITallaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TallaService {
    private ITallaRepository tallaRepository;

    public List<Talla> buscarTallas(){
        return tallaRepository.findAll();
    }

    public Talla buscarTallaPorId(Integer id){
        return tallaRepository.findById(id).orElse(null);
    }

    public void crearTalla(TallaPostDTO dto){
        Talla talla =  new Talla();

        talla.setDescripcion(dto.getDescripcion());

        tallaRepository.save(talla);
    }

    public void editarTalla(Integer id, TallaPostDTO dto){
        Talla talla = tallaRepository.findById(id).orElse(null);

        if(talla == null){
            talla.setDescripcion(dto.getDescripcion());

            tallaRepository.save(talla);
        }
    }

    public void eliminarTalla(Integer id){
        tallaRepository.deleteById(id);
    }
}
