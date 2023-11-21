package hn.unah.rentaauto.rentaauto.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.rentaauto.rentaauto.modelos.Cliente;
import hn.unah.rentaauto.rentaauto.repositorios.ClienteRepository;
import hn.unah.rentaauto.rentaauto.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClienteId(int id) {
        return this.clienteRepository.findById(id).get();
    }

}