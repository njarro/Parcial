/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author njarro
 */
public class Cash implements Asset {
    protected double amoun;
    @Override
    public double getMarketValue(){
     return this.amoun;   
    }

    @Override
    public double getProfit() {
      return 0.0;
    }
}
