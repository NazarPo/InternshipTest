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

    private void setLevel(int level){
        if(level < 0)
            Level = 0;
        else if(level > 5)
            Level = 5;
        else
            Level = level;
    }

}
