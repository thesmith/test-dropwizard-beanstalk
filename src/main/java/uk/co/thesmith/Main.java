package uk.co.thesmith;

import uk.co.thesmith.resources.HealthCheckResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import uk.co.thesmith.resources.PingResource;

public class Main extends Application<ServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName() {
        return "test-dropwizard-beanstalk";
    }

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
    }

    @Override
    public void run(ServiceConfiguration cfg,
                    Environment env) throws Exception {
        env.jersey().register(HealthCheckResource.class);
        env.jersey().register(PingResource.class);
    }
}
