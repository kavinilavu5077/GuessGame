class player{
    int number;
    public void guess(){
        number =(int)(Math.random()*10);
    }
}
class Game{
    player p1;
    player p2;
    player p3;
    void startgame(){
        p1 = new player();
        p2 = new player();
        p3 = new player();
        
        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int target =(int)(Math.random()*10);

        System.out.println("I am thinking of a number between 1 to 10");
        while(true){
            System.out.print("Number to be guessed "+target);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1=p1.number;
            System.out.println("Player one guess : "+ guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guess : "+ guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guess : "+guessp3);
            if(target == guessp1)
            {
                p1isright = true;
            }
            if(target == guessp2){
                p2isright = true;
            }
            if(target== guessp3){
                p3isright = true;
            }
            if(p1isright||p2isright||p3isright){
                System.out.println("We have a winner...");
                System.out.println("Player one got it right ? "+p1isright);
                System.out.println("Player two got it right ? "+p2isright);
                System.out.println("Player three got it right ? "+p3isright);
                System.out.println("Game over");
                break;
            }else{
                System.out.println("Player will have to try again");
            }
        }
    }
}

public class game {
    public static void main(String[] args) {
        Game game = new Game();
        game.startgame();
    }
}
