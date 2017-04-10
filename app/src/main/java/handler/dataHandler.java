package handler;

import java.util.List;

import datatypes.listElement;
import datatypes.user;

/**
 * Created by Hannes on 10.04.2017.
 */

public class dataHandler implements iDataHandler{
    private static dataHandler reference = new dataHandler();


    private dataHandler(){

    };
    public static dataHandler getReference(){
        return reference;
    }

    @Override
    public void createElement() {

    }

    @Override
    public void deleteElement(listElement element) {

    }

    @Override
    public void getJson() {

    }

    @Override
    public List<listElement> getListElementsForGlaeubiger(user glaeubiger) {
        return null;
    }

    @Override
    public List<listElement> getListElementsForSchuldner(user schuldner) {
        return null;
    }
}
