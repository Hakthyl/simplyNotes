package handler;

import java.util.List;

import datatypes.listElement;
import datatypes.user;

/**
 * Created by Hannes on 10.04.2017.
 */

public interface iDataHandler {

    void createElement();
    void deleteElement(listElement element);
    void getJson();
    List<listElement> getListElementsForGlaeubiger(user glaeubiger);
    List<listElement> getListElementsForSchuldner(user schuldner);
}
