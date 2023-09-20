// перевернуть строку
public String reverseUsingStringBuilder(String input) {
    if (input == null) {
        return null;
    }

    return new StringBuilder(input).reverse().toString();
}
