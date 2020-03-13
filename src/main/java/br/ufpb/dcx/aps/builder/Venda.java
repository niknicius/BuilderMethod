package br.ufpb.dcx.aps.builder;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private String data;
    private Cliente cliente;
    private Funcionario funcionario;
    private Frete frete;
    private List<ItemVenda> items;

    public Venda() {
        this.items = new ArrayList<ItemVenda>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public List<ItemVenda> getItems() {
        return items;
    }

    public void setItems(List<ItemVenda> items) {
        this.items = items;
    }

    public void addItem(ItemVenda item){
        this.items.add(item);
    }


    @Override
    public String toString() {
        return "Venda{" +
                "data='" + data + '\'' +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", frete=" + frete +
                ", items=" + items +
                '}';
    }
}
