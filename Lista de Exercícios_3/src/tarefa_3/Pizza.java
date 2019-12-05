package tarefa_3;

public class Pizza implements Sistema {
    private String codigo;
    private String nomePizza;
    private String ingredientes;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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
