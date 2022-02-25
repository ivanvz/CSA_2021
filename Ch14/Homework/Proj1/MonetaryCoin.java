package Ch14.Homework.Proj1;


public class MonetaryCoin extends src.Coin.CoinP2 {
    int passValue;

    public MonetaryCoin(int passValue){
        this.passValue = passValue;
    }

    public int getPassValue(){
        return passValue;
    }
}
