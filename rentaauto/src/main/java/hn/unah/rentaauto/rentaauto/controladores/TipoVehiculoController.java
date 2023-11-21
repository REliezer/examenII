package hn.unah.rentaauto.rentaauto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.rentaauto.rentaauto.modelos.TipoVehiculo;
import hn.unah.rentaauto.rentaauto.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipoVehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }
}