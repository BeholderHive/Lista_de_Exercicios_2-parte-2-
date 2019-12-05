package tarefa_3;


import java.util.Scanner;

public class Pizzaria extends Pizza implements Sistema {

    public void incluir(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nNome do Pizza: ");
        setNomePizza(s1.nextLine());
        System.out.println("Codigo: ");
        setCodigo(s1.nextLine());
        System.out.println("Ingredientes: ");
        setIngredientes(s1.nextLine());
    }
    public void consultar(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nPizza: "+ getNomePizza());
        System.out.println("Codigo: "+ getCodigo());
        System.out.println("Ingredientes: "+ getIngredientes());
    }
    public void alterar(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nNome atual: "+ getNomePizza());
        System.out.println("Novo nome: ");
        setNomePizza(s1.nextLine());
        System.out.println("\nCodigo atual: "+ getCodigo());
        System.out.println("Novo codigo: ");
        setCodigo(s1.nextLine());
        System.out.println("\nIngredientes atuais: "+ getIngredientes());
        System.out.println("Novos ingredientes: ");
        setIngredientes(s1.nextLine());
    }
    public void excluir(){
        System.out.println("\nExcluindo "+ getNomePizza());
        setNomePizza(" ");
        setCodigo(" ");
        setIngredientes(" ");
    }
}
