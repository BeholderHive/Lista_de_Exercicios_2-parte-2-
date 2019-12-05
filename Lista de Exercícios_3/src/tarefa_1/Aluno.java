package tarefa_1;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Sistema {
    private String RA;
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Double> notas;

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
         this.notas = notas;
    }

    @Override
    public void incluir() {

    }

    @Override
    public void consultar() {

    }

    @Override
    public void alterar() {

    }

    @Override
    public void excluir() {

    }
}
