package co.edu.usbcali.demo.modelo;
// Generated May 4, 2016 10:21:41 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Retiros generated by hbm2java
 */
public class Retiros implements java.io.Serializable {

	@NotNull
	private RetirosId id;
	
	@NotNull
	private Usuarios usuarios;
	
	@NotNull
	private Cuentas cuentas;
	
	@NotNull
	private BigDecimal retValor;
	
	@NotNull
	@Past
	private Date retFecha;
	
	@NotBlank
	@Length(max=50)
	private String retDescripcion;

	public Retiros() {
	}

	public Retiros(RetirosId id, Cuentas cuentas, BigDecimal retValor, Date retFecha, String retDescripcion) {
		this.id = id;
		this.cuentas = cuentas;
		this.retValor = retValor;
		this.retFecha = retFecha;
		this.retDescripcion = retDescripcion;
	}

	public Retiros(RetirosId id, Usuarios usuarios, Cuentas cuentas, BigDecimal retValor, Date retFecha,
			String retDescripcion) {
		this.id = id;
		this.usuarios = usuarios;
		this.cuentas = cuentas;
		this.retValor = retValor;
		this.retFecha = retFecha;
		this.retDescripcion = retDescripcion;
	}

	public RetirosId getId() {
		return this.id;
	}

	public void setId(RetirosId id) {
		this.id = id;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Cuentas getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(Cuentas cuentas) {
		this.cuentas = cuentas;
	}

	public BigDecimal getRetValor() {
		return this.retValor;
	}

	public void setRetValor(BigDecimal retValor) {
		this.retValor = retValor;
	}

	public Date getRetFecha() {
		return this.retFecha;
	}

	public void setRetFecha(Date retFecha) {
		this.retFecha = retFecha;
	}

	public String getRetDescripcion() {
		return this.retDescripcion;
	}

	public void setRetDescripcion(String retDescripcion) {
		this.retDescripcion = retDescripcion;
	}

}
