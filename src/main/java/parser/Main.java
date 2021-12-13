package parser;

public class Main {

    public static void main(String[] args) {
        ParserJSON parserJSON = new ParserJSON();
        System.out.println(parserJSON);
        System.out.println(parserJSON.getReleaseLists().getProjects().get(0).getEpics().get(1).getName());

    }

}