package com.example.hugosimon.creationpostebenup.Model;

import java.io.File;

public class User {
    int user_id;
    String prenom;
    String adresse;
    String email;
    String pseudo;
    File pp = null;

    public User(int uid, String pse, String name, String adr, String mail){
        this.pseudo = pse;
        this.prenom = name;
        this.user_id = uid;
        this.adresse = adr;
        this.email = mail;
    }
}
