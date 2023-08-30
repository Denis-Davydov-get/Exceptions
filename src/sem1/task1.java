package sem1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
// если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// если вместо массива пришел null, метод вернет -3
// придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем.
// То есть, этот метод запросит искомое число у пользователя, вызовет первый,
// обработает возвращенное значение и покажет читаемый результат пользователю.
// Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
public class task1 {

    public static void main(String[] args) {
        int[] arr = {1,2,5,9,10,45};
        int a = 7;
        int find = 9;
        codeInfo(size(arr,a,find));
        codeInfo(size(arr,3,3));
        codeInfo(size(null,a,find));
        codeInfo(size(arr,4,find));
    }

    public static int size(int[] arr, int a, int find){
        if (arr == null){
            return -3;
        }
        if (arr.length < a){
            return -1;
        }
        for (int i=0; i<arr.length; i++ ) {
            if (arr[i]==find){
                return i;
            }
        }
        return -2;
    }
    public static void codeInfo(int a){
        if (a == -1){
            System.out.println("длина массива меньше некоторого заданного минимума");
            return;
        }
        if (a == -2){
            System.out.println("искомый элемент не найден");
            return;
        }
        if (a == -3){
            System.out.println("вместо массива пришел null");
            return;
        }
        System.out.println("Искомый элемент находится на "+a);
    }
}