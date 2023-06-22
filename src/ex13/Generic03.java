package ex13;

class Data<T> {
    int status;
    T body;
}

public class Generic03 {

    Data<?> getNum(int check) { // ?는 와일드 카드이다. 뭐든지 가능하단 말.
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else {

            Data<Integer> data = new Data<>();
            return data;
        }
    }

    object getNum2(int check) {

        if (check == 1) {
            return "안녕";
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        int n = (int) g3.getNum2(1);
        Data<?> d = g3.getNum(1);
    }
}
