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
    public static fileSystemHandler getReferece(){
        return reference;
    }
    public void setContext(Context context){
        this.context = context;
    }
    public boolean saveFile(listElement listElementToSave, String filename){
        List<listElement> savedData = this.loadData(filename);
        savedData.add(listElementToSave);
        FileOutputStream fOut;
        String dataToSave = GSON.toJson(savedData);
        try{
            fOut = new FileOutputStream(new File(this.appDirectory, filename));
            fOut.write(dataToSave.getBytes());
            fOut.close();
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public List<listElement> loadData(String filename){
        List<listElement> loadedData;
        FileInputStream fIn;
        try{
            fIn = new FileInputStream(new File(this.appDirectory, filename));
          //TODO: laden byte[] => List
           // loadedData = GSON.fromJson(fIn..toString(), List<listElement>);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    }
    public boolean eraseData(){

        return true;
    }
    public boolean deleteEntry(listElement listElementToDelete){

        return true;
    }
}
