package com.mitocode.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "signos")
public class Signos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSigno;

	@ManyToOne // FK
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signo_paciente"))
	private Paciente paciente;

	@Column(name = "fecha")
	private LocalDateTime fecha;

	@Column(name = "temperatura")
	private String temperatura;

	@Column(name = "pulso")
	private String pulso;

	@Column(name = "ritmo_respiratorio")
	private String ritmoResp;

	public int getIdSigno() {
		return idSigno;
	}

	public void setIdSigno(int idSigno) {
		this.idSigno = idSigno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmoResp() {
		return ritmoResp;
	}

	public void setRitmoResp(String ritmoResp) {
		this.ritmoResp = ritmoResp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idSigno;
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result + ((pulso == null) ? 0 : pulso.hashCode());
		result = prime * result + ((ritmoResp == null) ? 0 : ritmoResp.hashCode());
		result = prime * result + ((temperatura == null) ? 0 : temperatura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Signos other = (Signos) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idSigno != other.idSigno)
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (pulso == null) {
			if (other.pulso != null)
				return false;
		} else if (!pulso.equals(other.pulso))
			return false;
		if (ritmoResp == null) {
			if (other.ritmoResp != null)
				return false;
		} else if (!ritmoResp.equals(other.ritmoResp))
			return false;
		if (temperatura == null) {
			if (other.temperatura != null)
				return false;
		} else if (!temperatura.equals(other.temperatura))
			return false;
		return true;
	}
	
	

}
