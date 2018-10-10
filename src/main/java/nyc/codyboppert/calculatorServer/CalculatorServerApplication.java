package nyc.codyboppert.calculatorServer;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CalculatorServerApplication extends Application<CalculatorServerConfiguration> {
    public static void main(String[] args) throws Exception {
        new CalculatorServerApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<CalculatorServerConfiguration> bootstrap) {

    }

    @Override
    public void run(CalculatorServerConfiguration configuration,
                    Environment environment) {

    }
}
