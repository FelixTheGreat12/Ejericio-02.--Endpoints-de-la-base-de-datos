package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")

public class CategoriaController  {

    //Respuesta para todas las categorias - GET
    @GetMapping
    public String listarCategorias() {
        return "Listado de Categorias - GET";
    }
    //Respuesta para una categoria por id - GET
    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id) {
        return "Obtener una categoria por ID - GET";
    }
    // Agrega una categoria
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar categoria - POST" + categoria;
    }
    //Eliminar categoria - DELETE
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id) {
        return "Obtener una categoria por ID - DELETE" + id;
    }

    //Actualizar una categoria
    @PutMapping("/{id}")
    public String editarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Editar categoria - PUT" + categoria + "Con ID" + id;
    }
}
