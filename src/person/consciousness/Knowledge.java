package person.consciousness;

public class Knowledge {
    private int Level;

    public Knowledge(int level) {
        //TODO: Implementation is needed
        Level = setLevel(level);
    }

    public int getLevel(){
        return Level;
    }

    public int setLevel(int level){
        if(level < 0)
            return 0;
        else if(Level > 5)
            return 5;
        else
            return level;
    }

}
