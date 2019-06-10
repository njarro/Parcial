/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author njarro
 */
public class MutualFund extends ShareAsset implements Asset{
    protected double totalShares;

    public MutualFund(double totalShares, String symbol, double totalCost, double CurrentPrice) {
        super(symbol, totalCost, CurrentPrice);
        this.totalShares = totalShares;
    }
    @Override
    public double getMarketValue(){
        double MarketValue=this.totalShares*this.CurrentPrice;
        return MarketValue;
    }
    @Override
    public double getProfit(){
    double Profit=((totalShares)*(CurrentPrice))-(totalCost);
    return Profit;
}
}
