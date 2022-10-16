package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
private String jmeno;
    private String prijmeni;
    private String firma;

    private String celaAdresa;
    private String email;
    private String telefon;
    private String web;

    public Vizitka () {
    };

    public Vizitka(String jmeno, String prijmeni, String firma, String celaAdresa, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.firma = firma;
        this.celaAdresa = celaAdresa;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getCelaAdresa() {
        return celaAdresa;
    }

    public void setCelaAdresa(String celaAdresa) {
        this.celaAdresa = celaAdresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
