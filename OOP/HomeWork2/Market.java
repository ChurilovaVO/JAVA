package SEMINAR.OOP.HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour,MarketBehaviour{

    private List <Actor> listActors;

    public Market(){
        this.listActors=new ArrayList<Actor>();
    }
    //MarketBehaviour
    @Override
    public void acceptToMarket(Actor actor) {
        listActors.add(actor);
        System.out.println(actor.name+" пришел в магазин");
    }

    @Override
    public void releaseFromMarket(Actor actors) {
        actors.isMakeOrder=false;
        actors.isTakeOrder=false;
        System.out.println(actors.name+" покинул магазин");
    }


    @Override
    public void update() {
        System.out.println("------СОСТОЯНИЕ ОЧЕРЕДИ:-----");
        if (listActors.size()!=0){
            System.out.println("Количество людей в очереди: " + listActors.size());
            for (Actor actor:listActors) {
                if (actor.isMakeOrder && !actor.isTakeOrder){System.out.println("Заказ " +actor.name+ " в работе");}
                if (actor.isMakeOrder && actor.isTakeOrder){System.out.println("Заказ " +actor.name+ " выдан");}
                if (!actor.isMakeOrder && !actor.isTakeOrder){System.out.println(actor.name+" еще не сделал заказ");}
                }
            }
        else{System.out.println("В очереди никого нет");}
        System.out.println("-------------------");
    }
    // QueueBehaviour
    @Override
    public void takeInQueue(Actor actor) {
        if (listActors.contains(actor)){
            actor.isStatusQueue=true;
            System.out.println(actor.name+" встал в очередь");}
        else {System.out.println(actor.name+" еще не пришел в магазин!");}
    }

    @Override
    public void takeOrders(Actor actor) {
        if (listActors.contains(actor)){
            actor.isMakeOrder=true;
            System.out.println(actor.name+" сделал заказ");
        }
        else {System.out.println("Чтобы сделать заказ," + actor.name + " необходимо встать в очередь!");}
    }

    @Override
    public void giveOrders(Actor actor) {
        if (listActors.contains(actor) && actor.isMakeOrder){
            actor.isTakeOrder=true;
            actor.isStatusQueue=false;
            listActors.remove(actor);
            System.out.println(actor.name+" забрал заказ!");
        }
        else {System.out.println("Чтобы забрать заказ, необходимо его сделать!");}
    }

    @Override
    public void releaseFromQueue(Actor actor) {
        actor.isStatusQueue=false;
        System.out.println(actor.name+" покинул очередь");
    }



}
