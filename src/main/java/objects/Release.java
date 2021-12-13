package objects;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Release {

    private String name;
    private String length;
    private String startDateOffset;
    private ArrayList<Sprint> sprints;

}