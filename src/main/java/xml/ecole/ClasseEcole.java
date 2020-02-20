package xml.ecole;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
@XmlType(propOrder = {"intitule","eleveList"})
public class ClasseEcole {

    private List<Eleve> eleveList=new ArrayList<>();
    private String intitule;

    public ClasseEcole() {
    }

    public ClasseEcole(String intitule) {
        this.intitule = intitule;
    }

    @XmlElementWrapper(name="eleves")
    @XmlElement(name="eleve")
    public List<Eleve> getEleveList() {
        return eleveList;
    }

    public void setEleveList(List<Eleve> eleveList) {
        this.eleveList = eleveList;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
