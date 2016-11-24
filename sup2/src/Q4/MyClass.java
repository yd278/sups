package Q4;

/**
 * Created by Anchor on 2016/11/24.
 */
public class MyClass {
    public void print(){
        System.out.println("Q4.MyClass");
    }
    public static void main(String args[]){
        MyClass mClass = new MySubClass();
        mClass.print();
    }
}
