package objects;

import lombok.*;

import java.util.ArrayList;

@Data
public class Epic {

    private String name;
    private String description;
    private Integer sSizes;
    private Integer startDateOffset;
    private ArrayList<String> releases;

}