package br.ufpb.dcx.aps.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaBuilderTest {

    @Test
    public void testePF(){
        Produto produto = new Produto("Banana", 4.5);
        String vendaString = new VendaBuilder().data("01/03/2020").ClientePF("Eudes", "000.000.000-00").funcionario("Caio")
                .frete(15).item(3, produto).build();

        assertEquals(vendaString, "Venda{data='01/03/2020', cliente=ClientePF{nome='Eudes', cpf='000.000.000-00'}," +
                " funcionario=Caio, frete=valor=15.0, items=[quantidade=3, produto=descricao='Banana', preco=4.5]}");

    }

    @Test
    public void testePJ(){
        Produto produto = new Produto("Banana", 4.5);
        String vendaString = new VendaBuilder().data("01/03/2020").ClientePJ("Mostarda Azul S.A", "25.265.464/4545-45").funcionario("Caio")
                .frete(15).item(3, produto).build();

        assertEquals(vendaString, "Venda{data='01/03/2020', cliente=ClientePJ{razaoSocial='Mostarda Azul S.A', cnpj='25.265.464/4545-45'}," +
                " funcionario=Caio, frete=valor=15.0, items=[quantidade=3, produto=descricao='Banana', preco=4.5]}");

    }
}
