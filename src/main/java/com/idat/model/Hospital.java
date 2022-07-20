package com.idat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospitales")
public class Hospital {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idHospital")
	private int idHospital;

	@Column(name="nombre", length=64)
	private String nombre;

	@Column(name="descripcion", length=64)
	private String descripcion;

	@Column(name="distrito", length=64)
	private String distrito;

	public Hospital() {
		super();
	}

	public Hospital(int idHospital, String nombre, String descripcion, String distrito) {
		super();
		this.idHospital = idHospital;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.distrito = distrito;
	}

	public int getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(int idHospital) {
		this.idHospital = idHospital;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	@Override
	public String toString() {
		return "Hospital [idHospital=" + idHospital + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", distrito=" + distrito + "]";
	}


}
