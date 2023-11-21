package hn.unah.rentaauto.rentaauto.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.rentaauto.rentaauto.modelos.Vehiculos;
import hn.unah.rentaauto.rentaauto.repositorios.VehiculosRepository;
import hn.unah.rentaauto.rentaauto.servicios.VehiculosService;

@Service
public class VehiculosServiceImpl implements VehiculosService {

    @Autowired
    private VehiculosRepository vehiculoRepository;
    
    @Override
    public Vehiculos creaVehiculos(Vehiculos vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculos obtenerVehiculoId(int id) {
        return this.vehiculoRepository.findById(id).get();
    }

}