package com.idat.service;

import java.util.List;
import com.idat.dto.HospitalDTORequest;
import com.idat.dto.HospitalDTOResponse;

public interface HospitalService {

	public void guardarHospital(HospitalDTORequest hospital);
	public void editarHospital(HospitalDTORequest hospital);
	public void eliminarHospital(Integer id);
	public List<HospitalDTOResponse> listarHospitales();
	public HospitalDTOResponse obtenerHospitalId(Integer id);
	
}
