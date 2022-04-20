package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Società {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(nullable = false)
    private String ragioneSociale;
    private String sede;
    private String indirizzoSede;
    private int numeroCivico;
    private String comune;
    private int cap;
    private String provincia;
    private String telefono;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getIndirizzoSede() {
		return indirizzoSede;
	}
	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}
	public int getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    

}
