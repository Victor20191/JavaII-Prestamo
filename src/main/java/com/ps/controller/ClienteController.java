package com.ps.controller;
import ch.qos.logback.core.net.server.Client;
import com.ps.model.Cliente;
import com.ps.services.IClienteService;
import com.ps.services.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController //Decir que esta clase es administrada o controlada por SPRING
@RequestMapping("/clientes") //Agregar una ruta para mi clase

public class ClienteController {

private final IClienteService iClienteService;//Implementar interface


    @GetMapping("/{id}") //Devuelve una lista de clientes
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = iClienteService.getClienteById(id);
        return ResponseEntity.ok(cliente);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente createdCliente =iClienteService.createCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Cliente> updateCliente( @RequestBody Cliente cliente) {
        Cliente updatedCliente = iClienteService.updateCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        iClienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }



}

