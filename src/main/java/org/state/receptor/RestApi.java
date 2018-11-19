package org.state.receptor;

import javax.ws.rs.ApplicationPath;

import org.service.common.http.server.RestApplication;
import org.state.receptor.rest.TryApi;

@ApplicationPath("/api")
public class RestApi extends RestApplication {
    public RestApi() {
        super(TryApi.class);
    }

}
