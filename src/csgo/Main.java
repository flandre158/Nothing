package csgo;

import csgo.gun.Gun;
import csgo.gun.Pistol;
import csgo.gun.Rifle;
import csgo.gun.SubmachineGun;

public class Main {
    public static void main(String[] args) {
        //创建一个商店
        GunShop shop = new GunShop();
        Gun desertEagle = new Pistol("沙漠之鹰",700,63);
        Gun p90 = new SubmachineGun("P90",2350,26);
        Gun ak47 = new Rifle("ak47",2700,36);

        shop.addGun(desertEagle);
        shop.addGun(p90);
        shop.addGun(ak47);

        //创建一个玩家
        Player mashiroc = new Player("mashiroc",shop);

        //买枪
        mashiroc.buyGun("沙漠之鹰");
        mashiroc.buyGun("ak47");

        //Rush B
        mashiroc.attack("沙漠之鹰");
        mashiroc.attack("ak47");
    }
}
