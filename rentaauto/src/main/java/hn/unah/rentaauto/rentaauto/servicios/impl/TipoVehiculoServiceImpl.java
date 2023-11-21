package hn.unah.rentaauto.rentaauto.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.rentaauto.rentaauto.modelos.TipoVehiculo;
import hn.unah.rentaauto.rentaauto.modelos.Vehiculos;
import hn.unah.rentaauto.rentaauto.repositorios.TipoVehiculoRepository;
import hn.unah.rentaauto.rentaauto.repositorios.VehiculosRepository;
import hn.unah.rentaauto.rentaauto.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    private VehiculosRepository vehiculosRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);    

    }

    @Override
    public boolean existeVehiculo(int idVehiculo) {
        boolean existe = false;

        Vehiculos vehiculo = this.vehiculosRepository.findById(idVehiculo).get();
        if (vehiculo != null) {
            existe = true;
        }
        return existe;
    }
    

}