package leonardo.prova.model;

public class Fornecedores {

    private CadastroPJ cadastro;
    private Endereco endereco;
    private int id;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadastroPJ getCadastro() {
        return cadastro;
    }

    public void setCadastro(CadastroPJ cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "------Fornecedores Cadastrados------\n\n"
                + "ID: " + id + "\n"
                + cadastro.toString() + "\n"
                + endereco.toString() + "\n";
    }

}
