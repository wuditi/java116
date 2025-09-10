package com.woniuxy;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyWays<T> {


    boolean test(T t);

}


public class Lamda {


    public static void main(String args[]) {

        List<Book> books = getBookIm();
        getBookIm().stream()
                .filter(book -> book.getTitle().equals(books.get(1).getTitle()))
                .map(book -> book.getTitle())
                .forEach(System.out::println);


//        MyWays<Book> myWays = new MyWays<Book>() {
//            @Override
//            public boolean test(Book book) {
//                return book.getPublisher().equals("11");
//            }
//        };
//        MyWays<Book> myWays = book -> book.getPublisher().equals("11");
//        MyWays<Book> myWays1 = book -> book.getTitle().endsWith("A");
//        MyWays<Book> myWays2 = (Book A) -> {
//            return A.getTitle().endsWith("A");
//        };
//        //判断型接口Predicate
//        Predicate<Book> bookPredicate = book -> book.getPublisher().equals("11");
//        Consumer<Book> bookConsumer = book -> System.out.println(book);
//       //Supplier<Book> bookSupplier =
//        Function<Integer, String> bookFunction =
//                show(books, myWays);
//        System.out.println("----------------");
//        show(books, myWays1);
//        System.out.println("----------------");
//        show(books, bookConsumer);

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        // Predicate<Integer> predicate = n -> true
//        // n 是一个参数传递到 Predicate 接口的 test 方法
//        // n 如果存在则 test 方法返回 true
//
//        System.out.println("输出所有数据:");
//
//        // 传递参数 n
//        eval(list, n -> true);
//
//        // Predicate<Integer> predicate1 = n -> n%2 == 0
//        // n 是一个参数传递到 Predicate 接口的 test 方法
//        // 如果 n%2 为 0 test 方法返回 true
//
//        System.out.println("输出所有偶数:");
//        eval(list, n -> n % 2 == 0);
//
//        // Predicate<Integer> predicate2 = n -> n > 3
//        // n 是一个参数传递到 Predicate 接口的 test 方法
//        // 如果 n 大于 3 test 方法返回 true
//
//        System.out.println("输出大于 3 的所有数字:");
//        eval(list, n -> n > 3);
//    }
//
//    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
//        for (Integer n : list) {
//
//            if (predicate.test(n)) {
//                System.out.println(n + " ");
//            }
//        }
    }

    public static void show(List<Book> book, Consumer<Book> bookConsumer) {
        for (Book book1 : book) {


            bookConsumer.accept(book1);


        }

    }

    public static List<Book> getBookIm() {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("AA", "AA", "11"));
        bookList.add(new Book("bb", "cc", "22"));
        bookList.add(new Book("AA", "AA", "55"));
        bookList.add(new Book("AA", "AA", "13"));

        return bookList;
    }


}



