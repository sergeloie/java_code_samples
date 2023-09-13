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