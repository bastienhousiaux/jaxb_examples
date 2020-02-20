package xml.quizz;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;


@AllArgsConstructor
public class TypedData {
    private String data;
    private DataType type;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }
}
