package com.idat.service;

import java.util.List;
import com.idat.dto.UsuarioClienteDTORequest;
import com.idat.dto.UsuarioClienteDTOResponse;

public interface UsuarioClienteService {
	
	public void guardarUsuario(UsuarioClienteDTORequest usuario);
	public void editarUsuario(UsuarioClienteDTORequest usuario);
	public void eliminarUsuario(Integer id);
	public List<UsuarioClienteDTOResponse> listarUsuarios();
	public UsuarioClienteDTOResponse obtenerUsuarioId(Integer id);

}
