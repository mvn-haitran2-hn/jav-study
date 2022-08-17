package OOP1.bai3;

import java.lang.reflect.Array;
import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList();
        Boolean condition = true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            switch (in.nextInt()) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    editById(list);
                    break;
                case 3:
                    delById(list);
                    break;
                case 4:
//                    list = sortGpa(list);
                    Collections.sort(list, (o1, o2) -> o1.getGpa().compareTo(o2.getGpa()));
                    break;
                case 5:
//                    list = sortName(list);
                    Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
                    break;
                case 6:
                    show(list);
                    break;
                case 0:
                    condition = false;
                    break;
                default:
                    break;
            }
        } while (condition);
    }

    private static void show(ArrayList<SinhVien> list) {
        for (SinhVien sv : list) {
            System.out.println("Id: " + sv.getId() + " - Name: " + sv.getName());
        }
    }

    private static ArrayList<SinhVien> sortName(ArrayList<SinhVien> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<SinhVien> left = new ArrayList<SinhVien>();
        ArrayList<SinhVien> right = new ArrayList<SinhVien>();
        SinhVien sv = list.get(0);
        String namePivot = sv.getName();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getName().compareTo(namePivot) < 0) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        list = mergeArraylist(sortName(left), sv, sortName(right));
        return list;
    }

    private static ArrayList<SinhVien> sortGpa(ArrayList<SinhVien> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<SinhVien> left = new ArrayList<SinhVien>();
        ArrayList<SinhVien> right = new ArrayList<SinhVien>();
        SinhVien sv = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (sv.getGpa() < list.get(i).getGpa()) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        list = mergeArraylist(sortGpa(left), sv, sortGpa(right));
        return list;
    }

    private static ArrayList<SinhVien> mergeArraylist(ArrayList<SinhVien> left, SinhVien sv, ArrayList<SinhVien> right) {
        left.add(sv);
        for (SinhVien sinhVien : right) {
            left.add(sinhVien);
        }
        return left;
    }

    private static void delById(ArrayList<SinhVien> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập id sv cần xóa");
        int id = in.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }
    }

    private static void editById(ArrayList<SinhVien> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập id sv cần sửa");
        int id = in.nextInt();

        for (int i = 0; i < list.size(); i++) {
            SinhVien sv = list.get(i);
            if (sv.getId() == id) {
                System.out.println("Nhập name");
                sv.setName(in.next());
                System.out.println("Nhập age");
                sv.setAge(in.nextInt());
                System.out.println("Nhập  address");
                sv.setAddress(in.next());
                System.out.println("Nhập gpa");
                sv.setGpa(in.nextFloat());
            }
        }
    }

    private static void addStudent(ArrayList<SinhVien> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập id");

        // yêu cầu nhập lại khi có id trùng nhau
        int id = in.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Nhập lại id");
                id = in.nextInt();
                i = 0;
            }
        }

        System.out.println("Nhập name");
        String name = in.next();
        System.out.println("Nhập age");
        int age = in.nextInt();
        System.out.println("Nhập  date");
        String date = in.next();
        System.out.println("Nhập gpa");
        float gpa = in.nextFloat();
        SinhVien sv = new SinhVien(id, name, age, date, gpa);
        list.add(sv);
    }
}
