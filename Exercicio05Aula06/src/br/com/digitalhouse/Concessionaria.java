package br.com.digitalhouse;

public class Concessionaria {

    //?? Variaveis ???


    public void registrarVenda (Veiculo veiculo, Cliente cliente, Double valorVenda){
        Venda venda = new Venda();
        venda.setVeiculo(veiculo);
        venda.setCliente(cliente);
        venda.setValorVenda(valorVenda);

    }



}
