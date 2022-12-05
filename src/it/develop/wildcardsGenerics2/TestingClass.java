package it.develop.wildcardsGenerics2;

public class TestingClass {
    public static void main(String[] args) {

        GenericClass<Integer> firstElement=new GenericClass<>();
        firstElement.setT(12);

        GenericClass<Integer> secondElement=new GenericClass<>();
        secondElement.setT(13);
        GenericClass<String> thirdElement=new GenericClass<>();
        thirdElement.setT("This is a string");
        GenericClass<String> fourthElement=new GenericClass<>();
        fourthElement.setT("This is a string");

        System.out.println("These are the same? "+GenericClass.isEqual(firstElement,secondElement));
        System.out.println("These are the same? "+GenericClass.isEqual(thirdElement,fourthElement));
    }
}
