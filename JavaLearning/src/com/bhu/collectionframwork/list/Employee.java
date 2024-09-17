package com.bhu.collectionframwork.list;

public class Employee<str, num>{
    str name;
    num age;
    num salary;
    str Profession;
   public Employee(str Name, num Age, num Salary, str Profession ){
       this.name = Name;
       this.age = Age;
       this.salary = Salary;
       this.Profession = Profession;
   }

   public str getName(){
       return name;
   }
}
