package com.ps.services;

import com.ps.model.Cliente;
import com.ps.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService  implements  IClienteService{

    private final ClienteRepository clienteRepository;
    @Override
    public Cliente registrar(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente getClienteById(Long id) {

        return  clienteRepository.getReferenceById(id);
    }

    @Override
    public Cliente createCliente(Cliente cliente)
    {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
