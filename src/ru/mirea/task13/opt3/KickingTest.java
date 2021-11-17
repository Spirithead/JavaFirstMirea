package ru.mirea.task13.opt3;

public class KickingTest {
    public static void main(String[] args) {
        KickingStruct<Integer> struct=new KickingStruct<>(15);
        for(int i=0;i<5;i++) struct.add(i);
        for(int i=0;i<struct.size();i++) System.out.println(struct.get(i));
        System.out.println("-------------------------");

        struct.add(100,2);
        for(int i=0;i<struct.size();i++) System.out.println(struct.get(i));
        System.out.println("-------------------------");

        struct.set(200,4);
        for(int i=0;i<struct.size();i++) System.out.println(struct.get(i));
        System.out.println("-------------------------");

        struct.resize(3);
        for(int i=0;i<struct.size();i++) System.out.println(struct.get(i));
        System.out.println("-------------------------");

        struct.delete(1);
        for(int i=0;i<struct.size();i++) System.out.println(struct.get(i));
        System.out.println("-------------------------");

        struct.clear();
    }
}
