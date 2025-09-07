package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;
import factories.ConnectionFactory;

public class PessoaRepository {

	private ConnectionFactory connectionFactory = new ConnectionFactory();

	public void insert(Pessoa pessoa) {

		try {
			// abrir conexão com o banco de dados
			var connection = connectionFactory.getConnection();

			var statement = connection.prepareStatement("INSERT INTO pessoa(nome, email) VALUES(?,?)");
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getEmail());
			statement.execute();

			connection.close();

			System.out.println("\nPESSOA CADASTRADA COM SUCESSO!");
		} catch (Exception e) {
			System.out.println("\nFALHA AO INSERIR PESSOA");
			System.out.println(e.getMessage());
		}
	}

	public void update(Pessoa pessoa) {
		try {
			var connection = connectionFactory.getConnection();

			var statement = connection.prepareStatement("UPDATE pessoa SET nome=?, email=? WHERE id=?");
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getEmail());
			statement.setInt(3, pessoa.getId());

			if (statement.executeUpdate() > 0) {
				System.out.println("\nPESSOA ATUALIZADA COM SUCESSO");
			} else {
				System.out.println("\nNENHUM REGISTRO FOI ALTERADO. VERIFIQUE O ID INFORMADO.");
			}

			connection.close();
		} catch (Exception e) {
			System.out.println("\nFALHA AO ATUALIZAR PESSOA:");
			System.out.println(e.getMessage());
		}
	}

	public void delete(Integer id) {
		try {
			var connection = connectionFactory.getConnection();
			
			var statement = connection.prepareStatement("DELETE FROM pessoa WHERE id=?");
			statement.setInt(1, id);
			
			if(statement.executeUpdate() > 0) {
				System.out.println("\nPESSOA EXCLUÍDA COM SUCESSO!");
			}
			else {
				System.out.println("\nNENHUM REGISTRO EXCLUÍDO, VERIFIQUE O ID INFORMADO.");
			}
			
			connection.close();
		}
		catch (Exception e) {
			System.out.println("\nFALHA AO EXCLUIR PESSOA:");
			System.out.println(e.getMessage());
		}
		
	}
	
	public List<Pessoa> consultar(){
		try {
			var connection = connectionFactory.getConnection();
			
			var statement = connection.prepareStatement("SELECT id, nome, email FROM pessoa ORDER BY id");
			var result = statement.executeQuery();
			
			//declarando uma lista de objetos da classe Pessoa
			var lista = new ArrayList<Pessoa>();
			
			//percorrer cada registro obtido do banco de dados
			while(result.next()) {
				var pessoa = new Pessoa();
				//criando um objeto da classe Pessoa
				pessoa.setId(result.getInt("id"));
				//capturando o campo 'id'
				pessoa.setNome(result.getString("nome"));
				//capturando o campo 'nome'
				pessoa.setEmail(result.getString("email"));
				//capturando o campo 'email'
				
				lista.add(pessoa);
				//adicionando cada pessoa dentro da lista
			}
			
			connection.close();
			return lista; //retornar a lista de pessoas
			
		}
		catch (Exception e) {
			System.out.println("\nFALHA AO CONSULTAR PESSOAS:");
			System.out.println(e.getMessage());
			return null;
		}
	}

}
