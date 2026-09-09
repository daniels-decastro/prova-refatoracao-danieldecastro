package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- Teste do sistema de frota refatorado ---");
        
        Veiculo v1 = new Veiculo("Daniel", "SEP-1914");
        
        // Testes de validação de regras de negócio
        v1.adicionarCombustivel(-10); // Bloqueia
        v1.adicionarCombustivel(50);  // Funciona
        v1.gastarCombustivel(100);    // Bloqueia por falta de saldo
        v1.gastarCombustivel(20);     // Funciona
        
        System.out.println("\nStatus final do veículo:");
        System.out.println("Dono: " + v1.getProprietario() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getCombustivel());
    }
}