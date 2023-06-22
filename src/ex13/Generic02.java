package ex13;

class 윤석열 {
    private Object data;
    private static 윤석열 instance = new 윤석열();

    public static 윤석열 getInstance() {
        return instance;
    }

    private 윤석열() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        윤석열 d1 = 윤석열.getInstance();
        d1.setData(1);

        int value = (int) d1.getData();
        System.out.println(value);
    }
}