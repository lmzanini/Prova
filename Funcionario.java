package leonardo.prova.model;

public class Funcionario {

    private CadastroPF cadastro;
    private Endereco endereco;
    private int id;

    private Login login;

    private String dataAdm;
    private String dataDem;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getDataDem() {
        return dataDem;
    }

    public void setDataDem(String dataDem) {
        this.dataDem = dataDem;
    }

    @Override
    public String toString() {
        return "------Funcionários Cadastrados------\n\n"
                + "ID: " + id + "\n"
                + cadastro.toString() + "\n"
                + endereco.toString() + "\n"
                + "Data de Admissão: " + dataAdm + "\n"
                + "Data de Demissão=" + dataDem + "\n";
    }

}
