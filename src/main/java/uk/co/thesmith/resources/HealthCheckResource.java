package uk.co.thesmith.resources;

import javax.ws.rs.*;

@Path("/health")
public class HealthCheckResource extends BaseResource {
  @GET
  @Path("/check")
  public String doCheck() throws Exception {
    return "ok";
  }
}
