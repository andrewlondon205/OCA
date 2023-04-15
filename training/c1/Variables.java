package c1;

public class Variables {

    private boolean bool;
    private byte v1;
    private short v2;
    private int v3;
    private long v4;
    private float v5;
    private float v6;
    private char v7;

    public int notValid() {
        int y = 10;
        int x;
        // int reply = x + y; // does not compile because x has not been initialized
        return 2;
    }

    public int valid () {
        int y = 10;
        int x;
        x = 200;
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
        //System.out.println(onlyOneBranch); does not compile because java knows "check" could be false

    }

    public static void main(String[] args) {
        Variables v = new Variables();
        System.out.println(v.v1);
        System.out.println(v.v2);
        System.out.println(v.v3);
        System.out.println(v.v4);
        System.out.println(v.v5);
        System.out.println(v.v6);
        System.out.println(v.v7);

    }

    public void eat( int piecesOfCheese) {
        int bitesOfCheese = 1;
    }


}

