package com.company;

import com.company.client.Student;
import com.company.client.StudentFactory;
import com.company.restoran.Client;
import com.company.restoran.FastFood;
import com.company.restoran.FastFoodFactory;

public class Main {
final static int STUDENTSCOUNT = 10;
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        FastFoodFactory fastFoodFactory =new FastFoodFactory();
        FastFood[]fastFoods={fastFoodFactory.creatFastFood(FastFoodFactory.FastFoodType.MCDONALC,
                FastFoodFactory.FastFoodType.BURGERKING)};
        Student [] students = new Student[STUDENTSCOUNT];

        for(int i = 0;i<STUDENTSCOUNT;i++){
            students[i]= studentFactory.factory();
        }

        for (Student s:students) {
         FastFood fastFood = chooseFastFood(s,fastFoods);
         if (fastFood != null)fastFood.feed(s);
        }
  }
  public  static  FastFood chooseFastFood(Client client,FastFood [] fastFoods){
   float bestMatch = 0f;
   FastFood fastFood = null;
      for (FastFood f:fastFoods){
       float match = client.getMatch(f);
       if(match>bestMatch){
           fastFood = f;
           bestMatch = match;
       }
   }
   return fastFood;
  }
}
