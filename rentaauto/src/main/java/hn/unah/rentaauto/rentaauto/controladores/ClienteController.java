package hn.unah.rentaauto.rentaauto.controladores;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.rentaauto.rentaauto.modelos.Cliente;
import hn.unah.rentaauto.rentaauto.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nuevoCliente) {
        Date fecha = new Date();
        if (nuevoCliente.getTipoCliente() != null) {
            nuevoCliente.getTipoCliente().setIdTipoCliente(nuevoCliente.getTipoCliente().getIdTipoCliente());
            nuevoCliente.setFechaIngreso(fecha);
        }
        return this.clienteServiceImpl.crearCliente(nuevoCliente);
    }

    @GetMapping("/verClientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/buscar/{id}")
    public Cliente buscarCliente(@PathVariable(name = "id") int id) {
        return this.clienteServiceImpl.obtenerClienteId(id);
    }

}