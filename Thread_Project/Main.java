package Thread_Project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1'den 10000 (10 bin)'e kadar olan sayılardan oluşan bir ArrayList oluşturunuz.
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 1; i <= 10000; i++) {
            numberList.add(i);
        }

        //Ardından, bu ArrayList'teki 10 bin elemanı 2500 eleman olacak şekilde 4 eşit parçaya ayırınız.
        int size = 2500;
        ArrayList<Integer>[] newArrayLists = new ArrayList[4];
        for (int i = 0; i < newArrayLists.length; i++) {
            newArrayLists[i] = new ArrayList<Integer>();
            for (int j = i * size; j < (i + 1) * size; j++) {
                newArrayLists[i].add(numberList.get(j));
            }
        }
        
        //Tek ve çift sayıları tutan ArrayList'ler ilk oluşturulduklarında boş olacaklardır. Ve iki tane ArrayList olacaklardır.
        ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbersList = new ArrayList<Integer>();

        //Bu 4 ayrı 2500 elemanlık ArrayList'ler içinde tek ve çift sayıları bulan 4 ayrı Thread tasarlayınız.
        Thread[] threads = new Thread[4];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new NumberController(newArrayLists[i], evenNumbersList, oddNumbersList));
            threads[i].start();
        }

        //Thread'lerin birbirinin tamamnlanmasını beklemesini sağlayalım:
        for(Thread t : threads){
            try{
                t.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        //Tek ve Çift sayılar listelerini yazdıralım: 
        System.out.println("Çift sayılar: " + evenNumbersList.toString());
        System.out.println("Tek sayılar: " + oddNumbersList.toString());
    }
}
