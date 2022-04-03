package week3.assignment1.helper;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUtil<T>  {
    List<T> list = new ArrayList<T>();
    public ArrayListUtil(){

    }
    public void insert(T t){
        list.add(t);
    }
//    public static  void main(String[] args) {
//        new Test<String>().populate("abc");
//    }
}
