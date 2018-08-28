package sesta.projekat.model;

import javax.persistence.*;

@Entity
@Table
public class Poruka {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Korisnik posiljalac;

    @ManyToOne
    @JoinColumn
    private Rezervacija rezervacija;

    @Column
    private String tekst;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
	public Korisnik getPosiljalac() {
		return posiljalac;
	}
	
	public void setPosiljalac(Korisnik posiljalac) {
		this.posiljalac = posiljalac;
	}
	
	public Rezervacija getRezervacija() {
        return rezervacija;
    }

    public void setRezervacija(Rezervacija rezervacija) {
        this.rezervacija = rezervacija;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
