package leonardo.prova.model;

public class MateriaPrima {

    private String nome;
    private int id;
    private int quantidade;
    private double valor;
    private double total;
    private String dataCompra;
    private Fornecedores forn;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedores getForn() {
        return forn;
    }

    public void setForn(Fornecedores forn) {
        this.forn = forn;
    }

    @Override
    public String toString() {
        return "------Materia Prima Cadastrada------\n\n"
                + "ID:" + id + "\n"
                + "Nome:" + nome + "\n"
                + "Quantidade:" + quantidade + "\n"
                + "Valor:" + valor + "\n"
                + "Total:" + total + "\n"
                + "Data da Compra:" + dataCompra + "\n"
                + forn.toString()+"\n";
    }

}
