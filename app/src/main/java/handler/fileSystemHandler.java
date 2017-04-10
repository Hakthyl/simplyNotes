package handler;

import android.content.Context;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import com.google.gson.Gson;

import datatypes.listElement;

/**
 * Created by Hannes on 03.04.2017.
 */

public class fileSystemHandler {
    private static fileSystemHandler reference= new fileSystemHandler();
    private File appDirectory = null;
    private static Gson GSON = new Gson();
    private Context context;

    private fileSystemHandler(){
        this.appDirectory = this.context.getFilesDir();
    }
    public static fileSystemHandler getReference(){
        return reference;
    }
    public void setContext(Context context){
        this.context = context;
    }
    public boolean saveFile(String jsonDataToSave, String filename){
        FileOutputStream fOut;
        try{
            fOut = new FileOutputStream(new File(this.appDirectory, filename));
            fOut.write(jsonDataToSave.getBytes());
            fOut.close();
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    //TODO:
    /*
    public List<T> loadData(String filename, T type){
        List<T> loadedData = null;
        FileInputStream fIn;
        String savedJson = "";
        try{
            fIn = new FileInputStream(new File(this.appDirectory, filename));
            int content;
            while ((content = fIn.read()) != -1) {
                // convert to char and display it
                savedJson += (char) content;
            }
            loadedData = GSON.fromJson(savedJson, loadedData.getClass());
            GSON.fro
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return loadedData;
    }
    */
    public boolean eraseData(){

        return true;
    }
    public boolean deleteEntry(listElement listElementToDelete){

        return true;
    }
}
