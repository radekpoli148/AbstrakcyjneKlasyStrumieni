package abstrakcyjneklasystrumieni;

import java.io.*;


public class AbstrakcyjneKlasyStrumieni {

    public static void main(String[] args) throws IOException 
    {
        File plik = new File("NazwaPliku.txt");
        
        InputStream inS;
        OutputStream outS;
        
        Reader reader;
        //Writer writer = new FileWriter(plik); od tego zaczynalismy
        //filtrowanie strumienia ponizej
        //plik - poswala znaleść ścieżkę do pliku
        //FileOutputStream - pozwala na otworzenie strumienia i zmiany w pliku
        //OutputStreamWriter - pozwala na zapisywanie do pliku
        //BufferedWriter - pozwala na buforowanie danych i wysyłanie ich w
        //                 pakietach przyśpieszając działanie programu
        Writer writer =  new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));
        
        writer.write("lala");
        
        ((BufferedWriter)writer).newLine();
        ((BufferedWriter)writer).write("Następna linia");
        ((BufferedWriter)writer).close();
    }
    
    void nazwaF(InputStream inS)
    {
        
    }
}
