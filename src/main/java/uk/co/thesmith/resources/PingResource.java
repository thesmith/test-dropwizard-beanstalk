package uk.co.thesmith.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ping")
public class PingResource extends BaseResource {
  @GET
  public String doCheck() throws Exception {
    return "pong";
  }
}
