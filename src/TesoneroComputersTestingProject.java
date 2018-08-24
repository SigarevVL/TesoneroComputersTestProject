import java.util.ArrayList;
import java.util.List;

public class TesoneroComputersTestingProject {


    public static int[] findDivisors(int inputNumber) {
        int[] dividersArray;
        if (inputNumber <= 0) {
            //в условии не написано, как поступать в случае 0 или отрицательных чисел,
            //поэтому ниже представлен возможный вариант решения
            System.out.println("Please, enter a natural number");
            dividersArray = new int[0];
        } else if (inputNumber == 1){
            //в условии не написано, как поступать в случае 1,
            //поэтому ниже представлен возможный вариант решения
            System.out.println(inputNumber + " is not prime but it have only one divider");
            dividersArray = new int[1];
            dividersArray[0] = inputNumber;
        } else{
            List<Integer> dividersList = new ArrayList<>();

            //поиск делителей
            for (int divider = 2; divider < inputNumber; divider++) {
                if ((inputNumber % divider) == 0) {
                    dividersList.add(divider);
                }
            }

            if(dividersList.size() == 0) {
                System.out.println(inputNumber + " is prime");
                dividersArray = new int[1];
                dividersArray[0] = inputNumber;
            } else {
                //если возвращать массив не примитивов, а оболочек, можно сделать так
                //Integer[] dividersArray = dividersList.toArray(new Integer[dividersList.size()]);
                dividersArray = new int[dividersList.size()];
                for (int i = 0; i < dividersList.size(); i++) {
                    dividersArray[i] = dividersList.get(i);
                }
            }
        }
        return dividersArray;
    }


    public static int[] countPositivesSumNegatives(int[] inputArray) {
        int[] result;
        if (inputArray == null || inputArray.length == 0) {
            result = new int[0];
        } else {
            result = new int[2];
            for (int arrayElement : inputArray) {
                if (arrayElement > 0) {
                    result[0]++;
                } else {
                    result[1] += arrayElement;
                }
            }
        }
        return result;
    }
}
