package xml.developpez;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;
@XmlRootElement
public class Queries {

    private List<QueryGroup> queryGroups = new LinkedList<QueryGroup>();

    public final void setQueryGroups(List<QueryGroup> queryGroups) {
        this.queryGroups = queryGroups;
    }
    @XmlElement(name = "group")
    public final List<QueryGroup> getQueryGroups() {
        return queryGroups;
    }
}
