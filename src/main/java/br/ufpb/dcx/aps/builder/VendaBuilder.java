package br.ufpb.dcx.aps.builder;

public class VendaBuilder {

    private Venda venda;

    public VendaBuilder() {
        this.venda = new Venda();
    }

    public VendaBuilder data(String data){
        this.venda.setData(data);
        return this;
    }

    public VendaBuilder ClientePF(String nome, String cpf){
        Cliente cliente = new ClientePF(nome, cpf);
        this.venda.setCliente(cliente);
        return this;
    }

    public VendaBuilder ClientePJ(String razaoSocial, String cnpj){
        Cliente cliente = new ClientePJ(razaoSocial, cnpj);
        this.venda.setCliente(cliente);
        return this;
    }

    public VendaBuilder frete(double valorFrete){
        Frete frete = new Frete(valorFrete);
        this.venda.setFrete(frete);
        return this;
    }

    public VendaBuilder funcionario(String nome){
        Funcionario funcionario = new Funcionario(nome);
        this.venda.setFuncionario(funcionario);
        return this;
    }
    public VendaBuilder item(int quantidade, Produto produto){
        ItemVenda itemVenda = new ItemVenda(quantidade, produto);
        this.venda.addItem(itemVenda);
        return this;
    }

    public String build(){
        return this.venda.toString();
    }

}
