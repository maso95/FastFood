package com.company.restoran;

import com.company.burgerKing.BurgerKingFactory;
import com.company.mcDonalc.McDonalcFactory;

public class FastFoodFactory {
    public BurgerKingFactory burgerKingFactory;
    public McDonalcFactory mcDonalcFactory;

    public FastFoodFactory(){
        burgerKingFactory = new BurgerKingFactory();
        mcDonalcFactory = new McDonalcFactory();
    }

   public enum FastFoodType{
      MCDONALC,BURGERKING
    }
    public FastFood creatFastFood(FastFoodType mcdonalc, FastFoodType type){
        switch (type) {
            case MCDONALC:
                return burgerKingFactory.creatBurgerKing();
            case BURGERKING:
                return mcDonalcFactory.creatMcDonalc();
        }
        return null;
    }
}
