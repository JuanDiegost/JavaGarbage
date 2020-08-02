package dev.juandiegost;

import dev.juandiegost.entity.Employee;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heap = memBean.getHeapMemoryUsage();
        MemoryUsage nonheap = memBean.getNonHeapMemoryUsage();

        Employee a= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        Employee b= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        Employee c= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        Employee d= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        Employee e= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        Employee f= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        Employee g= new Employee((long)1,"Employee" ,"Team ","23423","employye@mail.com");
        System.out.println("\u001B[35m" + "Memoria usada"+"\u001B[0m");
        System.out.println("\u001B[32m" + heap +"\u001B[0m");

            heap = memBean.getHeapMemoryUsage();
            nonheap = memBean.getNonHeapMemoryUsage();
            System.out.println("\u001B[35m"+"Memoria"+"\u001B[0m");
        System.out.println("\u001B[32m" + heap +"\u001B[0m");
            a = null;
            b=null;
            c=null;
        System.gc();
        System.out.println("Employees null");
        heap = memBean.getHeapMemoryUsage();
        System.out.println("\u001B[32m" + heap +"\u001B[0m");
        d=null;
        e=null;
        f=null;
        g=null;
        Runtime.getRuntime().gc();
        System.out.println("\u001B[35m"+"Employees After Garbage"+"\u001B[32m");
        System.out.println("\u001B[32m" + heap +"\u001B[32m");

    }


}
