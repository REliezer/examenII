package hn.unah.rentaauto.rentaauto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.rentaauto.rentaauto.modelos.Vehiculos;
import hn.unah.rentaauto.rentaauto.servicios.impl.TipoVehiculoServiceImpl;
import hn.unah.rentaauto.rentaauto.servicios.impl.VehiculosServiceImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculosController {

    @Autowired
    private VehiculosServiceImpl vehiculosServiceImpl;

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public Vehiculos crearTipoVehiculo(@RequestBody Vehiculos nuevoVehiculo){
        return this.vehiculosServiceImpl.creaVehiculos(nuevoVehiculo);
    }

    @GetMapping("/verVehiculos")
    public List<Vehiculos> obtenerClientes(){
        return this.vehiculosServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/buscar/{id}")
    public Vehiculos buscarCliente(@PathVariable(name = "id") int id){
        return this.vehiculosServiceImpl.obtenerVehiculoId(id);
    }
}