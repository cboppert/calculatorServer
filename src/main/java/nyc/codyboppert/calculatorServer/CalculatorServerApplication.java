package nyc.codyboppert.calculatorServer;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import nyc.codyboppert.calculatorServer.config.CalculatorServerConfiguration;
import nyc.codyboppert.calculatorServer.resources.CalculatorResource;

public class CalculatorServerApplication extends Application<CalculatorServerConfiguration> {
    public static void main(String[] args) throws Exception {
        new CalculatorServerApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<CalculatorServerConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(CalculatorServerConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new CalculatorResource());
    }
}
