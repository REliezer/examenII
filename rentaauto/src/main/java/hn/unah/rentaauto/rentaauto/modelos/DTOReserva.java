package hn.unah.rentaauto.rentaauto.modelos;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DTOReserva {
    private int codigoCliente;

    private int codigoVehiculo;

    private int cantidadDias;


}
