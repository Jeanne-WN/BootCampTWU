import java.lang.Integer;import java.util.ArrayList;
import java.util.Random;

public class Calculator {

    private Random random;

    public Calculator(Random random) {
        this.random = random;
    }

    public int add(int firstNumber, int secondNumber){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        return add(numbers);
    }  //How ?

    public int add(ArrayList<Integer> numbers){
        int sum=0;
        for(Integer i:numbers)
            sum+=i;
        return sum;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int multiplyWithRandom(int number) {
        return number*random.nextInt();
    }
}
