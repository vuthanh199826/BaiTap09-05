package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        int[] array = {};
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Nhập mảng có kích thước N (0<N<100)");
            System.out.println("2. Hiển thị mảng vừa nhập");
            System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
            System.out.println("4. Liệt kê danh sách các số chẵn trong mảng");
            System.out.println("5. Tính tổng các số chẵn trong mảng");
            System.out.println("6. Chèn giá trị vào mảng");
            System.out.println("7. Xóa phần tử khỏi mảng");
            System.out.println("8. Đảo ngược phần tử ban đầu");
            System.out.println("9. Hiển thị danh sách số nguyên tố trong mảng");
            System.out.println("10. Sắp xếp mảng theo thứ tự giảm dần");
            System.out.println("11. Thoát");
            System.out.println();
            System.out.println("Nhập lựa chọn vào đây: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn mảng có bao nhiêu phần tử ??? ");
                    int size = sc.nextInt();
                    if (size > 0 && size < 100) {
                        array = new int[size];
                        for (int i = 0; i < array.length; i++) {
                            System.out.println("Nhập phần tử thứ " + i + " vào đây ");
                            array[i] = sc.nextInt();
                        }
                    } else {
                        System.out.println("Mảng phải có kích thước trong khoảng 0 - 100");
                    }
                    break;
                case 2:
                    display(array);
                    break;
                case 3:
                    max(array);
                    break;
                case 4:
                    evenList(array);
                    break;
                case 5:
                    evenSum(array);
                    break;
                case 6:
                    add(array);
                    break;
                case 7:
                    delete(array);
                    break;
                case 8:
                    reversed(array);
                    break;
                case 9:
                    displayPrimeList(array);
                    break;
                case 10:
                    sort(array);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhập lại");
            }
        }
    }


    //public static void create(int[] array){
//    Scanner sc = new Scanner(System.in);
//}
    public static void display(int[] array) {
        if (array.length > 0 && array.length < 100) {
            System.out.println("Danh sách các phần tử của mảng: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void max(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
            int[] arr1 = new int[count];
            int count1 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr1[count1] = arr[i];
                    count1++;
                }
            }
            int max = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                if (arr1[i] > max) {
                    max = arr1[i];
                }
            }
            System.out.println("Giá trị chẵn lớn nhất của mảng là : " + max);
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void evenList(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            System.out.println("Danh sách các phần tử chẵn: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void evenSum(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
            }
            System.out.println("Tổng các phần tử chẵn của mảng là: " + sum);
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void add(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập giá trị cần chèn vào đây");
            int value = sc.nextInt();
            System.out.println("Bạn muốn chèn vào vị trí thứ bao nhiêu ?");
            int index = sc.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("Vị trí nằm ngoài mảng, không chèn được");
            } else {
                arr[index] = value;
                display(arr);
            }
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void delete(int[] arr) {
        Scanner sc = new Scanner(System.in);
        if (arr.length > 0 && arr.length < 100) {
            System.out.println("Bạn muốn xóa những phần tử có giá trị bao nhiêu ?");
            int value = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    arr[i] = 0;
                }
            }
            display(arr);
        } else {
            System.out.println("(ERROR)<<<<< Mảng chưa có phần tử,vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void reversed(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            display(arr);
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static boolean check(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void displayPrimeList(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            System.out.println("Danh sách các số nguyên tố có trong mảng :");
            for (int i = 0; i < arr.length; i++) {
                if (check(arr[i])) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }

    public static void sort(int[] arr) {
        if (arr.length > 0 && arr.length < 100) {
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i + 1; j < arr.length ; j++) {
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            display(arr);
        } else {
            System.out.println("(ERROR)<<<<< Vui lòng tạo mảng tại Option1 >>>>>(ERROR)");
        }
    }
}
