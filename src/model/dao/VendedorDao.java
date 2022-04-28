package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Vendedor;

public interface VendedorDao {

	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Integer id);
	Vendedor findById(Integer Id);
	List<Vendedor> findAll();
	List<Vendedor> findByDepartamento(Departamento departamento);
}
