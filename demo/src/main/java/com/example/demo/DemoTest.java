package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DemoTest {
    public int checkMax(int[] a){
        int length = a.length;
        int max = 0;
        for (int i =0;i< length;i++){
            for (int j = i;j<length;j++){
                if (a[j]-a[i]>=max){
                    max = a[j] - a[i];
                }
            }
        }
        return max;
    };
    public void checkMinMax(int[] a){
        if (a.length>0) System.out.println("fail");
        else {
            Arrays.sort(a);
            System.out.println("min:"+a[0]);
            System.out.println("max:"+a[a.length-1]);
        }
    }
    public void sumNumberThere(int[] input){
        if (input.length>0) System.out.println("fail");
        else {
            HashMap<Integer,SumTwo> sumTwoHashMap = new HashMap<>();
            for (int i= 0;i<input.length-1;i++){
                for (int j = i+1; j<input.length; j++){
                    sumTwoHashMap.put(input[i]+input[j],new SumTwo(i,j));
                }
            }
            for (int i =0 ; i<input.length;i++){
                SumTwo sumTwo = sumTwoHashMap.get(input[i]);
                if (sumTwo!=null && i !=sumTwo.firth && i!=sumTwo.second ){
                    System.out.println(input[sumTwo.firth]+" "+ input[sumTwo.second]+" "+input[i]);
                }
            }
        }
    }
    // vị trị
    class SumTwo{
        int firth;
        int second;
        int three;
        public SumTwo(){}
        public SumTwo(int firth, int second) {
            this.firth = firth;
            this.second = second;
        }

        public int getFirth() {
            return firth;
        }

        public void setFirth(int firth) {
            this.firth = firth;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public int getThree() {
            return three;
        }

        public void setThree(int three) {
            this.three = three;
        }
    }
    public static void main(String[] args) {
        int sum =0;
        System.out.println((int)1/2);
        for (int n=3; n>0;n /=2)
            for (int i =0; i<n;i++)
                sum++;
        System.out.println(sum);
    }
}
