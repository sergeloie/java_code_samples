// перевернуть строку
public String reverseUsingStringBuilder(String input) {
    if (input == null) {
        return null;
    }

    return new StringBuilder(input).reverse().toString();
}

//разделить предложение на слова, без пробелов и прилепившихся знаков препинания
string.split("[!?',;.\\s]+")

// и  собрать в мапу, в нижнем регистре, с подсчётом количества  слов
        Map<String, Long> map = Arrays.stream(paragraph.split("[!?',;.\\s]+"))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));    
