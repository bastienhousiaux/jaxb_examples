import xml.ecole.ClasseEcole;
import xml.ecole.Eleve;
import xml.ecole.Note;

import javax.xml.bind.JAXB;

public class Main {
    public static void main(String[] args) {
        String dossierProjet=System.getProperty("user.dir");
        String fichierXMl=dossierProjet+"/src/main/resources/classeEcole.xml";
//
//        Eleve eleve=new Eleve("Bla","Maurice",16, Note.TB);
//        Eleve eleve2=new Eleve("Pouffsouffle","Elena",15,Note.I);
//        Eleve eleve3=new Eleve("Rout","Thomas",14,Note.S);
//
//        eleve3.getSecondPrenoms().add("Jhon");
//        eleve3.getSecondPrenoms().add("Kevin");
//        ClasseEcole classeEcole=new ClasseEcole("sl1");
//
//        classeEcole.getEleveList().add(eleve);
//        classeEcole.getEleveList().add(eleve2);
//        classeEcole.getEleveList().add(eleve3);

//        JAXB.marshal(classeEcole,fichierXMl);
        ClasseEcole classe=JAXB.unmarshal(fichierXMl,ClasseEcole.class);
        classe.getEleveList().forEach(
                eleve -> {
                    System.out.println(eleve.getNom());
                }
        );
    }
}
