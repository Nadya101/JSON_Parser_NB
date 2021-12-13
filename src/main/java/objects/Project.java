package objects;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Project {

    private String name;
    private String releaseGroup;
    private ArrayList<ReportFile> reportFiles;
    private ArrayList<Project> childProjects;
    private ArrayList<RootCause> rootCauses;
    private ArrayList<Epic> epics;

}