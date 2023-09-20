//Проверить, есть ли в массиве array1 три последовательных числа (вернёт boolean)
IntStream.range(0, array1.length - 2)
        .anyMatch(i -> array1[i] + 2 == array1[i+1] + 1 && array1[i+1] + 1 == array1[i+2]));


//Вернуть массив целых чисел из ArrayList<Integer>
ArrayList<Integer> arrList = new ArrayList<>();
return arrList.stream()
              .mapToInt(i -> i)
              .toArray();


//Вернуть массив без повторов
return Arrays.stream(arr)
              .distinct()
              .toArray();


//Вернуть массив без повторов и отсортированный
return Arrays.stream(arr)
              .distinct()
              .sorted()
              .toArray();


//Сумма чисел в массиве
int[] arr = {1,15,6,3};
int sumNum = Arrays.stream(arr).sum();


//Сумма цифр всех чисел в массиве
int[] arr = {1,15,6,3};
String temp2 = Arrays.stream(arr)
                      .mapToObj(String::valueOf)
                      .collect(Collectors.joining());
int sumDig = Arrays.stream(temp2.split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();


//В массиве все числа парные, кроме одного. Как его найти? XOR всех элементов
int[] nums = {2, 3, 1, 2, 3};
int result = Arrays.stream(nums)
                    .reduce(0, (x, y) -> x ^ y);


//Вывести на печать числа от 0 до 100
IntStream.range(0, 101)
        .forEach(System.out::println);
//или
IntStream.rangeClosed(0, 100)
        .forEach(System.out::println);

//Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"

public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
}
// или
public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> s.replaceAll("\\D+", "")))
                .collect(Collectors.joining(" "));
}

// или
public class Order {
        public static String order(String words) {
                return Pattern.compile(" ")
                        .splitAsStream(words)
                        .sorted(Comparator.comparingInt(Order::intExtractor))
                        .collect(Collectors.joining(" "));
}
public static int intExtractor(String candidate){
        return new Scanner(candidate).useDelimiter("\\D+").nextInt();
}

