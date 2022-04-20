package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Allievo {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(nullable = false)
    private String nome;
	@Column(nullable = false)
    private String cognome;
    private LocalDate dataNascita;
    private String luogoNascita;
    @Column(nullable = false)
    private String matricola;
    private String email;
    
    @OneToOne				/*La politica di default del @OneToOne � EAGER, inoltre, non si effettua il cascade perch� Allievo e Societ� non sono una composizione */
    private Societ� societ�;
    
    @ManyToMany				/*La politica di default del @ManyToMany � LAZY, inoltre, non si effettua il cascade perch� Allievo e Corsi non sono una composizione*/
    private List<Corso> corsi;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Societ� getSociet�() {
		return societ�;
	}
	public void setSociet�(Societ� societ�) {
		this.societ� = societ�;
	}
	public List<Corso> getCorsi(){
		return corsi;
	}
	
	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
}
