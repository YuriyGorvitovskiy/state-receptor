package org.state.receptor;

import org.service.common.http.server.HttpServer;
import org.state.receptor.config.ServiceConfig;

public class Receptor {

    final HttpServer httpServer;

    public Receptor(ServiceConfig config) {
        httpServer = HttpServer.create(config.httpserver);
    }

    public void run() {
        httpServer.start();
    }

}
