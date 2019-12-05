package tarefa_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/*1)Elabore uma classe de pizzaria, e uma de pizza. Fazzer o CRUD de pizza na pizzaria*/

	public static int acharPizzas(String entrada, ArrayList<Pizza> pizza){
		int index=-1;
		int equivalencia;
		char[] alvo=null;
		char[] aux=null;
		boolean conse;

		alvo= entrada.toLowerCase().toCharArray();

		for(int i = 0; i < pizza.size(); i++){
			equivalencia=0;
			aux = pizza.get(i).getNomePizza().toLowerCase().toCharArray();
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

		ArrayList<Pizza> pizza =new ArrayList();
		int c=0, a=0;
		int aux=0,ua=0;
		Scanner s= new Scanner(System.in);
		char s1;
		do{
			System.out.println("\nCadastramento de livros: ");
			System.out.println("Precione '1' para adcionar pizzas");
			System.out.println("Precione '2' para mostrar pizzas");
			System.out.println("Precione '3' para alterar pizzas");
			System.out.println("Precione '4' para excluir pizzas\n");

			switch (a = s.nextInt()) {
				case 1:
					do {
						System.out.println("\nAdicionar pizzas => ");

						Pizzaria pizzaria = new Pizzaria();
						pizzaria.incluir();
						pizza.add(c, pizzaria);
						System.out.println("Você quer adcionar mais pizzas? S/N");
						s1 = s.next().charAt(0);
						c++;
						ua = c - 1;
					} while (s1 == 's' || s1 == 'S');
					break;

				case 2:
					System.out.println("\nDigite a pizza que deseja consultar: ");
					a = acharPizzas(s.next(), pizza);
					if(a != -1){
						pizza.get(a).consultar();
					}
					else
						System.out.println("Pizza Inválida"+a);
					break;

				case 3:
					System.out.println("\nSelecione o pizza que deseja atualizar: ");
					a = acharPizzas(s.next().toString(), pizza);
					if(a != -1){
						pizza.get(a).alterar();
					}
					else
						System.out.println("Pizza Inválida");
					break;

				case 4:
					System.out.println("\nSelecione a pizza que deseja excluir: ");
					a = acharPizzas(s.next().toString(), pizza);
					if(a != -1){
						pizza.get(a).excluir();
					}
					else
						System.out.println("Pizza Inválida");
					break;
				default:
					System.out.println("\nOpcao Invalida");
			}
			System.out.println("\nVoltar para o menu S/N");
			s1 = s.next().charAt(0);
		}while(s1=='s'||s1=='S');
	}
}
