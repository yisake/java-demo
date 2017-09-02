package interview.json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonDemo {
    public static void main(String[] args) {
        
    }
    
    public static void toConsole( ) {
    	Gson gson=new GsonBuilder().create();
        gson.toJson("Hello", System.out);
        gson.toJson(123, System.out);
    }
    
    public static void toWriter (String[] args) throws IOException {
        Writer writer = new FileWriter("Output.json");
        Gson gson = new GsonBuilder().create();
        gson.toJson("Hello", writer);
        gson.toJson(123, writer);
        writer.close();
    }    
}
