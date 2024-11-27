package src.main.java.controller;

import src.main.java.builder.PizzaBuilder;
import src.main.java.builder.PizzaDirector;

/**
 * Classe {@code PizzaController} com um ponto de entrada para testar o padrão de projeto Builder.
 * O objetivo desta classe é construir pizzas com diferentes combinações de massa, cobertura e tamanho.
 * 
 * @author gsfk | {@code Gabriel Soares}
 */
public class PizzaController {
    
    /**
     * Ponto de entrada do programa. Constrói pizzas com diferentes combinações
     * e imprime suas descrições.
     * 
     * @param args Argumentos passados pela linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        try {
            // Criar uma pizza diretamente com o builder
            PizzaBuilder builder = new PizzaBuilder();
            String pizza1 = builder.adicionarMassa("fina")
                                   .adicionarCobertura("pepperoni")
                                   .adicionarTamanho("média")
                                   .construir().toString();
            System.out.println(pizza1);

            // Usar o diretor para uma pizza predefinida
            PizzaDirector director = new PizzaDirector(new PizzaBuilder());
            String pizza2 = director.fazerPizzaPequena();
            System.out.println(pizza2);

            String pizza3 = director.fazerPizzaGrande();
            System.out.println(pizza3);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
