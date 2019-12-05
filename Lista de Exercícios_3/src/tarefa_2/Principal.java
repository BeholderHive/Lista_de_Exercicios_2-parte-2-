package tarefa_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/*1)Elabore duas classes. Uma livraria, e outra livro, onde os livros serão inseridos.
	* Fazer o CRUD dos livros na livraria*/

	public static int acharLivros(String entrada, ArrayList<Livro> livro){
		int index=-1;
		int equivalencia;
		char[] alvo=null;
		char[] aux=null;
		boolean conse;

		alvo= entrada.toLowerCase().toCharArray();

		for(int i = 0; i < livro.size(); i++){
			equivalencia=0;
			aux = livro.get(i).getNomeDoLivro().toLowerCase().toCharArray();
			for(int j=0; j < aux.length; j++){
				conse=false;
				for(int k=0; k < alvo.length; k++){
					if(aux[j] == alvo[k]){equivalencia+=1; conse=true;}
				}
				if ((!conse)&&(equivalencia > 0)&&(equivalencia < 3)){equivalencia = 0;}
			}
			if ((equivalencia > 3)&&(equivalencia>index)) {index = i;}
		}
		for(int i = 0; i < livro.size(); i++){
			equivalencia=0;
			aux = livro.get(i).getAutor().toLowerCase().toCharArray();
			for(int j=0; j < aux.length; j++){
				conse=false;
				for(int k=0; k < alvo.length; k++){
					if(aux[j] == alvo[k]){equivalencia+=1; conse=true;}
				}
				if ((!conse)&&(equivalencia > 0)&&(equivalencia < 3)){equivalencia = 0;}
			}
			if ((equivalencia > 3)&&(equivalencia>index)) {index = i;}
		}
        for(int i = 0; i < livro.size(); i++){
            equivalencia=0;
            aux = livro.get(i).getAutor().toLowerCase().toCharArray();
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

		ArrayList<Livro> livro =new ArrayList();
		int c=0, a=0;
		int aux=0,ua=0;
		Scanner s= new Scanner(System.in);
		char s1;
		do{
			System.out.println("\nCadastramento de livros: ");
			System.out.println("Precione '1' para adcionar livros");
			System.out.println("Precione '2' para mostrar livros");
			System.out.println("Precione '3' para alterar livros");
			System.out.println("Precione '4' para excluir livros\n");

			switch (a = s.nextInt()) {
				case 1:
					do {
						System.out.println("\nAdicionar livros => ");
						Livraria livraria = new Livraria();
						livraria.incluir();
						livro.add(c, livraria);
						System.out.println("Você quer adcionar mais livros? S/N");
						s1 = s.next().charAt(0);
						c++;
						ua = c - 1;
					} while (s1 == 's' || s1 == 'S');
					break;

				case 2:
					System.out.println("\nDigite o livro que deseja consultar: ");
					a = acharLivros(s.next(), livro);
					if(a != -1){
						livro.get(a).consultar();
					}
					else
						System.out.println("Livro Inválido");
					break;

				case 3:
					System.out.println("\nSelecione o livro que deseja atualizar: ");
					a = acharLivros(s.next().toString(), livro);
					if(a != -1){
						livro.get(a).alterar();
					}
					else
						System.out.println("Livro Inválido");
					break;

				case 4:
					System.out.println("\nSelecione o livro que deseja excluir: ");
					a = acharLivros(s.next().toString(), livro);
					if(a != -1){
						livro.get(a).excluir();
					}
					else
						System.out.println("Livro Inválido");
					break;
				default:
					System.out.println("\nOpcao Invalida");
			}
			System.out.println("\nVoltar para o menu S/N");
			s1 = s.next().charAt(0);
		}while(s1=='s'||s1=='S');
	}
}
