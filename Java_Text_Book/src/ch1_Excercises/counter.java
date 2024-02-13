package ch1_Excercises;

public class counter {
private int count;
public counter() { }
public counter(int initial) {count=initial;}
public int getCount() {return count;}
public void increment() {count++;}
public void increment(int delta) {count += delta;}
public void reset() {count = 0;}
}
