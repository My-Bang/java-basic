package day10;

import day10.dto.BookDTO;

import java.util.Scanner;

public class InputBookSc {
    static final Scanner in = new Scanner(System.in);


    public BookDTO inputObject(BookDTO book){
        System.out.print("책 제목 입력: ");
        book.title = in.nextLine();

        System.out.print("책 가격 입력: ");
        book.price = in.nextInt();
        in.nextLine();

        System.out.print("출판사 입력: ");
        book.company = in.nextLine();

        System.out.print("저자 입력: ");
        book.author = in.nextLine();

        System.out.print("페이지 입력: ");
        book.page = in.nextInt();
        in.nextLine();

        System.out.print("isbn 입력: ");
        book.isbn = in.nextLine();
        return book;
    }
}
