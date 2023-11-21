package hn.unah.rentaauto.rentaauto.servicios.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.rentaauto.rentaauto.modelos.DTOReserva;
import hn.unah.rentaauto.rentaauto.modelos.Reserva;
import hn.unah.rentaauto.rentaauto.modelos.Vehiculos;
import hn.unah.rentaauto.rentaauto.repositorios.ReservaRepository;
import hn.unah.rentaauto.rentaauto.repositorios.VehiculosRepository;
import hn.unah.rentaauto.rentaauto.servicios.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculosRepository vehiculoRepository;

    private boolean estadoVehiculo(int idVehiculo) {
        Vehiculos estadoVehiculo = this.vehiculoRepository.findById(idVehiculo).get();
        return estadoVehiculo.getDisponible();
    }

    private Vehiculos cambiarEstado(int idVehiculo, boolean estado) {
        Vehiculos vehiculo = this.vehiculoRepository.findById(idVehiculo).get();
        if (vehiculo != null) {
            vehiculo.setDisponible(estado);

        }
        return vehiculo;
    }

    @Override
    public Reserva crearReserva(DTOReserva reserva) {
        Reserva nuevaReserva = new Reserva();
        boolean estado = this.estadoVehiculo(reserva.getCodigoVehiculo());
        Date fecha = new Date();

        if (estado) {
            nuevaReserva.setIdCliente(reserva.getCodigoCliente());
            nuevaReserva.setIdVehiculo(reserva.getCodigoVehiculo());
            nuevaReserva.setDias(reserva.getCantidadDias());
            nuevaReserva.setFecha(fecha);
            nuevaReserva.setTotal(reserva.getCantidadDias());

        }
        return this.reservaRepository.save(nuevaReserva);
    }

}