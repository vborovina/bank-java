package com.bank.study.testes;

import java.util.ArrayList;
import java.util.List;

public class TesteLacoRepeticao {
    public static void main(String[] args) {
    	
    	int[] arrayNumbers = {2,3,8,6,5,2};
    	
    	int count = 6;
    	
    	List<Integer> numberList = new ArrayList<>();
    	numberList.add(2);
    	numberList.add(3);
    	numberList.add(8);
    	numberList.add(6);
    	numberList.add(5);
    	numberList.add(2);
    	
    	numberList.forEach(number ->{System.out.println(number);});
    	
    	/*for(int i = 0; i < arrayNumbers.length; i++) {
    		int number = arrayNumbers[i];
    		System.out.println(number);
    	}*/
    	
    	/*for(int number : arrayNumbers) {
    		System.out.println(number);
    	}*/
    	
    	
    	/*while(count < arrayNumbers.length) {
    		System.out.println(arrayNumbers[count]);
    		count++;
    	}*/
    	
    	/*do {
    		System.out.println("executou o do while");
    		count++;
    	}
    	while(count < arrayNumbers.length);*/
    	
    	
    	
    	
    }

}
