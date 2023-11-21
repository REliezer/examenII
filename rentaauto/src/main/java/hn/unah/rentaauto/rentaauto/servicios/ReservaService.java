package hn.unah.rentaauto.rentaauto.servicios;

import hn.unah.rentaauto.rentaauto.modelos.DTOReserva;
import hn.unah.rentaauto.rentaauto.modelos.Reserva;

public interface ReservaService {

    public Reserva crearReserva(DTOReserva reserva);
}