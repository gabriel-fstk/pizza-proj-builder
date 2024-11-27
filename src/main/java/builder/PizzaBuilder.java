package src.main.java.builder;

import src.main.java.model.Pizza;

/**
 * A classe {@code PizzaBuilder} é responsável por construir uma instância de
 * {@code Pizza} passo a passo. Ela permite a configuração dos atributos de
 * uma pizza, como massa, cobertura e tamanho, e garante que os valores
 * inseridos sejam válidos.
 * 
 * @author gsfk | {@code Gabriel Soares}
 */
public class PizzaBuilder {
    private Pizza pizza;
    
    private static final String[] TIPOS_MASSA = {"fina", "grossa", "pan"};
    private static final String[] COBERTURAS = {"queijo e tomate", "pepperoni", "frango e catupiry", "atum", "presunto e cogumelos"};
    private static final String[] TAMANHOS = {"pequena", "média", "grande"};

    /**
     * Construtor do PizzaBuilder. Cria uma nova instância de {@code Pizza}.
     */
    public PizzaBuilder() {
        pizza = new Pizza();
    }

    /**
     * Adiciona o tipo de massa à pizza.
     * 
     * @param massa O tipo de massa a ser definido (fina, grossa, pan).
     * @return O próprio {@code PizzaBuilder}, permitindo encadeamento de métodos.
     * @throws IllegalArgumentException Se o tipo de massa não for válido.
     */
    public PizzaBuilder adicionarMassa(String massa) {
        if (!isValid(TIPOS_MASSA, massa)) {
            throw new IllegalArgumentException("Tipo de massa inválido. Opções válidas: fina, grossa, pan");
        }
        pizza.setMassa(massa);
        return this; // Retorna o próprio builder para encadear chamadas
    }

    /**
     * Adiciona a cobertura à pizza.
     * 
     * @param cobertura A cobertura a ser adicionada (queijo e tomate, pepperoni, etc.).
     * @return O próprio {@code PizzaBuilder}, permitindo encadeamento de métodos.
     * @throws IllegalArgumentException Se a cobertura não for válida.
     */
    public PizzaBuilder adicionarCobertura(String cobertura) {
        if (!isValid(COBERTURAS, cobertura)) {
            throw new IllegalArgumentException("Cobertura inválida. Opções válidas: queijo e tomate, pepperoni, frango e catupiry, atum, presunto e cogumelos");
        }
        pizza.setCobertura(cobertura);
        return this;
    }

    /**
     * Adiciona o tamanho à pizza.
     * 
     * @param tamanho O tamanho da pizza (pequena, média, grande).
     * @return O próprio {@code PizzaBuilder}, permitindo encadeamento de métodos.
     * @throws IllegalArgumentException Se o tamanho não for válido.
     */
    public PizzaBuilder adicionarTamanho(String tamanho) {
        if (!isValid(TAMANHOS, tamanho)) {
            throw new IllegalArgumentException("Tamanho inválido. Opções válidas: pequena, média, grande");
        }
        pizza.setTamanho(tamanho);
        return this;
    }

     /**
     * Constrói a pizza com os atributos fornecidos e retorna a instância de {@code Pizza}.
     * 
     * @return A pizza construída.
     */
    public Pizza construir() {
        return pizza;
    }

    /**
     * Valida se o valor fornecido está presente em um array de opções válidas.
     * 
     * @param options O array de opções válidas.
     * @param value O valor a ser validado.
     * @return {@code true} se o valor estiver em {@code options}, {@code false} caso contrário.
     */
    private boolean isValid(String[] options, String value) {
        for (String option : options) {
            if (option.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}

