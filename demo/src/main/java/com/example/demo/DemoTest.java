package com.example.demo;

public class DemoTest {
    public static void main(String[] args) {
        int sum =0;
        System.out.println((int)1/2);
        for (int n=3; n>0;n /=2)
            for (int i =0; i<n;i++)
                sum++;
        System.out.println(sum);
    }
}
