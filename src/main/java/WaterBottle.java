public class WaterBottle {
private int volume;

public WaterBottle(int volume){
    this.volume = volume;
}
public int getDrink(){
    return this.volume - 10;
}
public int getZeroVolume(){
    return this.volume = 0;
}

public int fillUpWater(){
    return getDrink() + 10;
}
}
