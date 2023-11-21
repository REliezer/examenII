package hn.unah.rentaauto.rentaauto.servicios;

import java.util.List;

import hn.unah.rentaauto.rentaauto.modelos.Vehiculos;

public interface VehiculosService {

    public Vehiculos creaVehiculos(Vehiculos vehiculo);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos obtenerVehiculoId(int id);
}