package hn.unah.rentaauto.rentaauto.servicios;

import java.util.List;

import hn.unah.rentaauto.rentaauto.modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public  List<Cliente> obtenerClientes();

    public Cliente obtenerClienteId(int id);

}