package tarefa_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/*1)Elabore uma classe cadastro que adiciona os alunos de uma sala de aula. A classe Aluno terá RA,
	neme, endereço, telefone, e 4 notas. As 4 notas serão guardadas usando List e ArrayList.
	A classe cadastro elaborará um CRUD em cima dos dados dos alunos.
	incluir/alterar/excluir/consultar.
	A consulta será feita por semelhança de palavra. Use os recursos da classe de String para isso.
	Elaborar um método especial que pega a string do nome dos alunos e consulte de acordo com um
	nome de busca selecionado. Voê criará uma matriz, e elaborará um nome da seguinte forma.
	A cada equivalência da letra, somar 1 à posição das coordenadas. Se for encontrada uma diagonal
	com mais de 3 números consecutivos, retornar a palavra do texto principal que bate com o critério
	de busca.*/

	public static int acharNomes(String alu, ArrayList<Aluno> aluno){
		int index=-1;
		int equivalencia;
		char[] alvo;
		char[] aux;
		boolean conse;

		alvo=alu.toLowerCase().toCharArray();

		for(int i=0; i < aluno.size(); i++){
			equivalencia=0;
			aux = aluno.get(i).getNome().toLowerCase().toCharArray();
			for(int j=0; j < aux.length; j++){
				conse=false;
				for(int k=0; k < alvo.length; k++){
					if(aux[j] == alvo[k]){equivalencia+=1; conse=true;}
				}
				if ((!conse)&&(equivalencia > 0)&&(equivalencia < 3)){equivalencia = 0;}
			}
			if ((equivalencia > 3)&&(equivalencia>index)) {index = i;}
		}
		return index;
	}

	public static void main(String[] args) {

		ArrayList<Aluno> aluno =new ArrayList();
		int c=0,a;
		int aux=0,ua=0;
		Scanner s= new Scanner(System.in);
		char s1;
		do{
			System.out.println("\nCadastramento de alunos: ");
			System.out.println("Precione '1' para adcionar alunos");
			System.out.println("Precione '2' para mostrar alunos");
			System.out.println("Precione '3' para alterar alunos");
			System.out.println("Precione '4' para excluir alunos\n");

			switch (a = s.nextInt()) {
				case 1:
					do {
						System.out.println("\nAdcionar alunos => ");

						Cadastro cadastro = new Cadastro();
						cadastro.incluir();
						aluno.add(c, cadastro);
						System.out.println("Você quer adicionar mais alunos? S/N");
						s1 = s.next().charAt(0);
						c++;
						ua = c - 1;
					} while (s1 == 's' || s1 == 'S');
					break;

				case 2:
					System.out.println("\nSelecione o aluno que deseja consultar: ");
					a = acharNomes(s.next(), aluno);
					if(a>=aux && a<=ua) {
						aluno.get(a).consultar();
					}
					else
						System.out.println("Aluno Inválido");
					break;

				case 3:
					System.out.println("\nSelecione o aluno que deseja atualizar: ");
					a = acharNomes(s.next(), aluno);
					if(a>=aux && a<=ua) {
						aluno.get(a).alterar();
					}
					else
						System.out.println("Aluno Inválido");
					break;

				case 4:
					System.out.println("\nSelecione o aluno que deseja excluir: ");
					a = acharNomes(s.next(), aluno);
					if(a>=aux && a<=ua) {
						aluno.get(a).excluir();
					}
					else
						System.out.println("Aluno Inválido");
					break;
				default:
					System.out.println("\nOpcao Invalida");
			}
			System.out.println("\nVoltar para o menu S/N");
			s1 = s.next().charAt(0);
		}while(s1=='s'||s1=='S');
	}
}
