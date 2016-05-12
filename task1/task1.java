import java.util.*;

//будут вводить цифры, а мы их будем упорядочивать.
// сначала выводить простые числа по возрастанию, а потом все остальные, которые тоже упорядочены по возрастани.
// 1 2 3 5 7 9 12 257 81 0 6 - исходный ряд
//1 2 3 5 7 257 0 6 9 12 81 - должно быть

public class task1 {

    public static boolean isPrime(int N) {
        if (N < 1) return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }


    public static void main(String[] args) {

        SortedSet<Integer> setPrimes = new TreeSet<>();
        SortedSet<Integer> setNotPrimes = new TreeSet<>();


        Integer[] arr = {1, 2, 3, 5, 7, 9, 12, 257, 81, 0, 6};
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                setPrimes.add(arr[i]);
            } else {
                setNotPrimes.add(arr[i]);
            }
        }

        LinkedHashSet<Integer> sad = new LinkedHashSet<>();
        sad.addAll(setPrimes);
        sad.addAll(setNotPrimes);

        System.out.println(sad);


    }
}