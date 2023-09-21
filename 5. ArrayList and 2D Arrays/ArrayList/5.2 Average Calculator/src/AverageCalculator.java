import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        int size_of_array = numbers.size();
        int sum = 0;
        double average;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / size_of_array;
        return average;
    }
}