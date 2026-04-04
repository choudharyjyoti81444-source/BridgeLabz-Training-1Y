package com.gla.Class_Practice.WrapperClass;

public class WrapperAutoboxExample {
    public static void main(String[] args) {
       int a = 10; //primitive

        Integer value = a;  //AUTOBOXING ==> MEANS CONVERTING PRIMITIVE TO OBJECT,, EXAMPLE--> int <-> Integer.
       // Integer value = Integer.valueOf(a);  // INTERNALLY CONVERSION THROUGH COMPILER
        System.out.println("Value: " +value);
        System.out.println("-------------------------------------");


        int unbox = value;   //UNBOXING ==> MEANS CONVERTING OBJECT TO PRIMITIVE,, EXAMPLE--> Integer <--> int //YHH MANUALLY HOGA
        int i3 = value.intValue();  //INTERNALLY COMPILER CONVERTING OBJECTS TO PRIMITIVE  // YHH COMPILER KR RAHA H
        System.out.println("Unboxing " +unbox);
    }
}
        // Integer.valueOf(a)  -->  YHH HAMESHA AUTOBOXING ME HOGA WOO V COMPILER KREGA
        // value.intValue()    -->  YHH HAMESHA UNBOXING ME HOGA WOO V COMPILER KREGA

   /*     double b = 20;

        // Double value = b;
        Double value = Double.valueOf(b);
        System.out.println("Value: " + value);

        System.out.println("********************************************************************");

        Double unbox = value;
        double i3 = value.doubleValue();
        System.out.println("unboxing: " +unbox);   */


 /*       short c = 25;
        Short value = c;
       // Short value = Short.valueof(c);
        System.out.println("value: " +value);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        Short unbox = value;
        short i3 = value.shortValue();
        System.out.println("unboxing: " +unbox);      */




     /*   long d = 30;
        Long value = d;
        System.out.println("value: " +value);

        System.out.println("###########################################################################");

        long unbox = value;
       // long i3 = value.longValue();
        System.out.println("unboxing: " +unbox);  */


/*       char e = 'A';
       Character value = e;
       System.out.println("Value: " +value);

       System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

       char unbox = value;
       System.out.println("unboxing: " +unbox);   */


/*        byte f = 10;
        Byte value = f;
        System.out.println("Value: " +value);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        byte unbox = value;
        System.out.println("Unboxing: " +unbox);     */


     /*   float g = 100;
        Float value = g;
        System.out.println("Value: " +value);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        float unbox = value;
        System.out.println("Unboxing: " +unbox);*/


    /*    boolean j = true;
        Boolean value = j;
        System.out.println("Value: " +value);

        System.out.println("???????????????????????????????????????????????????????????????????????????");

        boolean unbox = value;
        System.out.println("Unboxing: " +unbox);
    }
}   */