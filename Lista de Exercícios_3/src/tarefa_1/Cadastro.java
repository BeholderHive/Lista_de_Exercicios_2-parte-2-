package tarefa_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro extends Aluno implements Sistema{
    int i;
    ArrayList<Double> cadNotas = new ArrayList<>();

    public void incluir(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nNome do Aluno: ");
        setNome(s1.nextLine());
        System.out.println("RA: ");
        setRA(s1.nextLine());
        System.out.println("Enderço: ");
        setEndereco(s1.nextLine());
        System.out.println("Telefone: ");
        setTelefone(s1.nextLine());
        for(i=1;i<5;i++){
            System.out.println("Nota "+i+": ");
            cadNotas.add((i-1), Double.parseDouble(s1.nextLine()));
        }
        setNotas(cadNotas);
    }
    public void consultar(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nAluno: "+ getNome());
        System.out.println("RA: "+ getRA());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telefone: "+ getTelefone());
        for(i=0;i<4;i++){
            System.out.println("Nota "+(i+1)+": "+ getNotas().get(i));
        }
    }
    public void alterar(){
        Scanner s1 =new Scanner(System.in);
        System.out.println("\nNome atual: "+ getNome());
        System.out.println("Novo nome: ");
        setNome(s1.nextLine());
        System.out.println("\nRA atual: "+ getRA());
        System.out.println("Novo RA: ");
        setRA(s1.nextLine());
        System.out.println("\nEndereço atual: "+getEndereco());
        System.out.println("Novo endereço: ");
        setEndereco(s1.nextLine());
        System.out.println("\nTelefone atual: "+getTelefone());
        System.out.println("Novo telefone: ");
        setTelefone(s1.nextLine());
        for(i=0;i<4;i++){
            System.out.println("\nNota "+(i+1)+" atual: "+getNotas().get(i));
            System.out.println("Nova nota"+(i+1)+": ");
            cadNotas.add((i), Double.parseDouble(s1.nextLine()));
        }
        setNotas(cadNotas);
    }
    public void excluir(){
        System.out.println("\nExcluindo "+getNome());
        setRA(" ");
        setTelefone(" ");
        setEndereco(" ");
        for(i=0;i<4;i++){
            cadNotas.add((i), (double) 0);
        }
        setNotas(cadNotas);
    }
}
