import java.security.PublicKey;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*for (int i =0 ; i <=100; i++) {
            System.out.println("The number " + i + " " + isOdd(i));
        }
         */

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(10,5));
    }

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){

        if(start < 0 || end < 0 || start > end) {
            return -1;
        }

        int sumOfOddNumbers = 0;
        for(int i = start; i <= end; i++){
            if (isOdd(i)){
                sumOfOddNumbers += i;
            }
        }
        return  sumOfOddNumbers;
    }
}
