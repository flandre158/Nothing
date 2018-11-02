class Student {
    private String stuno;
    private String name;
    private float math;
    private float english;
    private float computer;

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }

    public String getStuno() {
        return stuno;
    }

    public String getName() {
        return name;
    }

    public float getMath() {
        return math;
    }

    public float getEnglish() {
        return english;
    }

    public float getComputer() {
        return computer;
    }

    public float sum() {
        float sum = this.computer + this.math + this.english;
        return sum;
    }

    public float avg() {
        float avg = (this.computer + this.math + this.english) / 3;
        return avg;
    }

    public float max() {
        float max = this.computer > this.english ? this.computer : this.english;
        max = max > this.math ? max : this.math;
        return max;
    }

    public float min() {
        float min = this.computer < this.english ? this.computer : this.english;
        min = min < this.math ? min : this.math;
        return min;
    }

    public Student(String stuno, String name, float math, float english, float computer) {
        this.setStuno(stuno);
        this.setName(name);
        this.setMath(math);
        this.setEnglish(english);
        this.setComputer(computer);
    }
}


public class Students {
    public static void main(String[] args) {
        Student stu = new Student("1", "jojo", 100.0f, 78.0f, 50.0f);
        System.out.println("Math:" + stu.getMath());
        System.out.println("English:" + stu.getEnglish());
        System.out.println("Computer:" + stu.getComputer());
        System.out.println("Stuno:" + stu.getStuno());
        System.out.println("Name:" + stu.getName());
    }
}
