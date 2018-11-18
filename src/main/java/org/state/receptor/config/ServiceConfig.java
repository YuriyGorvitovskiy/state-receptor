package org.state.receptor.config;

import org.service.common.http.server.HttpServerConfig;

public class ServiceConfig {

    public String           name       = "state-receptor";
    public HttpServerConfig httpserver = new HttpServerConfig();
}
