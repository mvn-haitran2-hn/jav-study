package bai4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        choose();
    }

    static void choose() {
        boolean condition = true;
        List<News> list = new ArrayList();
        do {
            System.out.println("1 – Insert news");
            System.out.println("2 – View list news");
            System.out.println("3 – Average rate");
            System.out.println("4 – Exit ");
            System.out.println("chọn");
            Scanner choose = new Scanner(System.in);
            switch (choose.nextInt()) {
                case 1:
                    list.add(case1());
                    break;
                case 2:
                    case2(list);
                    break;
                case 3:
                    case3(list);
                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    break;
            }
        } while (condition);
    }

    private static News case1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập title");
        String title = in.next();
        System.out.println("Nhập publishDate");
        String publishDate = in.next();
        System.out.println("Nhập author");
        String author = in.next();
        System.out.println("Nhập content");
        String content = in.next();

        System.out.println("Nhập 3 số");
        int[] rateList = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};

        News hello = new News(title, publishDate, author, content, rateList);
        return hello;
    }

    private static void case2(List<News> list) {
        for (News i : list) {
            System.out.println("News: ");
            i.display();
            System.out.println("===================");
        }
    }

    private static void case3(List<News> list) {
        for (News i : list) {
            System.out.println("News: ");
            i.calculate();
            i.display();
            System.out.println("===================");
        }
    }
}

interface INews {
    public default void display() {
    }
}

class News implements INews {
    private int id;
    private String title, publishDate, author, content;

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    int[] rateList = new int[3];
    private float averageRate;

    News(String title, String publishDate, String author, String content, int[] rateList) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rateList = rateList;
    }

    public void display() {
        System.out.println("title: " + this.title);
        System.out.println("publishDate: " + this.publishDate);
        System.out.println("author: " + this.author);
        System.out.println("content: " + this.content);
        System.out.println("averageRate: " + this.averageRate);
    }

    public void calculate() {
        int sum = 0;
        for (int i : this.rateList) {
            sum = sum + i;
        }
        this.averageRate = sum / this.rateList.length;
    }
}