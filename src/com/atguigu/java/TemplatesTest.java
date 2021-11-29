package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author adld
 * @date 2021/11/29 - 7:44
 */
public class TemplatesTest {
    private static final Customer cust = new Customer();
    public static final int NUM = 1;
    public static final int  = 2;
    public static final String NATION = "china";
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        String[] arr = new String[]{"Tom","Jerry","Lilei","HanMeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String k = arr[i];
            System.out.println(k);
        }

        ArrayList list = new ArrayList();
        list.add(e, 123);
        list.add(e, 345);
        list.add(e, 567);
        for (Object o : list) {

        }

        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(1, 123);
        list.add(2, 345);
        list.add(3, 567);
        if (list == null) {

        }

        if (list != null) {

        }
    }
}
