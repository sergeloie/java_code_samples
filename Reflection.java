// получить список полей класса
import java.lang.reflect.Field;
import java.util.Arrays;
List<Field> allFields = Arrays.asList(ClassName.class.getDeclaredFields());
