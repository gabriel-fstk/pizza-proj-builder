package src.main.java.model;

/**
 * A classe {@code Pizza} representa uma pizza com atributos como massa,
 * cobertura e tamanho. Ela é usada como o produto final que será construído
 * através do padrão de projeto {@code Builder}.
 * 
 * @author gsfk | {@code Gabriel Soares}
 */

public class Pizza {
    /**
     * O tipo da massa da pizza (por exemplo, fina, grossa, pan).
     */
    private String massa;
    
    /**
     * A cobertura da pizza (por exemplo, queijo e tomate, pepperoni, etc.).
     */
    private String cobertura;

    /**
     * O tamanho da pizza (por exemplo, pequena, média, grande).
     */
    private String tamanho;

    /**
     * Define o tipo da massa da pizza.
     * 
     * @param massa - O tipo de massa a ser definido.
     */
    public void setMassa(String massa) {
        this.massa = massa;
    }

    /**
     * Define a cobertura da pizza.
     * 
     * @param cobertura - A cobertura a ser definida.
     */
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    /**
     * Define o tamanho da pizza.
     * 
     * @param tamanho - O tamanho a ser definido.
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Retorna uma representação textual da pizza, incluindo o tamanho,
     * o tipo da massa e a cobertura.
     * 
     * @return A descrição da pizza.
     */
    @Override
    public String toString() {
        return "Pizza " + tamanho + " " + massa + " com " + cobertura;
    }
}

