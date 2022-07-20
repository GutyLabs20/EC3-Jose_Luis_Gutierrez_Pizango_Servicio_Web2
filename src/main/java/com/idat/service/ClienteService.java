package com.idat.service;

import java.util.List;
import com.idat.dto.ClienteDTORequest;
import com.idat.dto.ClienteDTOResponse;

public interface ClienteService {

	public void guardarCliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	public void eliminarCliente(Integer id);
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClienteId(Integer id);
	
}
