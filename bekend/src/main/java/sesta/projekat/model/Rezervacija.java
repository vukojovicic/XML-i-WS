package sesta.projekat.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table
public class Rezervacija {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn
	private Smestaj smestaj;
	
	@ManyToOne
	@JoinColumn
	private Korisnik klijent;
	
	@Column
	private Date od;
	
	@Column
	private Date paOndaDo;
	
	@Column
	private int ocena;
	
	@Column
	private  String komentar;
	
	@Column
	private boolean odobrenKomentar;
	
	@Column
	private boolean realizovana;

	@Column
	private boolean fejk;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Smestaj getSmestaj() {
		return smestaj;
	}
	
	public void setSmestaj(Smestaj smestaj) {
		this.smestaj = smestaj;
	}
	
	public int getOcena() {
		return ocena;
	}
	
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	public Korisnik getKlijent() {
		return klijent;
	}
	
	public void setKlijent(Korisnik klijent) {
		this.klijent = klijent;
	}
	
	public String getKomentar() {
		return komentar;
	}
	
	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}
	
	public boolean isOdobrenKomentar() {
		return odobrenKomentar;
	}
	
	public void setOdobrenKomentar(boolean odobrenKomentar) {
		this.odobrenKomentar = odobrenKomentar;
	}
	
	public boolean isRealizovana() {
		return realizovana;
	}
	
	public void setRealizovana(boolean realizovana) {
		this.realizovana = realizovana;
	}
	
	public Date getOd() {
		return od;
	}
	
	public void setOd(Date od) {
		this.od = od;
	}
	
	public Date getPaOndaDo() {
		return paOndaDo;
	}
	
	public void setPaOndaDo(Date paOndaDo) {
		this.paOndaDo = paOndaDo;
	}

	public boolean isFejk() {
		return fejk;
	}

	public void setFejk(boolean fejk) {
		this.fejk = fejk;
	}
}
