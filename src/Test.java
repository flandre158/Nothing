//测试类
public class Test {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.print();
        cat cat = new cat();
        cat.print();
        pigeon pigeon = new pigeon();
        pigeon.print();
    }
}

//父类 动物类
class Animal {
    public int age;
    public String name;
    public String food;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void print() {
        System.out.println("年龄:" + getAge() + "名字:" + getName() + "食物:" + getFood());
    }
}

//子类 狗类
class dog extends Animal {
    public int age = 20;
    public String name = "dog";
    public String food = "meat";

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void print() {
        super.print();
    }
}

//子类 猫类
class cat extends Animal {
    public int age = 15;
    public String name = "cat";
    public String food = "fish";

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void print() {
        super.print();
    }
}

//子类 鸽类
class pigeon extends Animal {
    public int age = 10;
    public String name = "pigeon";
    public String food = "person's_wait";

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void print() {
        super.print();
    }
}

