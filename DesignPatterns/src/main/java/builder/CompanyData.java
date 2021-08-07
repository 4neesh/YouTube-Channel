package builder;

import lombok.Builder;

@Builder
public class CompanyData {

    private String ticker;
    private double open;
    private double high;
    private double low;
    private int marketCap;
    private double priceEarningsRatio;
    private double previousClose;
    private double yearHigh;
    private double yearLow;
    private double fiveDayHigh;
    private double fiveDayLow;

    public CompanyData(String ticker, double open, double high, double low, int marketCap, double priceEarningsRatio, double previousClose, double yearHigh, double yearLow, double fiveDayHigh, double fiveDayLow) {
        this.ticker = ticker;
        this.open = open;
        this.high = high;
        this.low = low;
        this.marketCap = marketCap;
        this.priceEarningsRatio = priceEarningsRatio;
        this.previousClose = previousClose;
        this.yearHigh = yearHigh;
        this.yearLow = yearLow;
        this.fiveDayHigh = fiveDayHigh;
        this.fiveDayLow = fiveDayLow;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    public double getPriceEarningsRatio() {
        return priceEarningsRatio;
    }

    public void setPriceEarningsRatio(double priceEarningsRatio) {
        this.priceEarningsRatio = priceEarningsRatio;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
    }

    public double getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(double yearHigh) {
        this.yearHigh = yearHigh;
    }

    public double getYearLow() {
        return yearLow;
    }

    public void setYearLow(double yearLow) {
        this.yearLow = yearLow;
    }

    public double getFiveDayHigh() {
        return fiveDayHigh;
    }

    public void setFiveDayHigh(double fiveDayHigh) {
        this.fiveDayHigh = fiveDayHigh;
    }

    public double getFiveDayLow() {
        return fiveDayLow;
    }

    public void setFiveDayLow(double fiveDayLow) {
        this.fiveDayLow = fiveDayLow;
    }
}
