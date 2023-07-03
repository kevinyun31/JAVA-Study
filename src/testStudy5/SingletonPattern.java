package testStudy5;

import javax.sound.midi.SysexMessage;

public class SingletonPattern {
    
static private SingletonPattern instance;
private int num;

private SingletonPattern(){
    num = 5;
}

public static SingletonPattern getInstance() {

if (instance == null) {
    //싱글톤 패턴
    instance = new SingletonPattern();
System.out.println("새로 생성");
}else{
System.out.println("이미 생성");
}

    return instance;
}
public int getNum() {
    return num;
}
public void setNum(int num) {
    this.num = num;
}
}
