package hn.unah.rentaauto.rentaauto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.rentaauto.rentaauto.modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}