// узнать размер heap space
// Получение объекта Runtime
Runtime runtime = Runtime.getRuntime();
// Получение размера heap space
long totalHeapSpaceSize = runtime.totalMemory() / (1024 * 1024); // переводим в мегабайты
System.out.println("Размер heap space: " + totalHeapSpaceSize + " MB");


// отобразить время работы приложения
import static org.apache.commons.lang3.time.DurationFormatUtils.formatDuration;

long startTime = System.currentTimeMillis();

long endTime = System.currentTimeMillis();
System.out.printf("Execution time: %s %n", formatDuration(endTime - startTime, "HH:mm:ss.SSS"));
