package aplicacao;

import java.util.Scanner;

import arvores.ABBint;

public class Teste {

	public static void main(String[] args) {
		
		ABBint abb = new ABBint();
		
		Scanner le = new Scanner(System.in);
		int opcao;
		do {
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Inserir");
			System.out.println(" 2 - Apresentar ABB em ordem crescente");
			System.out.println(" 3 - Contagem do número de nós");
			System.out.println(" 4 - Busca de número na árvore");
			opcao = le.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Encerrada a execução");
				break;
			case 1:
				System.out.println("Informe o valor a ser inserido");
				int info = le.nextInt();
				abb.root = abb.inserir(abb.root, info);
				break;
			case 2:
				System.out.println("Apresentação da ABB");
				abb.listaEmOrdem(abb.root);
				break;
			case 3:
				System.out.println("Número de nós da arvore: " + abb.contaNos(abb.root, 0));
				break;
			case 4:
				System.out.print("Informe o valor a ser pesquisado: ");
				int num = le.nextInt();
				abb.consulta(abb.root, num);
			default:
				System.out.println("Opção inválida");
			}
		}while(opcao != 0);

	}

}
