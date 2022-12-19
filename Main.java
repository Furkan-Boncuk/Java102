package _02;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dosya = new File("C:\\__Java_PatikaDev\\Input-Output_Islemleri\\_01_io\\src\\_02\\patika.txt");

        //DOSYA OLUŞTUR----------------------------------------------------------------------------------------------------------------
        try{
            if(dosya.createNewFile()){
                System.out.println(dosya.getName()+" dosyası oluşturuldu");
            }else{
                System.out.println(dosya.getName()+" dosyası zaten mevcut !");
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //DOSYA SİL---------------------------------------------------------------------------------------------------------------------
        dosya.delete();

        //VAR OLMAYAN BİR DİZİN ÜZERİNE DOSYA OLUŞTURMAK--------------------------------------------------------------------------------
        File dizin = new File("C:\\__Java_PatikaDev\\Input-Output_Islemleri\\_01_io\\src\\_02\\test");
        dizin.mkdir();
        File dosya2 = new File("C:\\__Java_PatikaDev\\Input-Output_Islemleri\\_01_io\\src\\_02\\test\\patika.txt");
        try{
            if(dosya2.createNewFile()){
                System.out.println(dosya2.getName()+" dosyası "+dizin.getName()+" dizininin altına oluşturuldu");
            }else{
                System.out.println(dosya2.getName()+" dosyası zaten mevcut !");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //YALNIZCA DİZİNLERİ OLUŞTURMAK-------------------------------------------------------------------------------------------------
        File dizin2 = new File("Patika/dev");
        System.out.println(dizin2.mkdirs());  //!!! Bu durumda mkdirs() fonksiyonu kullanılır.

        //DİZİNDEKİ DOSYALARI LİSTELEMEK------------------------------------------------------------------------------------------------
        File dizin3 = new File("Patika");
        String[] liste = dizin3.list();
        for(String str : liste){
            System.out.println(str);
        }
    }
}
