package xml.developpez;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.LinkedList;
import java.util.List;

public class QueryGroup {

    private String name;

    private List<Query> queries = new LinkedList<Query>();
    @XmlAttribute
    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    @XmlElement(name = "query")
    public final List<Query> getQueries() {
        return queries;
    }

    public final void setQueries(List<Query> queries) {
        this.queries = queries;
    }

}
