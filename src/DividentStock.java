/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author njarro
 */
public class DividentStock extends Stock {
    protected double dividens;

    public DividentStock(double dividens, int totalShares, String symbol, double totalCost, double CurrentPrice) {
        super(totalShares, symbol, totalCost, CurrentPrice);
        this.dividens = dividens;
    }
    @Override
    public double getMarketValue(){
        double MarketValue;
        MarketValue = getMarketValue()+this.dividens;
        return MarketValue;
    }
    @Override
    public double getProfit(){
    double Profit=((totalShares)*(CurrentPrice))-(totalCost);
    return Profit;
}
}
