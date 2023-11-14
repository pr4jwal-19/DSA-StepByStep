package com.collectionframework.ArrayListCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx3 {
    public static void main(String[] args) {
        List<Integer> ls= new ArrayList<>();
        ls.add(2);
        ls.add(122);
        ls.add(23);
        ls.add(21);
        ls.add(28);
        ls.add(32);
        ls.add(1);
        Collections.sort(ls);
        System.out.println("Ascending order: "+ls);
        Collections.reverse(ls);
        System.out.println("Descending order: "+ls);
        // Custom sorting
        List<Employee> emp= new ArrayList<>();
        emp.add(new Employee(1,"Prajwal",20,89000));
        emp.add(new Employee(2,"Tejas",21,99000));
        emp.add(new Employee(3,"Aditya",19,77000));
        emp.add(new Employee(4,"Atharva",20,59000));
        emp.add(new Employee(5,"Nikhil",22,129000));
        //Comparator interface
        emp.sort(new MySortMethod());
        System.out.println("Increasing Salary: "+emp);
        emp.sort(new MyDSortMethod());
        System.out.println("Decreasing Salary: "+emp);
        //Anonymous implementation
        emp.sort(new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println(emp);
        //lambda exp
        emp.sort((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        System.out.println(emp);
        //sort by name
        emp.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getName().compareTo(o2.getName()));
            }
        });
        System.out.println("Sort by Name(Asc): "+emp);
        emp.sort((o1,o2) -> (int)(o2.getName().compareTo(o1.getName())));
        System.out.println("Descending sort by name: "+emp);
    }
}

class MySortMethod implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
class MyDSortMethod implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}
