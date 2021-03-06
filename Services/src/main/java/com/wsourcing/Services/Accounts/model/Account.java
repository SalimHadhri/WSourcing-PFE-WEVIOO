package com.wsourcing.Services.Accounts.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



//ACCOUNT : LINKDIN accounts used for scraping
@Document(collection = "accounts")
public class Account {


    //Used to auto-generate Search id with long type in the database
    //mongodb id is a STRING type without auto-generate function
    @Transient
    public static final String SEQUENCE_NAME = "accounts_sequence";

    @Id
    private long id ;
    private String name;
    private String email;
    private String url;
    //unique kee which represent linkdin accounts
    private String liat;
    //2 states : En Marche/En Arret
    //represents the state of the account scraping or not
    private String etat;
    //Maximum number scraping to be done this day
    private int nb_scraping_jour;
    //Actual number scraping : number scraping to be done
    private int nb_scraping_actuel;
    //true: nb_scraping_actuel == 0
    //false: nb_scraping_actuel =< nb_scraping_jour && nb_scraping_actuel > 0
    private boolean liatExpired ;


    public Account() {
    }



    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", liat='" + liat + '\'' +
                ", etat='" + etat + '\'' +
                ", nb_scraping_jour=" + nb_scraping_jour +
                ", nb_scraping_actuel=" + nb_scraping_actuel +
                ", liatExpired=" + liatExpired +
                '}';
    }
    public Account( @Length(min = 3, max = 10, message = "ici votre message") String name, String email, String url, String liat, String etat, int nb_scraping_jour, int nb_scraping_actuel, boolean liatExpired) {
        this.name = name;
        this.email = email;
        this.url = url;
        this.liat = liat;
        this.etat = etat;
        this.nb_scraping_jour = nb_scraping_jour;
        this.nb_scraping_actuel = nb_scraping_actuel;
        this.liatExpired = liatExpired;
    }
    public Account(long id, @Length(min = 3, max = 10, message = "ici votre message") String name, String email, String url, String liat, String etat, int nb_scraping_jour, int nb_scraping_actuel, boolean liatExpired) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.url = url;
        this.liat = liat;
        this.etat = etat;
        this.nb_scraping_jour = nb_scraping_jour;
        this.nb_scraping_actuel = nb_scraping_actuel;
        this.liatExpired = liatExpired;
    }

    public boolean isLiatExpired() {
        return liatExpired;
    }

    public void setLiatExpired(boolean liatExpired) {
        this.liatExpired = liatExpired;
    }

    public static String getSequenceName() {
        return SEQUENCE_NAME;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLiat() {
        return liat;
    }

    public void setLiat(String liat) {
        this.liat = liat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getNb_scraping_jour() {
        return nb_scraping_jour;
    }

    public void setNb_scraping_jour(int nb_scraping_jour) {
        this.nb_scraping_jour = nb_scraping_jour;
    }

    public int getNb_scraping_actuel() {
        return nb_scraping_actuel;
    }

    public void setNb_scraping_actuel(int nb_scraping_actuel) {
        this.nb_scraping_actuel = nb_scraping_actuel;
    }


}
