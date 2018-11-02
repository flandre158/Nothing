import java.util.Scanner;

class TimePreserve {
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}

public class ChangeTime {
    public static final int MONTH[][] = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
    public static final int LEAPYEAR = 31622400;
    public static final int NONLEAPYEAR = 31536000;
    public static final int A_DAY = 86400;
    public static final int A_HOUR = 3600;
    public static final int A_MINUTE = 60;

    public static void main(String[] args) {
        toSjc();
        toTime();
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }

    public static void toSjc() {
        int year1 = 0;
        int month1 = 0;
        Scanner sc = new Scanner(System.in);
        TimePreserve Time1 = new TimePreserve();
        System.out.println("请输入格林威治时间" + "(格式为xxxx-xx-xx xx:xx:xx)");
        Time1.setTime(sc.nextLine());
        String s1[] = Time1.getTime().split("-");                                                    //分割为年日  后四位
        String s2[] = s1[s1.length - 1].split(" ");                                                   //后四位分割为日  后三位
        String s3 = s2[s2.length - 1];                                                                       //取后3位
        String s4[] = s3.split(":");                                                                  //分割后3位
        int year = Integer.parseInt(s1[0]);
        int month = Integer.parseInt(s1[1]);
        int day = Integer.parseInt(s2[0]);
        int hour = Integer.parseInt(s4[0]);
        int minute = Integer.parseInt(s4[1]);
        int second = Integer.parseInt(s4[2]);
        for (int i = 1971; i <= year; i++) {
            if (leapYear(i - 1) == true) {
                year1 += LEAPYEAR;
            } else {
                year1 += NONLEAPYEAR;
            }
        }
        if (leapYear(year) == true) {
            for (int i = 0; i < month - 1; i++) {
                month1 += MONTH[1][i] * A_DAY;
            }
        } else {
            for (int i = 0; i < month - 1; i++) {
                month1 += MONTH[0][i] * A_DAY;
            }
        }
        System.out.println(year1 + month1 + (day - 1) * A_DAY + hour * A_HOUR + minute * A_MINUTE + second);
    }

    public static void toTime() {
        int year = 1970;
        int month = 1;
        int day = 1;
        int hour = 0;
        int minute = 0;
        Scanner sc1 = new Scanner(System.in);
        TimePreserve Time2 = new TimePreserve();
        System.out.println("请输入时间戳(秒)");
        Time2.setTime(sc1.nextLine());
        int sjc = Integer.parseInt(Time2.getTime());
        while (sjc >= NONLEAPYEAR) {
            if (leapYear(year) == true && sjc >= LEAPYEAR) {
                year += 1;
                sjc -= LEAPYEAR;
            } else if (leapYear(year) == true && sjc <= LEAPYEAR) {
                break;
            } else {
                year += 1;
                sjc -= NONLEAPYEAR;
            }
        }
        if (leapYear(year) == true) {
            while (sjc >= MONTH[1][month - 1] * A_DAY) {
                sjc -= MONTH[1][month - 1] * A_DAY;
                month += 1;
            }
        } else {
            while (sjc >= MONTH[0][month - 1] * A_DAY) {
                sjc -= MONTH[0][month - 1] * A_DAY;
                month += 1;
            }
        }
        while (sjc >= A_DAY) {
            sjc -= A_DAY;
            day += 1;
        }
        while (sjc >= A_HOUR) {
            sjc -= A_HOUR;
            hour += 1;
        }
        while (sjc >= A_MINUTE) {
            sjc -= A_MINUTE;
            minute += 1;
        }
        System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + sjc);
    }
}