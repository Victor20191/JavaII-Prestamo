package com.ps.services;

import com.ps.model.Cliente;

public interface IClienteService {
public Cliente registrar(Cliente cliente);

    Cliente getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(Long id);
}
