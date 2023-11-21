package hn.unah.rentaauto.rentaauto.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.rentaauto.rentaauto.modelos.TipoCliente;
import hn.unah.rentaauto.rentaauto.repositorios.TipoClienteRepository;
import hn.unah.rentaauto.rentaauto.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);

        return this.tipoClienteRepository.save(tipoCliente);

    }

}