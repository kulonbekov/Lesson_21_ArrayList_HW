package com.company;
import com.company.interfaces.Operation;
import com.company.interfaces.OperationImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Operation operation = new OperationImpl();

        System.out.println("\n 1 задание: \n");

        ArrayList<Integer> list100 = new ArrayList<>(100); // Создать список из 100 элементов от 1 до 100
        operation.addElementsArray100(list100); //Метод который добавляет в список list100 рандомные значении
        operation.getMax(list100); // Найти максимальное число
        operation.getMin(list100); // Найти минимальное число
        operation.getFrequent(list100); //Найти число, которое чаще всего повторяется
        Collections.sort(list100); // Отсортировать список
        operation.getArray(list100); //Вывод списка
        operation.findNumber(list100); //Число '5','7' сколько раз повторяется


        /////////////////////////////////////////////////////////////////////////////////////


        System.out.println("\n 2 задание: \n");

        ArrayList<Integer> list5 = new ArrayList<>(5); // Создать список из 5 элементов от 1 до 100
        ArrayList<Integer> newList5 = new ArrayList<>(Arrays.asList(0,0,0,0,0)); // новый список со значениями '0', куда будем копировать из пред списка
        operation.addElementsArray5(list5);//Метод который добавляет в список list5 рандомные значении


        Collections.copy(newList5, list5); //Копия предыдущего списка
        operation.getShuffle(newList5); //Перемешивать, пока не будет отсортирован по возрастанию

        System.out.println("Новый отсортированнын список: ");
        operation.getArray(newList5); //Новый отсортированный список


        //////////////////////////////////////////////////////////////////////////////////////


        System.out.println("\n 3 задание: \n");

        ArrayList<Integer> newList1 = new ArrayList<>(10); // Создать список из 10 элементов от 1 до 100
        ArrayList<Integer> newList2 = new ArrayList<>(10); // Создать список из 10 элементов от 1 до 100

        System.out.println("Первый список");
        operation.getUniqueList(newList1); //
        operation.getArray(newList1);

        System.out.println("Второй список");
        operation.getUniqueList(newList2);
        operation.getArray(newList2);

    }
}