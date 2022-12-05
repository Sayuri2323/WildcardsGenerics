package it.develop.wildcardsGenerics2;

public class GenericClass <T>{
    private  T t;

    public T getT(){
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public static boolean isEqual(GenericClass gc1, GenericClass gc2){
        gc1.getT();
        gc2.getT();
        return gc1.equals(gc2);
    }
}
