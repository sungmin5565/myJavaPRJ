class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit extends Rabbit {
    String owner;
    void eatFeed() {
        System.out.println("잡토끼가 사료를 먹습니다");
    }
}

class MountainRabbit extends Rabbit {
    String mountain;
    void eatwildglass() {
        System.out.println("산토끼가 풀을 먹습니다");
    }
}

public class Code08_02 {
    public static void main(String[] args) {

    }
}
