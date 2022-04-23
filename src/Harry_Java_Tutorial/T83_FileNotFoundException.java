package Harry_Java_Tutorial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class T83_FileNotFoundException {
    public static void method() throws FileNotFoundException {
        FileReader fileReader=new FileReader("c:\\Users\\dhara\\Desktop\\englab.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            method();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
