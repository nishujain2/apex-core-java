package main.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class State {
    private String stateCode;
    private String stateName;
    private String capital;

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public State(String stateCode, String stateName, String capital) {
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateCode='" + stateCode + '\'' +
                ", stateName='" + stateName + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<State> states = new ArrayList<>();
        states.add(new State("CA","California","Sacramento"));
        states.add(new State("CO","Colorado","Denver"));
        states.add(new State("CT","Connecticut","capital1"));
        states.add(new State("DE","Delaware","capital2"));
        states.add(new State("DC","District Of Columbia","Washington D.C."));
        states.add(new State("FL","Florida","Miami"));
        states.add(new State("GA","Georgia","capital3"));
        states.add(new State("GU","Guam","capital4"));
        states.add(new State("HI","Hawaii","Honolulu"));
        states.add(new State("ID","Idaho","Boise"));
        for (State state : states) {
            System.out.println(state);
        }
        System.out.println("\n\n");
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("/Users/nishujain/Documents/Development/apex-core-java/src/main/resources/company.properties")){
            properties.load(fileInputStream);
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()) {
                System.out.println(properties.getProperty(keys.nextElement().toString()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
