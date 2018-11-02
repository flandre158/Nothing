package csgo;

import csgo.gun.Gun;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static final int INIT_MONEY=16000;
    private String name;
    private int money;
    private List<Gun> myGuns;
    private GunShop shop;

    public Player(String name,GunShop shop){
        this.name=name;
        this.shop=shop;
        this.money=INIT_MONEY;
        myGuns=new ArrayList<>();
    }

    public void buyGun(String name){
       Gun gun= shop.buy(name);
       int price = gun.getPrice();
        if(money>=price){
            money=money-price;
            myGuns.add(gun);
            System.out.println("购买成功！");
        }
    }

    public void attack(String name){
        for(int i=0;i<myGuns.size();i++){
            Gun gun = myGuns.get(i);
            if(name.equals(gun.getName())){
                gun.attack();
            }
        }
    }
}
