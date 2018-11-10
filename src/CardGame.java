import java.util.Arrays;
import java.util.Random;

//主类
public class CardGame {
    public static void main(String[] args) {
        System.out.println("欢迎来到Dio洋馆,一场竞技即将开始!");
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName("Pad长");
        player2.setName("Dio");
        Draw draw = new Draw(4);
        player1.setHandCard(draw.card1);
        player2.setHandCard(draw.card2);
        System.out.println(player1.getName() + "的牌:" + Arrays.toString(player1.getHandCard()));
        System.out.println(player2.getName() + "的牌:" + Arrays.toString(player2.getHandCard()));
    }
}

//玩家
class Player {
    private String name;                                  //玩家名称
    private String handCard[] = new String[27];           //总手牌数

    public void setName(String name) {
        this.name = name;
        System.out.println("现在登场的选手是:" + name + "!");
    }

    public String getName() {
        return name;
    }

    public void setHandCard(String[] handCard) {
        this.handCard = handCard;
    }

    public String[] getHandCard() {
        return handCard;
    }
}

//卡牌属性
class Poker {
    static final int POKER_AMOUNT = 54;                                                                             //一套卡的数量
    static final String[] POKER_COUNT = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};      //点数,
    static final String[] POKER_SUIT = {"♠", "♥", "♣", "♦"};                          //花色
    static final String[] POKER_EXTRA_CARD = {"colorJoker", "blackJoker"};             //王牌
    static final String[] POKER = new String[54];                                      //空的卡组
}

//新卡组
class NewCard {
    public NewCard() {
        System.out.println("现在由发牌员取出一套新卡。");
        for (int i = 0; i < Poker.POKER_SUIT.length; i++) {
            for (int j = 0; j < Poker.POKER_COUNT.length; j++) {
                Poker.POKER[i * 13 + j] = Poker.POKER_SUIT[i] + Poker.POKER_COUNT[j];
            }
        }                                                                              //存入52张基本牌
        for (int i = 52; i < Poker.POKER_AMOUNT; i++) {
            Poker.POKER[i] = Poker.POKER_EXTRA_CARD[i - 52];
        }                                                                              //存入2张王牌
    }
}

//洗牌
class Shuffle {
    String[] poker = new String[54];
    String[] poker1 = new String[54];

    public Shuffle() {
        System.out.println("发牌员开始天花乱坠地洗牌。");
        Random r1 = new Random();
        int x;
        a:
        for (int i = 0; i < Poker.POKER_AMOUNT; i++) {
            x = r1.nextInt(54);
            for (int j = 0; j < i; j++) {
                if (poker1[j] == Poker.POKER[x]) {
                    i--;
                    continue a;
                }
            }
            poker[i] = Poker.POKER[x];
            poker1[i] = Poker.POKER[x];
        }
        System.out.println("--------洗牌结束--------");
    }
}

//抽牌
class Draw {
    NewCard newCard = new NewCard();
    Shuffle shuffle = new Shuffle();
    public static String[] card1 = new String[27];
    public static String[] card2 = new String[27];
    int i = 0;        //记录牌总发数
    int x1 = 0;       //一号玩家卡组下标
    int x2 = 0;       //二号玩家卡组下标

    public Draw(int amount) {                                                   //amount为单次抽牌数
        while (i < Poker.POKER_AMOUNT) {
            for (int j = 0; j < amount; j++) {
                card1[x1] = shuffle.poker[i];
                x1++;
                i++;
            }
            for (int j = 0; j < amount; j++) {
                card2[x2] = shuffle.poker[i];
                x2++;
                i++;
            }
            if ((54 - i) < amount * 2) {                      //如果牌不够抽就平分
                for (int j = x1; j < 27; j++) {
                    card1[x1] = shuffle.poker[i];
                    x1++;
                    i++;
                }
                for (int j = x2; j < 27; j++) {
                    card2[x2] = shuffle.poker[i];
                    x2++;
                    i++;
                }
            }
        }
    }
}