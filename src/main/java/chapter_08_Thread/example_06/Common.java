package chapter_08_Thread.example_06;

/**
 * Классы блокировок реализуют интерфейс Lock, который определяет следующие методы:
 * <p>
 * - void lock(): ожидает, пока не будет получена блокировка;
 * <p>
 * - boolean tryLock(): пытается получить блокировку, если блокировка получена,
 * то возвращает true. Если блокировка не получена, то возвращает false.
 * В отличие от метода lock() не ожидает получения блокировки, если она недоступна
 * <p>
 * - void unlock(): снимает блокировку
 * <p>
 * - Condition newCondition(): возвращает объект Condition, который связан с текущей блокировкой
 */


public class Common {
    public static void main(String[] args) {

    }

}
