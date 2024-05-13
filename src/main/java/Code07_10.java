class Rabbit3{
    String shape;
    int xPos;
    int yPos;
}
    Rabbit3(){
        this.shape = "토끼";
    }

    void setPosition(int x,int y) {
    this.xpos = x;
    this.ypos = y;
    }
}
publie class Code07_10{
    public static void main(String[] args){
        Rabbit3 rabbit = new Rabbit3();

        System.out.println("토끼 객체의 기본 모영은 [%s]입니다", rabbit.shape);
    }
}
