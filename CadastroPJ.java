package leonardo.prova.model;

public class CadastroPJ {

    private String nomeFant;
    private String razaoSoc;
    private String cnpj;
    private String tel;
    private Endereco endereco;

    public String getNomeFant() {
        return nomeFant;
    }

    public void setNomeFant(String nomeFant) {
        this.nomeFant = nomeFant;
    }

    public String getRazaoSoc() {
        return razaoSoc;
    }

    public void setRazaoSoc(String razaoSoc) {
        this.razaoSoc = razaoSoc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome Fantasia: " + nomeFant + "\n"
                + "Razão Social: " + razaoSoc + "\n"
                + "CNPJ: " + cnpj + "\n"
                + "Telefone:: " + tel + "\n";
    }

}
