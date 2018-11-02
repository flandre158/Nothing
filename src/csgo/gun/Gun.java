package csgo.gun;

//枪的抽象类
public abstract class Gun {
    protected String name;
    protected int price;
    protected int damage;
    protected String type;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public abstract void attack();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Gun){
            if(((Gun) obj).getName().equals(this.name)){
                return true;
            }
        }
        return true;
    }
}
