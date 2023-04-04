/*
Задача №3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г,
включительно.
 */

package Seminar3.task3;

import Seminar3.task3.BooksDataModel.BooksArray;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class task3_Books
{
    public static void main(String[] args)
    {
        BooksArray book1 = new BooksArray ("Философия Java", "Эккель", 3432, 2017, 1168);
        BooksArray book2 = new BooksArray ("Маленький принц", "Сент-Экзюпери", 200, 1943, 128);
        BooksArray book3 = new BooksArray ("Три мушкетера", "Дюма", 242, 1844, 414);
        BooksArray book4 = new BooksArray ("IntelliJ IDEA. Профессиональное програмирование на Java", "Ефимов", 950, 2014, 800);

        List<BooksArray> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);

        BigInteger bigInteger;

        for (BooksArray book : listBook) {
            bigInteger = BigInteger.valueOf(book.getNumberPages());
            if (bigInteger.isProbablePrime((int) Math.log(book.getNumberPages())) && book.getLastname().contains("а")
                    && book.getYear() >= 2010) {
                System.out.println(book.getBookName());
            }
        }
    }
}

