package sesta.projekat.model;

import javax.persistence.*;

@Entity
@Table
public class Lokacija {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String drzava;
	
	@Column
	private String mesto;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDrzava() {
		return drzava;
	}
	
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	
	public String getMesto() {
		return mesto;
	}
	
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
}
