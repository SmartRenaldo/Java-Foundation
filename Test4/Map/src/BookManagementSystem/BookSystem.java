package BookManagementSystem;

import java.util.*;

public class BookSystem {
    public static final Map<String, List<Book>> BOOK_SYSTEM_MAP = new HashMap<>();
    public static final Scanner SYS_SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //展示操作页面，独立功能封装成方法，方便相互之间的逻辑调用
        showCommand();
    }

    private static void showCommand() {
        System.out.println("--------------Welcome to the book management system--------------");
        System.out.println("(1). query all books");
        System.out.println("(2). add a book");
        System.out.println("(3). delete a book");
        System.out.println("(4). update information of a book");
        System.out.println("(5). exit program");
        System.out.println("Please choose among '1', '2', '3', '4' and '5'");
        String s = SYS_SCANNER.next();
        switch (s) {
            case "1" -> queryBooks();
            case "2" -> addBook();
            case "3" -> DeleteBook();
            case "4" -> updateBook();
            case "5" -> {
                System.out.println("Program exit. Looking forward to your next use.");
                System.exit(0);
            }
            default -> System.out.println("Wrong input! Please enter again");
        }
        showCommand();
    }

    private static void DeleteBook() {
        SYS_SCANNER.nextLine();
        if (BOOK_SYSTEM_MAP.isEmpty()) {
            System.out.println("There is no column! Please confirm!");
        } else {
            queryBooks();
            System.out.println("--------------Welcome to the book deleting business--------------");
            while (true) {
                System.out.print("Please enter the column: ");
                String column = SYS_SCANNER.nextLine();
                if (BOOK_SYSTEM_MAP.containsKey(column)) {
                    List<Book> books = BOOK_SYSTEM_MAP.get(column);
                    if (books.size() != 0) {
                        while (true) {
                            System.out.print("Please enter the title: ");
                            String title = SYS_SCANNER.nextLine();
                            Book book = getBookByColumnAndTitle(column, title);
                            if (book == null) {
                                System.out.println("The title your entered does not exit! Please confirm");
                            } else {
                                books.remove(book);
                                System.out.println("Delete successfully. Please check");
                                queryBooks();
                                return;
                            }
                        }
                    } else {
                        System.out.println("No books exit! Deletion failed");
                    }
                } else {
                    System.out.println("The column your entered does not exit! Please confirm");
                }
            }
        }
        System.out.println();
    }

    private static void updateBook() {
        queryBooks();
        if (!BOOK_SYSTEM_MAP.isEmpty()) {
            System.out.println("--------------Welcome to the book update business--------------");
            while (true) {
                System.out.print("Please enter the column: ");
                String column = SYS_SCANNER.nextLine();
                if (BOOK_SYSTEM_MAP.containsKey(column)) {
                    System.out.print("Please enter the book name you want to update: ");
                    String title = SYS_SCANNER.nextLine();
                    Book book = getBookByColumnAndTitle(column, title);
                    if (book == null) {
                        System.out.println("The title your entered does not exit! Please confirm");
                    } else {
                        System.out.print("Please update the book's name: ");
                        String updatedName = SYS_SCANNER.nextLine();
                        double updatedPrice = 0;
                        System.out.print("Please update the book's price: ");
                        while (true) {
                            if (SYS_SCANNER.hasNextDouble()) {
                                updatedPrice = SYS_SCANNER.nextDouble();
                                SYS_SCANNER.nextLine();
                                break;
                            } else {
                                System.out.println("You should enter a double! Please enter again!");
                            }
                        }
                        System.out.print("Please update the book's author: ");
                        String updatedAuthor = SYS_SCANNER.nextLine();
                        book.setName(updatedName);
                        book.setPrice(updatedPrice);
                        book.setAuthor(updatedAuthor);
                        System.out.println("Successfully updated the book " + updatedName + ". Please confirm\n");
                        queryBooks();
                        break;      //退出方法
                    }
                } else {
                    System.out.println("The column your entered does not exit! Please confirm");
                }
            }
        }
    }

    private static Book getBookByColumnAndTitle(String column, String title) {
        List<Book> books = BOOK_SYSTEM_MAP.get(column);
        for (Book book : books) {
            if (book.getName().equals(title)) {
                return book;
            }
        }
        return null;
    }

    private static void queryBooks() {
        SYS_SCANNER.nextLine();
        if (BOOK_SYSTEM_MAP.isEmpty()) {
            System.out.println("There are no books!");
        } else {
            //%-10s:左对齐
            //%10s:右对齐
            System.out.printf("%-20s%-20s%-20s%-20s\n", "Column", "Name", "Price", "Author");
            BOOK_SYSTEM_MAP.forEach((column, books) -> {
                System.out.println(column);
                for (Book book : books) {
                    System.out.printf("%-20s%-20s%-20s%-20s\n", "", book.getName(), book.getPrice(), book.getAuthor());
                }
            });
        }
        System.out.println();
    }

    private static void addBook() {
        SYS_SCANNER.nextLine();
        System.out.print("Please input book column: ");
        String column = SYS_SCANNER.nextLine();
        //判断是否存在该栏目

        List<Book> books;
        System.out.print("Please enter the book's name: ");
        String name = SYS_SCANNER.nextLine();
        System.out.print("PLease enter the book's price: ");
        String price = SYS_SCANNER.nextLine();
        System.out.print("PLease enter the book's author: ");
        String author = SYS_SCANNER.nextLine();
        if (BOOK_SYSTEM_MAP.containsKey(column)) {
            //存在该栏目
            books = BOOK_SYSTEM_MAP.get(column);
            books.add(new Book(name, Double.parseDouble(price), author));
        } else {
            //该栏目是第一次添加
            books = new ArrayList<>();
            books.add(new Book(name, Double.parseDouble(price), author));
            BOOK_SYSTEM_MAP.put(column, books);
        }
        System.out.println("THe book " + name + " your added is successful in " + column + "\n");
    }
}