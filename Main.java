import java.util.ArrayList;

public class Main {
    static long prevN = 0;

    public static void main(String[] args) {
        ArrayList<Pairs> nums = new ArrayList<>();

        for (long i = 0; i <= 10000000; i++) {
            nums.add(new Pairs(i, f(i)));
        }

        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i).getN() == nums.get(i).getfN()){
                System.out.println(nums.get(i).toString());
            }
        }
    }

    public static long f(long n) {
        String placeHold = Long.toString(n);
        long counter = 0;
        long temp;

        for (int i = 0; i < placeHold.length(); i++) {
            if (placeHold.charAt(i) == '1') {
                counter++;
            }
        }

        temp = counter + prevN;
        prevN = temp;
        return temp;
    }
}
