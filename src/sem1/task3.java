package sem1;
//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//    Метод должен пройтись по каждому элементу и проверить что он не равен null.
//    А теперь реализуйте следующую логику:
//    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
public class task3 {
        public static void main(String[] args) {
            Integer [] mass = {5,0,15,null,4,11,null,78};
            find(mass);
        }
        public static void find(Integer[] arr){
            StringBuilder out = new StringBuilder();
            for (int i=0; i<arr.length; i++){
                if (arr[i] == null){
                    out.append(i).append(" ");
                }
            }
            if (out.length() > 0){
                throw new RuntimeException("В массиве присутствуют пустые значения на позиции: "+out);
            }
        }
    }

