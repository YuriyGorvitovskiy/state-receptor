package org.state.receptor;

import org.service.common.config.Configurator;
import org.state.receptor.config.ServiceConfig;

public class Main {

    public static void main(String[] args) {
        System.out.println("I'm state-receptor");

        ServiceConfig config = Configurator.extract(System.getProperties(), "org.state.receptor", new ServiceConfig());
        System.out.println("My name is: " + config.name);

        System.out.println("Configuring Patch Processor.");
        Receptor receptor = new Receptor(config);
        receptor.run();

        System.out.println("Execution Completted.");

    }

}
