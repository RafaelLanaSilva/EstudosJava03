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

	}

	public void exluirPessoa() {

	}

	public void consultarPessoa() {

	}

}
