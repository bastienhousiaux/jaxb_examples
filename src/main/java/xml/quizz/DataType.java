package xml.quizz;

import com.sun.xml.internal.txw2.annotation.XmlElement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DataType {
    TEXT_DATA("textData"),
    IMAGE_URL_DATA("imgUrlData");

    private String name;

    public String getName() {
        return name;
    }
}
