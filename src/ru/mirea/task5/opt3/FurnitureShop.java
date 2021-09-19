package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String args[]){
        Furniture chair = new Chair("plastic","Sweden", 200);
        Furniture sofa=new Sofa("wood","Russia",1000);
        Furniture locker=new Locker("wood","Italy",500);

        chair.sellOut();
        sofa.sellOut();
        locker.sellOut();

        ((Chair)chair).sit();
        ((Sofa)sofa).lie();
        ((Locker)locker).hangUp();

    }
}
