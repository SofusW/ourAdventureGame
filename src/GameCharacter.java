import java.util.ArrayList;

public interface GameCharacter {
}


class userCharacter implements GameCharacter {

    public int Health(){
        return 0;
    }

    public int attackPower(){
        return 0;
    }

    public void name(){

    }

    public void Attack(){

    }


    public boolean alive(){
        return false;
    }


    ArrayList<Item> items;

    

}