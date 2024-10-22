package adressbuch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.foreign.PaddingLayout;
import java.util.*;

public class EMailAdressBuch {
    //hashmap
    HashMap<String, String> adressbuch ;

    public EMailAdressBuch(){
        adressbuch = new HashMap<String, String>();
    }

    public void einfuegen(String name, String email){
        // falls der name vorhanden ist dann email aktualiesieren
        if(adressbuch.containsKey(name))
            adressbuch.replace(name,email);
        else
            adressbuch.put(name,email);
    }
    //returns email
    public String abfrage(String name){
        if(adressbuch.containsKey(name))
            //noSuchElementException(unchecked)
            throw new NoSuchElementException("dieser name ist ungültig! ");
        return adressbuch.get(name);
    }
    public String toString(){
        //{Paul=worldweb.de, Maria... }
        ArrayList<String> returnStr = new ArrayList<>();
        Set<String> keys = adressbuch.keySet();
        Collection<String> values = adressbuch.values();

        ArrayList<String> keyList = new ArrayList<String>(keys);
        ArrayList<String> valueList = new ArrayList<>(values);

        System.out.println("{");
        for (int i = 0; i < adressbuch.size(); i++) {
            returnStr.add(keyList.get(i) + "=" + valueList.get(i));
        }
        return returnStr.toString();
    }


    //
    //txt datei bearbeiten
    //
    public void einlesen(String dateiname){
        //text datei einlesen und in Hashmap adressbuch einfügen
        int ch; // für fileReader.read() falls -1 kommt.
        FileReader fr = null;

        try{
            fr= new FileReader("emailadressbuch.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        while(ch = fr.read() != -1){

        }
    }


}
