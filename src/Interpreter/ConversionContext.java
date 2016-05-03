package Interpreter;

/**
 * @author jacka
 * @version 1.0 on 5/3/2016
 *          <p>
 *          Created by jacka on 5/3/2016.
 */
public class ConversionContext {

    private String conversionQues = "";

    private String getConversionResponse = "";

    private String fromConversion = "";
    private String toConversion = "";

    String[] partsOfQues;

    public ConversionContext(String input) {
        conversionQues = input;
        partsOfQues = getInput().split(" ");
    }

    public String getInput() {
        return conversionQues;
    }
}
