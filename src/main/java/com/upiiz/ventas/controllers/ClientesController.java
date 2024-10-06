package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {

    // Listado de todos los clientes - GET
    @GetMapping
    public String listarClientes() {
        return "Listado de Clientes - GET";
    }

    // Obtener un cliente por ID - GET
    @GetMapping("/{id}")
    public String listarCliente(@PathVariable int id) {
        return "Obtener un cliente por ID - GET " + id;
    }

    // Agregar un cliente - POST
    @PostMapping
    public String agregarCliente(@RequestBody String cliente) {
        return "Agregar cliente - POST " + cliente;
    }

    // Actualizar un cliente por ID - PUT
    @PutMapping("/{id}")
    public String editarCliente(@PathVariable int id, @RequestBody String cliente) {
        return "Editar cliente - PUT " + cliente + " con ID " + id;
    }

    // Eliminar un cliente por ID - DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id) {
        return "Eliminar cliente por ID - DELETE " + id;
    }

    // Obtener todas las facturas de un cliente por ID - GET
    @GetMapping("/{id}/facturas")
    public String listarFacturasCliente(@PathVariable int id) {
        return "Obtener todas las facturas del cliente con ID " + id + " - GET";
    }

    // Obtener una factura específica de un cliente - GET
    @GetMapping("/{clienteId}/facturas/{facturaId}")
    public String listarFacturaCliente(@PathVariable int clienteId, @PathVariable int facturaId) {
        return "Obtener la factura con ID " + facturaId + " del cliente con ID " + clienteId + " - GET";
    }
}
