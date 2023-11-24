import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class exercise3 {


    static void sumnumber(int number) {
        int sum = 0;
        for (int index = 0; index < number; index++) {
            sum += (index + 1);
        }
        System.out.println(sum);
    }

    static void calculatefactorial(int number) {
        int result = 1;
        for (int index = number; index >0; index--) {
            result =result* index;
        }
        System.out.println(result);
    }

    static void initializearray() {
        int[] array = new int[11];
        for (int index = 0; index < 10; index++) {
            array[index] = (index + 1);
            System.out.println(array[index] + " ");
        }
    }

    static void sumarray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        System.out.println(sum);
    }

    static void minMax() {
        int[] array = new int[]{2, 1, 4, 6, 5, 9};
        int min = 99999999;
        int max = -99999999;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("value min: " + min);
        System.out.println("value max: " + max);
    }

    static void search() {
        int[] array = new int[]{2, 6, 4, 7};
        int number = 7;
        int check = 1;
        for (int index = 0; index < array.length; index++) {
            if (number == array[index]) {
                System.out.println("YES");
                check = 0;
                break;
            }
        }
        if (check == 1) {
            System.out.println("NO");
        }
    }

    static void multiplication(int number) {
        int number1 = 1;
        for (int index = 1; index <= 10; index++) {
            number1 = (index * number);
            System.out.println(number + "*" + index + "=" + number1);
        }
    }

    static void reverseArray(int[] array) {

        int j = array.length - 1;

        while (j >=0) {

            System.out.print(array[j]+" ");
            j--;

        }
    }

    static void countOccurrences() {
        int count = 0;
        String [] stringArray=new String[] {"hello"};
        char character='l';
        for (String str : stringArray) {

            char[] charArray = str.toCharArray();


            for (int i = 0; i < charArray.length; i++) {

                if (charArray[i] == character) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

     static void calculateDigitSum(int number) {
        int sum = 0;


        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

         System.out.println(sum);
    }


    static void random() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + numberOfGuesses + " guesses.");
            }
        } while (userGuess != randomNumber);
    }





         static void matrix() {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the size of the square matrix (n): ");
            int n = scanner.nextInt();


            int[][] matrix = new int[n][n];


            System.out.println("Enter the elements of the matrix row by row:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }


            int mainDiagonalSum = 0;
            int secondaryDiagonalSum = 0;

            for (int i = 0; i < n; i++) {
                mainDiagonalSum += matrix[i][i];
                secondaryDiagonalSum += matrix[i][n - i - 1];
            }


            if (n % 2 != 0) {
                int centerIndex = n / 2;
                mainDiagonalSum -= matrix[centerIndex][centerIndex];
            }



            System.out.println("Sum of both diagonals: " + (mainDiagonalSum + secondaryDiagonalSum));


            scanner.close();
        }



    static void countCharacter(){
        String[] array= new String[]{"hello","trang"};
        char s='t';
        int count=0;
        for (int index=0;index<array.length;index++){
            for(int j=0;j<array[index].length();j++){
                if(array[index].charAt(j) == s ){
                    count++;
                }
            }
        }
        System.out.println("have "+count+ " character "+ s+ " in string.");
    }
    static void characterFrequencyCounter(){
        String str="hello trang";
        int[] arr= new int[255];
        for (char ch: str.toCharArray()){
            arr[ch]++;
        }
        Map<Character,Integer> frequencyMap= new HashMap<>();
        for (char ch: str.toCharArray()){
            frequencyMap.put(ch,arr[ch]);
        }
        for( Map.Entry<Character,Integer> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    static void countVowel() {
        String str = "-1 la so am";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == '-') {
                if (Character.isDigit(str.charAt(i + 1))) {
                    count++;
                }
            }
        }
        System.out.println( count + " vowel number.");
    }


        public static void main(String [] args)
    {
        int [] arr=new int [] {1,2,3,4};
        reverseArray(arr);
        System.out.println("\n");
        multiplication(2);
        search();
        minMax();
        sumarray();
        initializearray();
        calculatefactorial(1234);
        sumnumber(10);
        countOccurrences();
        calculateDigitSum(1234);
        countCharacter();
        characterFrequencyCounter();
        countVowel();
        random();
        matrix();
    }
}
