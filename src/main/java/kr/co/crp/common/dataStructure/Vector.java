package kr.co.crp.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component @Data @Lazy
public class Vector<T> {
    private final ArrayList<T> list;

    public Vector() {
        this.list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }
    public void set(int i, T t) {
        list.set(i, t);
    }
    public void remove(T t) {
        list.remove(t);
    }
    public ArrayList<T> findAll() {
        return list;
    }
    public T get(int i) {
        return list.get(i);
    }
    public int size() {
        return list.size();
    }
    public void claer() {
        list.clear();
    }





}
