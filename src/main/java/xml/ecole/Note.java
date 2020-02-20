package xml.ecole;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum Note {
    @XmlEnumValue("Très bien") TB,
    @XmlEnumValue("Bien") B,
    @XmlEnumValue("Suffisant") S,
    @XmlEnumValue("Insuffisant") I
}
