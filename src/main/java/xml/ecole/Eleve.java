package xml.ecole;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

public class Eleve {
    private String nom;
    private  String prenom;
    private int age;
    private List<String> secondPrenoms=new ArrayList<>();
    private Note note;

    public Eleve() {
    }

    public Eleve(String nom, String prenom, int age,Note note) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.secondPrenoms=new ArrayList<>();
        this.note=note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @XmlTransient
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @XmlAttribute(name="vieillesse")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @XmlList
    public List<String> getSecondPrenoms() {
        return secondPrenoms;
    }

    public void setSecondPrenoms(List<String> secondPrenoms) {
        this.secondPrenoms = secondPrenoms;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
