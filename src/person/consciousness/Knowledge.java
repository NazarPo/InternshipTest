package person.consciousness;

public class Knowledge {
    private int Level;

    public Knowledge(int level) {
        //TODO: Implementation is needed
        setLevel(level);
    }

    public int getLevel(){
        return Level;
    }

    public void setLevel(int level){
        if(level < 0)
            Level = 0;
        else if(Level > 5)
            Level = 5;
        else
            Level = level;
    }

}
