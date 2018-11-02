package csgo.gun;

//步枪
public class Rifle extends Gun {
    public Rifle(String name,int price,int damage){
        this.name=name;
        this.price=price;
        this.damage=damage;
        this.type="步枪";
    }

    @Override
    public void attack() {
        System.out.println("哒哒哒哒哒");
    }
}
