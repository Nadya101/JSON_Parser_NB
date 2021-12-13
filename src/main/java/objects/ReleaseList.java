package objects;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ReleaseList {

    private ArrayList<ReleaseGroup> releaseGroups;
    private ArrayList<Project> projects;

}