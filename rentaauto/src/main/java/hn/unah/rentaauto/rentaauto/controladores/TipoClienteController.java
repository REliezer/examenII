package hn.unah.rentaauto.rentaauto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.rentaauto.rentaauto.modelos.TipoCliente;
import hn.unah.rentaauto.rentaauto.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipoCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestBody String descripcion){
        
        return this.tipoClienteServiceImpl.crearTipoCliente(descripcion);
    }
}