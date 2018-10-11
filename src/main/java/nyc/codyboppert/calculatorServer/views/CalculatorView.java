package nyc.codyboppert.calculatorServer.views;

import io.dropwizard.views.View;

public class CalculatorView extends View {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float result;
    private final float floatMin = Float.MIN_VALUE;
    private final float floatMax = Float.MAX_VALUE;

    public CalculatorView(float a, float b, float c, float d, float result) {
        super("calculator.mustache");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.result = result;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getD() {
        return d;
    }

    public float getFloatMin() {
        return floatMin;
    }

    public float getFloatMax() {
        return floatMax;
    }

    public float getResult() {
        return result;
    }
}
