package builderPatternWithPiazza;

/**
 * The first step.
 * The thing you want to create.
 *
 * @author jacka
 * @version 1.0.0 on 5/2/2016.
 */
public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping= "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
