package leonardo.prova.model;

public class Cliente {

    private CadastroPF cadastro;
    private Endereco endereco;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CadastroPF getCadastro() {
        return cadastro;
    }

    public void setCadastro(CadastroPF cadastro) {
        this.cadastro = cadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "------Clientes Cadastrados------\n\n"
                + "ID: " + id + "\n"
                + cadastro.toString() + "\n"
                + endereco.toString() + "\n";
    }

}
