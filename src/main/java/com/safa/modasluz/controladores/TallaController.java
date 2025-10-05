package com.safa.modasluz.controladores;

import com.safa.modasluz.dto.ProductoPostDTO;
import com.safa.modasluz.dto.TallaPostDTO;
import com.safa.modasluz.modelos.Producto;
import com.safa.modasluz.modelos.Talla;
import com.safa.modasluz.servicios.TallaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/talla")
@AllArgsConstructor
public class TallaController {
    private TallaService tallaService;

    @GetMapping("/all")
    public List<Talla> getTallas(){
        return tallaService.buscarTallas();
    }

    @GetMapping("/{id}")
    public Talla getTallaPorId(@PathVariable Integer id) {
        return tallaService.buscarTallaPorId(id);
    }

    @PostMapping("/post")
    public void postTalla(@RequestBody TallaPostDTO dto){
        tallaService.crearTalla(dto);
    }

    @PutMapping("/put/{id}")
    public void putTalla(@PathVariable Integer id, @RequestBody TallaPostDTO dto){
        tallaService.editarTalla(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTalla(@PathVariable Integer id){
        tallaService.eliminarTalla(id);
    }
}
