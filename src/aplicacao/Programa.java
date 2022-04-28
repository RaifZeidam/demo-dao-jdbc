package aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
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
		
		Vendedor newVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(newVendedor);
		System.out.println("Inserido. Novo id: " + newVendedor.getId());
		
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Martha Waine");
		vendedorDao.update(vendedor);
		System.out.println("Atualização completa");
		
		System.out.println("id para teste de deleção: ");
		int id = sc.nextInt();
		vendedorDao.deleteById(id);
		System.out.println("Deleção completa");
		
		sc.close();
	}

}
