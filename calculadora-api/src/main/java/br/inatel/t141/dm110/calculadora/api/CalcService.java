package br.inatel.t141.dm110.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalcService {

	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	CalcResult sum(@QueryParam("first") double first, @QueryParam("second") double second);

	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	CalcResult subtract(@FormParam("first") double first, @FormParam("second") double second);

}
