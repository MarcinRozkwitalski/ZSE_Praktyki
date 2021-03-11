package third_week.KolkoIKrzyzyk;

public class PrzykładForEach {

    public static void main(String[] args) {
        int [] numbers = {3, 5, 9, -5};

        for(int number : numbers) {
            System.out.println(number);
        }


        int sum = 0;

        for(int number1 : numbers) {
            sum += number1;
            System.out.println(sum);
        }


    }
}
