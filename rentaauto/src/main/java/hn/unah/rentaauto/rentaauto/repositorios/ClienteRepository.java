package hn.unah.rentaauto.rentaauto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.rentaauto.rentaauto.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}