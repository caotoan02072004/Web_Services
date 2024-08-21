package api.dao;

import java.util.List;

import api.entities.Computer;

public interface ComputerDAO {
	public List<Computer> getComputer();
	public Computer getComputerById(Integer comId);
	public Boolean insertComputer(Computer c);
	public Boolean updateComputer(Computer c);
	public Boolean deleteComputer(Integer comId);
}
