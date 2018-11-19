package org.state.receptor.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("v2/try")
@Produces({ MediaType.APPLICATION_JSON })
public class TryApi {

    @GET
    public TryJson get() {
        TryJson json = new TryJson();
        json.message = "Hello Rest API";
        return json;
    }
}
