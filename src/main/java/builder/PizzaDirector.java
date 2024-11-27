package src.main.java.builder;

/**
 * A classe {@code PizzaDirector} é responsável por construir pizzas com
 * combinações predefinidas de ingredientes. Ela usa o {@code PizzaBuilder}
 * para criar pizzas com atributos específicos.
 * 
 * @author gsfk | {@code Gabriel Soares}
 */
public class PizzaDirector {
    private PizzaBuilder builder;

    /**
     * Construtor da classe {@code PizzaDirector}.
     * 
     * @param builder O {@code PizzaBuilder} utilizado para construir as pizzas.
     */
    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    /**
     * Cria uma pizza pequena com uma combinação predefinida de ingredientes:
     * massa fina, cobertura de queijo e tomate.
     * 
     * @return A pizza predefinida.
     */
    public String fazerPizzaPequena() {
        return builder.adicionarMassa("fina")
                      .adicionarCobertura("queijo e tomate")
                      .adicionarTamanho("pequena")
                      .construir()
                      .toString();
    }

    /**
     * Cria uma pizza grande com uma combinação predefinida de ingredientes:
     * massa grossa, cobertura de frango e catupiry.
     * 
     * @return A pizza predefinida.
     */
    public String fazerPizzaGrande() {
        return builder.adicionarMassa("grossa")
                      .adicionarCobertura("frango e catupiry")
                      .adicionarTamanho("grande")
                      .construir()
                      .toString();
    }
}
