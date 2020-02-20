package xml.developpez;

import java.util.Map;

public interface IQueryLoader {

    Map<String, String> getQueries(String queriesName);

    String getQuery(String groupName, String queryName);

}
