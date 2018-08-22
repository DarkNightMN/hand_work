import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/8 16:27
 */
public class XmlToJson {
    public static void main(String[] args) throws DocumentException {
        System.out.println("-----------------------");
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/test2.xml"));

        Element root = document.getRootElement();
        Iterator dep = root.elementIterator();

        JsonObject obj = new JsonObject();
        JsonObject department = new JsonObject();

        JsonArray groupArray = new JsonArray();

        Map<String, JsonArray> map = new HashMap<String, JsonArray>();

        while (dep.hasNext()) {
            Element d = (Element) dep.next();

            String key = d.getName();
            if (map.containsKey(key)) {
                map.put(key, groupArray);
            } else {
                groupArray = new JsonArray();
                map.put(key, groupArray);
            }

            Iterator group = d.elementIterator();
            JsonArray stuArray = new JsonArray();

            while (group.hasNext()) {
                Element g = (Element) group.next();
                JsonObject groupObject = new JsonObject();
                JsonObject stuObject = new JsonObject();
                stuObject.addProperty("id", g.element("id").getText());
                stuObject.addProperty("name", g.element("name").getText());
                stuObject.addProperty("score", g.element("score").getText());

                stuArray.add(stuObject);

                if (!group.hasNext()) {
                    groupObject.add(g.getName(), stuArray);
                    map.get(key).add(groupObject);
                }
            }
        }

        for (String k : map.keySet()) {
            department.add(k, map.get(k));
        }
        obj.add(root.getName(), department);
        System.out.println(obj);
    }
}


