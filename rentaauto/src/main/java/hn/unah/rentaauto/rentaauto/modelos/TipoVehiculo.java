package hn.unah.rentaauto.rentaauto.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipovehiculo")
    private int idTipoVehiculo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precioxhora")
    private double precioxhora;

    @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL)
    private List<Vehiculos> vehiculos = new ArrayList<>();

}