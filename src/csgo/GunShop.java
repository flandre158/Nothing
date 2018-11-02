package csgo;

import csgo.gun.Gun;

import java.util.ArrayList;
import java.util.List;

public class GunShop {
    private List<Gun> gunList;

    public GunShop(){
        gunList=new ArrayList<>();
    }

    public void addGun(Gun gun){
        gunList.add(gun);
    }

    public Gun buy(String name){
        for(int i=0;i<gunList.size();i++){
            Gun gun =gunList.get(i);
            if(gun.getName().equals(name)){
                return gun;
            }
        }
        return null;
    }


}
