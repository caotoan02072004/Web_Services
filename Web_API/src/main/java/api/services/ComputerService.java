package api.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import api.dao.impl.ComputerDAOImpl;
import api.entities.Computer;


@Path("/computer-service/")
public class ComputerService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getComputer() {
		List<Computer> computers = new ComputerDAOImpl().getComputer();
		Gson son = new Gson();
		return son.toJson(computers);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{comId}")
	public String getComputer(@PathParam("comId") Integer comId) {
		Computer computer = new ComputerDAOImpl().getComputerById(comId);
		Gson son = new Gson();
		return son.toJson(computer);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertComputer(String jsonComputer) {
		Gson son = new Gson();
		Computer computer = son.fromJson(jsonComputer, Computer.class);
		boolean blInsert = new ComputerDAOImpl().insertComputer(computer);
		return son.toJson(blInsert);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateComputer(String jsonComputer) {
		Gson son = new Gson();
		Computer computer = son.fromJson(jsonComputer, Computer.class);
		boolean blUpdate = new ComputerDAOImpl().updateComputer(computer);
		return son.toJson(blUpdate);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{comId}")
	public String deleteComputer(@PathParam("comId") Integer comId) {		
		boolean blDelete = new ComputerDAOImpl().deleteComputer(comId);
		Gson son = new Gson();
		return son.toJson(blDelete);
	}
}
