package com.illusion.list_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Exercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 400, "曹雪芹"));
        list.add(new Book("三国演", 200, "罗贯中"));
        list.add(new Book("西游记", 500, "吴承恩"));
        System.out.println(list.get(1));; //listget(1)相当于 Object ? = new Book(..);
        sort(list);
        for(Object o : list) {
            System.out.println(o);
        }
    }
    public static void sort(List list) {
        int ListSize = list.size();
        for (int i = 0; i < ListSize - 1; i++) {
            for (int j = 0; j < ListSize - 1 - i; j++) {
                //取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}


class Book{
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称:" + name + "   价格:" + price + "   作者: " + author;
    }
}
