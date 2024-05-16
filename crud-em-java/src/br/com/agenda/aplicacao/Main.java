package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {
	
	/*
	 * CRUD
	 * C: CREATE
	 * R: READ
	 * U: UPDATE
	 * D: DELETE
	 */

	public static void main(String[] args) {
		
		// C: CREATE = Cria e salva o contato no banco
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("João Carlos Dias");
		contato.setIdade(85);
		contato.setDataCadastro(new Date());
		
		//contatoDAO.save(contato);
		
		// R: READ = Visualiza os registros do banco de dados (TODOS OS REGISTROS)
		for(Contato c : contatoDAO.getContatos())
			System.out.println("Contato: " + c.getNome());
		
		// U: UPDATE = Atualiza o contato no banco
		Contato c1 = new Contato();
		c1.setNome("Pedro dias Orlando");
		c1.setIdade(37);
		c1.setDataCadastro(new Date());
		c1.setId(10);//è o número que está no banco de dados da PK
		
		//contatoDAO.update(c1);
		
		// D: DELETE = Deleta o contato no banco, pelo número de ID
		contatoDAO.deleteByID(10);//è o número que está no banco de dados da PK
		

	}

}
