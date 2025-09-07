package controllers;

import java.util.Scanner;
import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {

	private Scanner scanner = new Scanner(System.in);
	private PessoaRepository pessoaRepository = new PessoaRepository();

	public void cadastrarPessoa() {

		System.out.println("\nCADASTRO DE PESSOA: \n");

		var pessoa = new Pessoa();

		System.out.print("NOME DA PESSOA....:");
		pessoa.setNome(scanner.nextLine());

		System.out.print("EMAIL DA PESSOA...:");
		pessoa.setEmail(scanner.nextLine());
		
		pessoaRepository.insert(pessoa);

	}

	public void atualizarPessoa() {
		System.out.println("\nATUALIZAÇÃO DE PESSOA: \n");

		var pessoa = new Pessoa();
		
		System.out.print("ID DA PESSOA......: ");
		pessoa.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("NOME DA PESSOA....: ");
		pessoa.setNome(scanner.nextLine());
		
		System.out.print("EMAIL DA PESSOA...: ");
		pessoa.setEmail(scanner.nextLine());
		
		pessoaRepository.update(pessoa);
	}

	public void exluirPessoa() {
		System.out.println("\nEXCLUSÃO DE PESSOA:\n");
		
		System.out.print("ID DA PESSOA......: ");
		var id = Integer.parseInt(scanner.nextLine());
		
		pessoaRepository.delete(id);
	}

	public void consultarPessoa() {
		System.out.println("\nCONSULTA DE PESSOAS:\n");
		
		var lista = pessoaRepository.consultar();
		
		//FOREACH (varrendo cada pessoa contida na lista)
		for(var pessoa : lista) {
		System.out.println("ID......: " + pessoa.getId());
		System.out.println("NOME....: " + pessoa.getNome());
		System.out.println("EMAIL...: " + pessoa.getEmail());
		System.out.println("...");
		}
	}

}
