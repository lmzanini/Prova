package leonardo.prova.model;

public class CadastroPF {

    private String nome;
    private String cpf;
    private String rg;
    private String dataNasc;
    private String tel;
    private Endereco endereco;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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
        return "Nome: " + nome + "\n"
                + "CPF: " + cpf + "\n"
                + "RG: " + rg + "\n"
                + "Data de Nascimento: " + dataNasc + "\n"
                + "Telefone: " + tel + "\n";
    }

}
