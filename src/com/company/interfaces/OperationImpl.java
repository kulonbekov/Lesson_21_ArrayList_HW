package com.company.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OperationImpl implements Operation{

    @Override
    public void getMax(Collection<Integer> list100) {
        System.out.println("Максимальное число: " + Collections.max(list100)); // Максимальное число
    }
    @Override
    public void getMin(Collection<Integer> list100) {
        System.out.println("Минимальное число: " + Collections.min(list100)); // Минимальное число
    }
    @Override
    public void getFrequent(Collection<Integer> list100) { //Найти число, которое чаще всего повторяется
        int num = 0;
        int maxFrequent = 0;
        for (int i: list100){
            int count = 0;
            count = Collections.frequency(list100,i);
            if (count > maxFrequent){
                maxFrequent = count;
                num = i;
            }
        }
        System.out.println("Какое число чаще всего встречается в ArrayList: " + num);
        System.out.println("Сколько раз встречается: " + Collections.frequency(list100, num));
    }

    @Override
    public void getArray(Collection<Integer> list100) { //Вывод списка
        for (int i: list100) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void findNumber(Collection<Integer> list100) {
        System.out.println("Сколько раз повторяется число '5': " + Collections.frequency(list100, 5));
        System.out.println("Сколько раз повторяется число '7': " + Collections.frequency(list100, 7));
    }

    @Override
    public void getShuffle(ArrayList<Integer> arrayList) { //Перемешивать, пока не будет отсортирован по возрастанию
        boolean status = false;
        int countShuffle = 0;
        int count = 0;
        while (!status){
            Collections.shuffle(arrayList);
            count = 0;
            for (int i = 0; i < arrayList.size()-1; i++) {
                if(arrayList.get(i) < arrayList.get(i+1)){
                    count++;
                }
            }
            if(arrayList.size() == count+1){
                status = true;
            }else{
                status = false;
                countShuffle++;
            }
        }
        System.out.println(countShuffle + " раз был перемещен список, пока не отсартировался по возрастанию");


    }



    @Override
    public void getUniqueList(ArrayList<Integer> arrayList) { //Проверить с какой попытки у вас получится создать списки с уникальными значениями
        boolean status = false;
        int addElements = 0;
        while (!status){
            int count = 0;
            for (int i = 0; i < 10; i++) {
                arrayList.add((int) (( Math.random() * (100-1) ) + 1)); // Создания списка из 5 рандомных чисел
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if(Collections.frequency(arrayList, arrayList.get(i)) == 1){
                    count++;
                }else if(Collections.frequency(arrayList, arrayList.get(i)) > 1){
                    break;
                }
            }
            if(arrayList.size() == count){
                status = true;
            }else {
                status = false;
                addElements++;
                arrayList.clear(); //удаляется все элементы
            }
        }
        System.out.println(addElements + " раз был создан список, пока значения списка не стали уникальными");
    }
    @Override
    public void addElementsArray100(ArrayList<Integer> ArrayList) {
        for (int i = 0; i < 100; i++) {
            ArrayList.add((int) (( Math.random() * (100-1) ) + 1)); // Создания списка из 100 рандомных чисел
        }
    }

    @Override
    public void addElementsArray5(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 5; i++) {
            arrayList.add((int) (( Math.random() * (100-1) ) + 1)); // Создания списка из 5 рандомных чисел
        }
    }

}
