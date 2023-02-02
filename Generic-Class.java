package generic;

public class Main {
    public static void main(String[] args) {
        // Class Nullable<>
        String str = "Text I Wrote";
        Integer num = 123456789;

        Nullable<String> text = new Nullable<>(str);
        Nullable<Integer> number = new Nullable<>(num);

        text.run();
        number.run();

        // Class generic.Test<>
        Integer a = 24;
        String b = "2nd Text I Wrote";
        Double c = 2.71;

        Test<Integer,String,Double> test = new Test<>(a,b,c);
        test.showInfo();
    }
}
/*Output:
         Text I Wrote
         123456789
         T1 : 24 : Integer
         T2 : 2nd Text I Wrote : String
         T3 : 2.71 : Double
 */
