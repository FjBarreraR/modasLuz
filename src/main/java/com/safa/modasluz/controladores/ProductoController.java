package com.safa.modasluz.controladores;

import com.safa.modasluz.dto.ProductoPostDTO;
import com.safa.modasluz.modelos.Producto;
import com.safa.modasluz.servicios.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Ruta: http://localhost:8080/

@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoController {
    private ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> getProductos(){
        return productoService.buscarProductos();
    }

    @GetMapping("/{id}")
    public Producto getProductoPorId(@PathVariable Integer id) {
        return productoService.buscarProductoPorId(id);
    }

    @PostMapping("/post")
    public void postProductos(@RequestBody ProductoPostDTO dto){
        productoService.crearProducto(dto);
    }

    @PutMapping("/put/{id}")
    public void putProductos(@PathVariable Integer id, @RequestBody ProductoPostDTO dto){
        productoService.editarProducto(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductos(@PathVariable Integer id){
        productoService.eliminarProducto(id);
    }
}
