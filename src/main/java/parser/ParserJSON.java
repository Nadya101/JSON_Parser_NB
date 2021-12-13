package parser;

import com.google.gson.Gson;
import lombok.Data;
import objects.ReleaseList;

import java.io.FileReader;
import java.io.IOException;

@Data
public class ParserJSON {
private ReleaseList releaseLists;
final String filePath = "src/main/resources/settings.json";

    public ParserJSON () {

        try (FileReader reader = new FileReader(filePath)) {
            releaseLists = new Gson().fromJson(reader, ReleaseList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}