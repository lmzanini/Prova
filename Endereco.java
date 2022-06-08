package leonardo.prova.model;

public class Endereco {

    private String rua;
    private String num;
    private String complemento;
    private String pontoRef;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + "\n"
                + "Número: " + num + "\n"
                + "Complemento: " + complemento + "\n"
                + "Ponto de Referência: " + pontoRef + "\n"
                + "CEP: " + cep + "\n"
                + "Cidade: " + cidade + "\n"
                + "Estado: " + estado + "\n"
                + "País: " + pais + "\n";
    }

}
