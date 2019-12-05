package tarefa_2;


import java.util.Scanner;

public class Livraria extends Livro implements Sistema {

    public void incluir(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nNome do Livro: ");
        setNomeDoLivro(s1.nextLine());
        System.out.println("Codigo: ");
        setCodigo(s1.nextLine());
        System.out.println("Autor: ");
        setAutor(s1.nextLine());
    }
    public void consultar(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nLivro: "+ getNomeDoLivro());
        System.out.println("Codigo: "+ getCodigo());
        System.out.println("Autor: "+ getAutor());
    }
    public void alterar(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nNome atual: "+ getNomeDoLivro());
        System.out.println("Novo nome: ");
        setNomeDoLivro(s1.nextLine());
        System.out.println("\nCodigo atual: "+ getCodigo());
        System.out.println("Novo codigo: ");
        setCodigo(s1.nextLine());
        System.out.println("\nAutor atual: "+ getAutor());
        System.out.println("Novo autor: ");
        setAutor(s1.nextLine());
    }
    public void excluir(){
        System.out.println("\nExcluindo "+getNomeDoLivro());
        setNomeDoLivro(" ");
        setCodigo(" ");
        setAutor(" ");
    }
}
