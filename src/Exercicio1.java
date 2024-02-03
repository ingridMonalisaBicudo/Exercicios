import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
    Link challenge:
    https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one

     */
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double pos=0, neg=0, zero=0;

        for(int i=0; i< arr.size(); i++){

            if(arr.get(i)>0){
                pos ++;
            }
            else if(arr.get(i)<0){
                neg ++;
            }  else if(arr.get(i)==0) {
                zero ++;
            }

        }


        System.out.printf("%.6f\n", pos/arr.size());
        System.out.printf("%.6f\n", neg/arr.size());
        System.out.printf("%6f\n", zero/arr.size());

    }

}

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
}
