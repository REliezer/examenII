package hn.unah.rentaauto.rentaauto.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="reserva")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int idReserva;

    @Column(name="idcliente")
    private int idCliente;

    @Column(name="idvehiculo")
    private int idVehiculo;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="dias")
    private int dias;

    @Column(name="total")
    private double total;

}