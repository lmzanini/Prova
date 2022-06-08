
package leonardo.prova.model;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private ArrayList<MateriaPrima> listaMateria;
    private double valor;
    private int id;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<MateriaPrima> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(ArrayList<MateriaPrima> listaMateria) {
        this.listaMateria = listaMateria;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produtos Cadastrados\n"
                + "id:" + id 
                + "\nnome:" + nome
                + "\nIgredientes:" + listaMateria
                + "\nvalor:" + valor +"\n";
    }
    
}
