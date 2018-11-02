package csgo.gun;

//冲锋枪
public class SubmachineGun extends Gun {

    public SubmachineGun(String name,int price,int damage){
        this.name=name;
        this.price=price;
        this.damage=damage;
        this.type="冲锋枪";
    }

    @Override
    public void attack() {
        System.out.println("突突突突突");
    }
}
