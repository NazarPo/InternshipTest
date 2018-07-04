package person.consciousness;

public class Knowledge {
    private double Level;

    public Knowledge(double level) {
        setLevel(level);
    }

    public double getLevel(){
        return Level;
    }

    public void setLevel(double level){
        if(level < 0)
            Level = 0;
        else
            Level = level;
    }

}
