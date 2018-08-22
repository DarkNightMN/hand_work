import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @ Author: xin
 * @ Date: 2018/8/8 15:50
 */
public class NewConvert {
    public static void main(String[] args) throws IOException {

        //读取json文件
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(new FileReader("src/test2.json"));
        //创建xml
        Document document=DocumentHelper.createDocument();
        Element root=document.addElement("部门");

        //读取部门Array
        JsonArray dep = object.get("部门").getAsJsonArray();

        //遍历每个部门
        for (int depno=0;depno<dep.size();depno++) {
            JsonObject depname = (JsonObject) dep.get(depno);
            //获取部门名称
            Set<String> depkey = depname.keySet();
            Iterator<String> depIterator = depkey.iterator();
            String s=depIterator.next();

            JsonArray  groups= depname.get(s).getAsJsonArray();

            //遍历每个部门的分组
            for (int j = 0; j < groups.size(); j++) {
                //xml添加部门
                Element d=root.addElement(s);

                JsonObject group = (JsonObject) groups.get(j);

                Set<String> key = group.keySet();
                Iterator<String> iterator = key.iterator();
                String s1=iterator.next();

                JsonArray groupmember = group.get(s1).getAsJsonArray();


                //遍历每个分组的学生
                for (int i = 0; i < groupmember.size(); i++) {
                    //xml添加部门分组
                    Element g=d.addElement(s1);

                    JsonObject stu = groupmember.get(i).getAsJsonObject();

                    Element id=g.addElement("id");
                    id.addText(stu.get("id").getAsString());

                    Element name=g.addElement("name");
                    name.addText(stu.get("name").getAsString());

                    Element score=g.addElement("score");
                    score.addText(stu.get("score").getAsString());
                }
            }
        }

        XMLWriter writer= new XMLWriter(new OutputStreamWriter(
                new FileOutputStream("src/test2.xml"), "UTF-8"));
        writer.write(document);
        writer.close();
    }
}
