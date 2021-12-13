package objects;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ReleaseGroup {

    private String name;
    private ArrayList<Release> releases;

    }