package xml.quizz;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class MemoryCardList {

    private String name;

    private List<MemoryCard> memoryCards=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<MemoryCard> getMemoryCards() {
        return memoryCards;
    }

    public void setMemoryCards(List<MemoryCard> memoryCards) {
        this.memoryCards = memoryCards;
    }
}
