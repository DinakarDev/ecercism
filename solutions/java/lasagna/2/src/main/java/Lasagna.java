public class Lasagna {

    public static final int EXPECTED_MINUTES_INOVEN = 40;
    public static final int PREPARATION_TIME_PER_LAYER = 2;

    
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_INOVEN;
    }


    public int remainingMinutesInOven(int minutes){
        return EXPECTED_MINUTES_INOVEN - minutes;
    }


    public int preparationTimeInMinutes(int layer){
        return layer*2;
    }
    


    public int totalTimeInMinutes(int layer,int minutes){
        return (layer*PREPARATION_TIME_PER_LAYER) + minutes;
    }
}
