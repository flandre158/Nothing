package csgo.gun;

//手枪
public class Pistol extends Gun {
    public Pistol(String name,int price,int damage){
        this.name=name;
        this.price=price;
        this.damage=damage;
        this.type="手枪";
    }


    @Override
    public void attack() {
        System.out.println("咚咚咚咚咚");
    }
}
