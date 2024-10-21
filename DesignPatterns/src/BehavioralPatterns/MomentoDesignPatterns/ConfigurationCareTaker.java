package BehavioralPatterns.MomentoDesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento Memento) {
        history.add(Memento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int lastMementoIndex = history.size() - 1;
            //get the last memento from the list
            ConfigurationMemento lastMemento = history.get(lastMementoIndex);
            //remove the last memento from the list now
            history.remove(lastMementoIndex);
            return lastMemento;
        }
        return null;
    }



}
