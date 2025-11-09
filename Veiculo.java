package com.sistema.veiculos;

public abstract class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected int ano;

    
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

   
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Veículo ---");
       
        System.out.println("Tipo: " + this.getClass().getSimpleName()); 
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }


}