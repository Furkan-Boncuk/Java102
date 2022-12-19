package _02;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\__Java_PatikaDev\\Input-Output_Islemleri\\_01_io\\src\\_02\\patika.txt");

        //create file-----------------------------------------------------------------------------------------------------------
        try{
            if(file.createNewFile()){
                System.out.println(file.getName()+" file created");
            }else{
                System.out.println(file.getName()+" file already exists");
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //delete file------------------------------------------------------------------------------------------------------------
        file.delete();

        //create a file on a non-existing directory------------------------------------------------------------------------------
        File directory = new File("C:\\__Java_PatikaDev\\Input-Output_Islemleri\\_01_io\\src\\_02\\test");
        directory.mkdir();
        File file2 = new File("C:\\__Java_PatikaDev\\Input-Output_Islemleri\\_01_io\\src\\_02\\test\\patika.txt");
        try{
            if(file2.createNewFile()){
                System.out.println(file2.getName()+" dosyası "+directory.getName()+" dizininin altına oluşturuldu");
            }else{
                System.out.println(file2.getName()+" dosyası zaten mevcut !");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //only create directories-------------------------------------------------------------------------------------------------
        File directory2 = new File("Patika/dev");
        System.out.println(directory2.mkdirs());  //In this case, the mkdirs() function is used.

        //list files in directory-------------------------------------------------------------------------------------------------
        File directory3 = new File("Patika");
        String[] list1 = directory3.list();
        for(String str : list1){
            System.out.println(str);
        }
    }
}
