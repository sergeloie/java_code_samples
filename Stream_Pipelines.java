 // Метод принимает на вход список строк с повторениями и возвращает список уникальных строк, отсортированный по частоте вхождения строки в оригинальный список
public static List<String> collapseListOfDifferentStringsIntoSortedListOfUniqueStrings(List<String> list) {
  return list.stream() // Stream<String>
    .collect(Collectors.groupingBy(s -> s, Collectors.counting())) // Map<String, Long>
    .entrySet().stream() // Stream<Entry<String, Long>>
    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
    .map(Map.Entry::getKey) // Stream<String>
    .collect(Collectors.toList());
}
