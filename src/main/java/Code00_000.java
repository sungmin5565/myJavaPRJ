class sasin {
    int hp;
    String item;

    void setchampion(int hp, String item) {
        this.hp = hp;
        this.item = item;
    }
}

class yone extends sasin{
    @Override
    void setchampion(int hp, String item) {
        super.setchampion(hp, item);
        this.item = "찬란한 "+item;


    }
}


public class Code00_000 {
    public static void main(String[] args) {
        yone yaso = new yone();
        yaso.setchampion(1000,"거인의 결의");
        System.out.println(yaso.hp + yaso.item);
    }
}
// Scanner s = new Scanner