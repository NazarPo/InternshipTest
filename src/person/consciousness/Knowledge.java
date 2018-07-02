package person.consciousness;

public class Knowledge {
    private double Level;

    public Knowledge(double level) {
        //TODO: Implementation is needed
        setLevel(level);
    }

    public double getLevel(){
        return Level;
    }

    private void setLevel(double level){
        if(level < 0)
            Level = 0;
        else if(level > 100)
            Level = 100;
        else
            Level = level;
    }

}
