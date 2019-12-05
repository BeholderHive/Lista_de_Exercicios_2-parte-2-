package tarefa_2;

public class Livro implements Sistema {
    private String codigo;
    private String nomeDoLivro;
    private String autor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
