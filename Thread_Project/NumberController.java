package Thread_Project;

import java.util.ArrayList;

public class NumberController implements Runnable {
    private ArrayList<Integer> list;
    private ArrayList<Integer> evenNumbersList;
    private ArrayList<Integer> oddNumbersList;

    public NumberController(ArrayList<Integer> list, ArrayList<Integer> evenNumbersList, ArrayList<Integer> oddNumbersList) {
        this.list = list;
        this.evenNumbersList = evenNumbersList;
        this.oddNumbersList = oddNumbersList;
    }

    public void run() {
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number % 2 == 0) {
                synchronized (evenNumbersList) {
                    evenNumbersList.add(number);
                }
            } else {
                synchronized (oddNumbersList) {
                    oddNumbersList.add(number);
                }
            }
        }
    }
}
