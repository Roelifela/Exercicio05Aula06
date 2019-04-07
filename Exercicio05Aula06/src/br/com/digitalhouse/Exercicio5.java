package br.com.digitalhouse;

public class Exercicio5 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo");
        cliente.setSobrenome("Cordeiro");
        cliente.setContato("3541-0271");

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Toyota");
        veiculo.setModelo("Corolla");
        veiculo.setAnoFabricacao(2007);
        veiculo.setCor("Preto");
        veiculo.setKilometragem(30000);

        Concessionaria concessionaria = new Concessionaria();
        concessionaria.registrarVenda(veiculo, cliente, 50000.00);


    }



}




