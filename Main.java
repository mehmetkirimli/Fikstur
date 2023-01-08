package Fixture;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) 
    {
        List<String > list = new ArrayList<>();
        list.add("GS");
       
        list.add("FB");
        list.add("BJK");
        list.add("ADANA");
        list.add("TS");
        
        FixtureGenerator fixtureGenerator = new FixtureGenerator();
        
        List<List<Match>> all= fixtureGenerator.getFixtures(list);
        fixtureGenerator.print(all);

    }
}