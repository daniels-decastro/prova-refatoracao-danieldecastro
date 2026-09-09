package br.com.fiapride.model;

public class Veiculo {
    // Atributos privados para o encapsulamento
    private String proprietario;
    private String placa;
    private double combustivel;

    // Construtor para inicializar o veículo
    public Veiculo(String proprietario, String placa) {
        this.proprietario = proprietario;
        this.placa = placa;
        this.combustivel = 0.0;
    }

    public void adicionarCombustivel(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de abastecimento deve ser maior que zero.");
            return;
        }
        this.combustivel += valor;
        System.out.println("Abastecimento realizado. Combustível atual: " + this.combustivel + " litros.");
    }

    public void gastarCombustivel(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de consumo é inválido.");
            return;
        }
        if (this.combustivel < valor) {
            System.out.println("Erro: Combustível insuficiente para esta viagem.");
            return;
        }
        this.combustivel -= valor;
        System.out.println("Viagem realizada. Combustível restante: " + this.combustivel + " litros.");
    }

    // Getters para leitura dos dados
    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }
}