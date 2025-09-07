package principal;

import java.util.Scanner;

import controllers.PessoaController;

public class Main {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		System.out.println("\nSISTEMA DE CONTROLE DE PESSOAS:\n");
		
		System.out.println("(1) CADASTRAR");
		System.out.println("(2) ATUALIZAR");
		System.out.println("(3) EXCLUIR");
		System.out.println("(4) CONSULTAR");
		
		System.out.print("\nINFORME A POÇÃO DESEJADA");
		var opcao = scanner.nextLine();
		
		var pessoaController = new PessoaController();
		
		switch(opcao) {
		case "1":
			pessoaController.cadastrarPessoa();
			break;
		case "2":
			pessoaController.atualizarPessoa();
			break;
		case "3":
			pessoaController.exluirPessoa();
			break;
		case "4":
			pessoaController.consultarPessoa();
			break;
		default:
			System.out.println("\nOPÇÃO INVÁLIDA");
			break;
		}
		
		System.out.print("\nDESEJA REALIZAR OUTRA OPERAÇÃO? (S,N):");
		
		var escolha = scanner.nextLine();
		
		if("S".equalsIgnoreCase(escolha)) {
			main(args);
		}
		else {
			System.out.println("\nFIM DO PROGRAMA!");
		}
		
		scanner.close();
		

	}

}
