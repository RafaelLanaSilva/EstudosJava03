package repositories;

import java.sql.DriverManager;

import entities.Pessoa;
import factories.ConnectionFactory;

public class PessoaRepository {
	
	private ConnectionFactory connectionFactory = new ConnectionFactory();
	
	public void insert(Pessoa pessoa) {
		
		try {
			//abrir conexão com o banco de dados
			var connection = connectionFactory.getConnection();
			
			var statement = connection.prepareStatement("INSERT INTO pessoa(nome, email) VALUES(?,?)");
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getEmail());
			statement.execute();
			
			connection.close();
			
			System.out.println("\nPESSOA CADASTRADA COM SUCESSO!");
		}
		catch (Exception e) {
			System.out.println("\nFALHA AO INSERIR PESSOA");
			System.out.println(e.getMessage());
		}
	}

}
