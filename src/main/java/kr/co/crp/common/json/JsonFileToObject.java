package kr.co.crp.common.json;


import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.net.URL;
import java.util.Map;


public class JsonFileToObject {
    public static void main(String[] args) throws Exception {

        URL path = JsonFileToObject.class.getResource("/clothes/user.json");

        File jsonFile = new File(path.getFile());

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> jsonMap = mapper.readValue(jsonFile, Map.class);

        System.out.println("JSON File --> Map");

        System.out.println(jsonMap.toString());
    }

}
