package sesta.projekat.model;

import javax.persistence.*;

@Entity
@Table
public class TipSmestaja {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String naziv;//(hotel, bad&breakfast, apartman)

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
