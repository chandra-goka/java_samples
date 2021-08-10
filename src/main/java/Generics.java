///**
// * @author chan8047
// * @date 05/12/20
// */
//
//import java.util.*;
//
//public class Generics {
//}
////class Create_Gen{
////    E obj;
////    void add(E obj){this.obj=obj;}
////    E get()
////    {return obj;}
////}
////
////class Generic_Example {
////    private E obj;
////    public void add(E obj) {
////        this.obj=obj;
////    }
////    public E get() {
////        return obj;
////    }
////    public static void main(String[] args) {
////        container c1= new container();
////        container c2 = new container();
////        c1.add(new Integer(1));
////        c2.add(new String("Hello"));
////        System.out.println(c1.get());
////        System.out.println(c2.get());
////    }
////}
//
//class Generic_method {
//    public static <T> void printArr(T[] arr) {
//        for (T a : arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String args[]) {
//        Integer[] iarr = {1, 2, 3, 4, 5};
//        Character[] carr = {'H', 'E', 'L', 'L', 'O'};
//        System.out.println("Array 1");
//        printArr(iarr);
//        System.out.println("Array 2");
//        printArr(carr);
//    }
//}
//
//class Example {
//    public static void main(String args[]) {
//        Size jacketsize = new Size();
//        Jacket jacket = new Jacket();
//        jacketsize.size(jacket);
//        Size jeanssize = new Size();
//        Jeans jeans = new Jeans();
//        jeanssize.size(jeans);
//    }
//}
//
//interface Clothing {
//    void size(T sizes);
//}
//
//class Size implements Clothing {
//    public void size(T sizes) {
//        String sizesName = sizes.getClass().getName();
//        if (sizesName.equals("Jeans")) {
//            System.out.println("jeans is loose");
//        } else if (sizesName.equals("Jacket")) {
//            System.out.println("jacket fits perfect");
//        }
//    }
//}
//
//class Jeans {
//}
//
//class Jacket {
//}
