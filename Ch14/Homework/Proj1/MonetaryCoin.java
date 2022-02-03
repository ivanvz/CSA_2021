package Ch14.Homework.Proj1;

import Coin.CoinP2;

public class MonetaryCoin extends CoinP2 {
    int passValue;

    public MonetaryCoin(int passValue){
        this.passValue = passValue;
    }

    public int getPassValue(){
        return passValue;
    }
}
