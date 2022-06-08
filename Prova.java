package leonardo.prova;

import javax.swing.JOptionPane;
import leonardo.prova.model.*;
import java.util.ArrayList;

public class Prova {

    public static void main(String[] args) {

        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Funcionario> listaFunc = new ArrayList<>();
        ArrayList<Fornecedores> listaForn = new ArrayList<>();
        ArrayList<MateriaPrima> listaMat = new ArrayList<>();
        ArrayList<Produto> listaProd = new ArrayList<>();
        ArrayList<Login> listaLogin = new ArrayList<>();

        Login admin = new Login();

        admin.setLogin("admin");
        admin.setSenha("admin");

        listaLogin.add(admin);
        String login;
        String senha;
        do {

            login = JOptionPane.showInputDialog(null, "Login");
            senha = JOptionPane.showInputDialog(null, "Senha");

            if (login.equals(admin.getLogin()) && senha.equals(admin.getSenha())) {

                JOptionPane.showMessageDialog(null, "Login feito com sucesso");

            } else {

                int i = 0;
                int j = 3;

                do {
                    JOptionPane.showMessageDialog(null, "Login ou senha inválido.\n"
                            + "Tentativa: " + (i + 1) + "\n"
                            + "Tentativas restantes: " + (j - 1));

                    login = JOptionPane.showInputDialog(null, "Login");
                    senha = JOptionPane.showInputDialog(null, "Senha");

                    i++;
                    j--;

                } while (i<2 || !login.equals(admin.getLogin()) && !senha.equals(admin.getSenha()));

                

                JOptionPane.showMessageDialog(null, "Será necessário trocar a senha!");

                String mudaLogin = JOptionPane.showInputDialog(null, "Login do usuário");

                if (mudaLogin.equals(admin.getLogin())) {
                    String mudaSenha = JOptionPane.showInputDialog(null, "Nova senha");
                    admin.setSenha(mudaSenha);
                    listaLogin.add(admin);
                    JOptionPane.showMessageDialog(null, "Troca de senha feita com sucesso!");

                }
            }
        } while (!login.equals(admin.getLogin()) && !senha.equals(admin.getSenha()));

        String menu
                = "------Menu------\n"
                + "1- Cadastro de Clientes\n"
                + "2- Cadastro de Funcionário\n"
                + "3- Cadastro de fornecedores\n"
                + "4- Cadastro de Matéria Prima\n"
                + "5- Cadastro de Produtos\n"
                + "6- Relatórios\n"
                + "0 - Sair\n";
        String menuRelatorio = "------Relatórios------\n"
                + "1- Clientes\n"
                + "2- Funcionários\n"
                + "3- Fornecedores\n"
                + "4- Matéria prima\n"
                + "5- Produtos\n"
                + "0- Sair\n";
        String sair = "0";

        do {
            sair = JOptionPane.showInputDialog(menu);
            switch (sair) {
                case "1":
                    Cliente cliente = new Cliente();
                    CadastroPF clienteC = new CadastroPF();
                    Endereco clienteEnd = new Endereco();

                    cliente.setId(listaCliente.size() + 1);

                    clienteC.setNome(JOptionPane.showInputDialog(null, "Nome"));
                    clienteC.setCpf(JOptionPane.showInputDialog(null, "CPF"));
                    clienteC.setRg(JOptionPane.showInputDialog(null, "RG"));
                    clienteC.setDataNasc(JOptionPane.showInputDialog(null, "Data de Nascimento"));
                    clienteC.setTel(JOptionPane.showInputDialog(null, "Telefone com o DDD"));

                    clienteEnd.setRua(JOptionPane.showInputDialog(null, "Logradouro"));
                    clienteEnd.setNum(JOptionPane.showInputDialog(null, "Número da residência"));
                    clienteEnd.setComplemento(JOptionPane.showInputDialog(null, "Complemento"));
                    clienteEnd.setPontoRef(JOptionPane.showInputDialog(null, "Ponto de referência"));
                    clienteEnd.setCep(JOptionPane.showInputDialog(null, "Digite o CEP"));
                    clienteEnd.setCidade(JOptionPane.showInputDialog(null, "Digite a Cidade"));
                    clienteEnd.setEstado(JOptionPane.showInputDialog(null, "Digite o Estado"));
                    clienteEnd.setPais(JOptionPane.showInputDialog(null, "Digite o País"));

                    cliente.setEndereco(clienteEnd);
                    cliente.setCadastro(clienteC);
                    listaCliente.add(cliente);
                    JOptionPane.showMessageDialog(null, "Cadastro do cliente " + clienteC.getNome() + " efetuado com sucesso!");
                    break;

                case "2":
                    Funcionario func = new Funcionario();
                    CadastroPF funcC = new CadastroPF();
                    Endereco funcEnd = new Endereco();
                    Login funcLogin = new Login();

                    func.setId(listaFunc.size() + 1);

                    funcC.setNome(JOptionPane.showInputDialog(null, "Nome"));
                    funcC.setCpf(JOptionPane.showInputDialog(null, "CPF"));
                    funcC.setRg(JOptionPane.showInputDialog(null, "RG"));
                    funcC.setDataNasc(JOptionPane.showInputDialog(null, "Data de Nascimento"));
                    funcC.setTel(JOptionPane.showInputDialog(null, "Telefone com o DDD"));

                    func.setDataAdm(JOptionPane.showInputDialog(null, "Data de Admissão"));

                    funcLogin.setLogin(JOptionPane.showInputDialog(null, "Login"));
                    funcLogin.setSenha(JOptionPane.showInputDialog(null, "Senha"));

                    funcEnd.setRua(JOptionPane.showInputDialog(null, "Logradouro"));
                    funcEnd.setNum(JOptionPane.showInputDialog(null, "Número da residência"));
                    funcEnd.setComplemento(JOptionPane.showInputDialog(null, "Complemento"));
                    funcEnd.setPontoRef(JOptionPane.showInputDialog(null, "Ponto de referência"));
                    funcEnd.setCep(JOptionPane.showInputDialog(null, "Digite o CEP"));
                    funcEnd.setCidade(JOptionPane.showInputDialog(null, "Digite a Cidade"));
                    funcEnd.setEstado(JOptionPane.showInputDialog(null, "Digite o Estado"));
                    funcEnd.setPais(JOptionPane.showInputDialog(null, "Digite o País"));

                    func.setEndereco(funcEnd);
                    func.setCadastro(funcC);
                    func.setLogin(funcLogin);
                    listaFunc.add(func);

                    JOptionPane.showMessageDialog(null, "Cadastro do funcionário " + funcC.getNome() + " efetuado com sucesso!");
                    break;

                case "3":
                    Fornecedores forn = new Fornecedores();
                    CadastroPJ fornC = new CadastroPJ();
                    Endereco fornEnd = new Endereco();

                    forn.setId(listaForn.size() + 1);

                    fornC.setNomeFant(JOptionPane.showInputDialog(null, "Nome Fantasia"));
                    fornC.setRazaoSoc(JOptionPane.showInputDialog(null, "Razão Social"));
                    fornC.setCnpj(JOptionPane.showInputDialog(null, "CNPJ"));
                    fornC.setTel(JOptionPane.showInputDialog(null, "Telefone com DDD"));

                    fornEnd.setRua(JOptionPane.showInputDialog(null, "Logradouro"));
                    fornEnd.setNum(JOptionPane.showInputDialog(null, "Número da residência"));
                    fornEnd.setComplemento(JOptionPane.showInputDialog(null, "Complemento"));
                    fornEnd.setPontoRef(JOptionPane.showInputDialog(null, "Ponto de referência"));
                    fornEnd.setCep(JOptionPane.showInputDialog(null, "Digite o CEP"));
                    fornEnd.setCidade(JOptionPane.showInputDialog(null, "Digite a Cidade"));
                    fornEnd.setEstado(JOptionPane.showInputDialog(null, "Digite o Estado"));
                    fornEnd.setPais(JOptionPane.showInputDialog(null, "Digite o País"));

                    forn.setEndereco(fornEnd);
                    forn.setCadastro(fornC);
                    listaForn.add(forn);

                    JOptionPane.showMessageDialog(null, "Cadastro do Fornecedor " + fornC.getNomeFant() + " efetuado com sucesso!");
                    break;

                case "4":
                    MateriaPrima matP = new MateriaPrima();
                    matP.setId(listaMat.size() + 1);

                    matP.setNome(JOptionPane.showInputDialog(null, "Nome da matéria prima"));

                    String valor = JOptionPane.showInputDialog(null, "Valor por unidade ou kilo.");
                    matP.setValor(Double.parseDouble(valor));

                    String qtd = JOptionPane.showInputDialog(null, "Quantidade em unidade ou kilo");
                    matP.setQuantidade(Integer.parseInt(qtd));

                    matP.setTotal(matP.getQuantidade() * matP.getValor());

                    matP.setDataCompra(JOptionPane.showInputDialog(null, "Data da compra"));

                    String fornecedor = JOptionPane.showInputDialog(null, "Fornecedor da Matéria Prima");

                    for (Fornecedores fornLista : listaForn) {

                        if (fornLista.getCadastro().getRazaoSoc().contains(fornecedor)) {

                            matP.setForn(fornLista);
                        }
                    }

                    listaMat.add(matP);

                    JOptionPane.showMessageDialog(null, "Matéria prima " + matP.getNome() + " registrada com sucesso!");

                    break;

                case "5":
                    ArrayList<MateriaPrima> materiaProd = new ArrayList<>();

                    Produto prod = new Produto();
                    prod.setId(listaProd.size() + 1);

                    prod.setNome(JOptionPane.showInputDialog(null, "Nome do produto"));
                    String materias;

                    do {

                        materias = JOptionPane.showInputDialog(null, "Digite o nome da matéria prima que quer acrescentar\n"
                                + "\n0- Para sair");

                        for (MateriaPrima item : listaMat) {

                            if (item.getNome().contains(materias)) {
                                JOptionPane.showMessageDialog(null, "Matéria Prima " + item + "\ncadastrada com sucesso!");
                                materiaProd.add(item);

                            }
                        }

                    } while (!materias.equals("0"));

                    String preco = JOptionPane.showInputDialog(null, "Preço de venda");
                    prod.setValor(Integer.parseInt(preco));
                    prod.setListaMateria(materiaProd);
                    listaProd.add(prod);
                    break;

                case "6":
                    do {
                        sair = JOptionPane.showInputDialog(null, menuRelatorio);

                        switch (sair) {

                            case "1":
                                JOptionPane.showMessageDialog(null, listaCliente.toString());
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, listaFunc.toString());
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null, listaForn.toString());
                                break;
                            case "4":
                                JOptionPane.showMessageDialog(null, listaMat.toString());
                                break;
                            case "5":
                                JOptionPane.showMessageDialog(null, listaProd.toString());
                                break;
                        }

                    } while (!sair.equals("0"));
            }

        } while (!sair.equals("0"));
    }
}
