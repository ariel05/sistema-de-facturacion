package com.sistemadefacturacion.springboot.app.models.dao;

import java.util.List;

import com.sistemadefacturacion.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();

}
