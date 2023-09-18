//получаем из List поток целых чисел и помещаем нечётные в начало, а чётные в конец нового List
// https://ru.hexlet.io/challenges/s_basic_algorithms_in_place_sorting_exercise/  
public static List<Integer> run(List<Integer> list) {

        List<Integer> result = new ArrayList<>();
        list.stream()
                .forEach(x -> {
                    if (x % 2 == 0) {
                        result.add(x);
                    } else {
                        result.add(0, x);
                    }
                });
        return result;
    }
