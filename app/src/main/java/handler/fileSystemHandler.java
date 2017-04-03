package handler;

import android.content.Context;
import android.util.JsonWriter;


import org.json.JSONStringer;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

import datatypes.entry;

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
    public boolean saveFile(entry entryToSave, String filename){
        List<entry> savedData = this.loadData(filename);
        savedData.add(entryToSave);
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
    public List<entry> loadData(String filename){
        List<entry> loadedData;
        FileInputStream fIn;
        try{
            fIn = new FileInputStream(new File(this.appDirectory, filename));
          //TODO: laden byte[] => List
           // loadedData = GSON.fromJson(fIn..toString(), List<entry>);
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
    public boolean deleteEntry(entry entryToDelete){

        return true;
    }
}
