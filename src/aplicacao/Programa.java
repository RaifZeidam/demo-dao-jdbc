package aplicacao;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);

		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.findByDepartamento(departamento);
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}
		
		lista = vendedorDao.findAll();
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}
	}

}
