package xml.quizz;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class MemoryCard {

    private List<TypedData> recto=new ArrayList<>();

    private List<TypedData> verso=new ArrayList<>();

    public void setRecto(List<TypedData> recto) {
        this.recto = recto;
    }

    public void setVerso(List<TypedData> verso) {
        this.verso = verso;
    }
    @XmlElementWrapper(name = "recto")
    @XmlElement(name="datachunk")
    public List<TypedData> getRecto() {
        return recto;
    }
    @XmlElementWrapper(name="verso")
    @XmlElement(name="datachunk")
    public List<TypedData> getVerso() {
        return verso;
    }
}
