package hn.unah.rentaauto.rentaauto.servicios;

import hn.unah.rentaauto.rentaauto.modelos.TipoVehiculo;

public interface TipoVehiculoService {

    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    public boolean existeVehiculo(int idVehiculo);
}