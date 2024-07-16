package ec.edu.ups.ec.ppw.demojakarta.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="TBL_CLIENTE")
public class Cliente {

	@Id
	@Column(name = "cli_cedula")
	private String cedula;
	
	@Column(name = "cli_nombre")
	private String nombre;
	
	@Column(name = "cli_direccion")
	private String direccion;
	
	@Column(name = "cli_consumo")
	private String consumo;
	
	@Column(name = "cli_debt")
	private String debt;
	
	


    
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	public String getDebt() {
		return debt;
	}
	public void setDebt(String debt) {
		this.debt = debt;
	}
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", consumo=" +consumo + ", deudas=" + debt +  "]";
	}
	
		


	}