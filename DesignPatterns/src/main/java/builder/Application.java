package builder;

public class Application {

    public static void main(String[] args) {

        CompanyData appleData = new CompanyData("AAPL", 146.98,147.84,146.17,243,28.8,146.95,149.15,116.36,147.92,146.10);

        CompanyData appleDataBuilder = new CompanyDataBuilder()
                                            .setTicker("APPL")
                                            .setOpen(146.98)
                                            .setHigh(147.84)
                                            .setLow(146.17)
                                            .setMarketCap(243)
                                            .setPriceEarningsRatio(28.8)
                                            .setPreviousClose(146.95)
                                            .setPreviousClose(146.15)
                                            .setYearLow(116.36)
                                            .setFiveDayHigh(147.92)
                                            .setFiveDayLow(146.10)
                                            .build();

        CompanyData appleDataBuilderLombok = CompanyData.builder()
                .fiveDayHigh(143.3)
                .ticker("APPL")
                .build();
    }
}

















//class CompanyDataBuilder {
//
//    private String ticker;
//    private double open;
//    private double high;
//    private double low;
//    private int marketCap;
//    private double priceEarningsRatio;
//    private double previousClose;
//    private double yearHigh;
//    private double yearLow;
//    private double fiveDayHigh;
//    private double fiveDayLow;
//
//    public CompanyDataBuilder setTicker(String ticker){
//        this.ticker = ticker;
//        return this;
//    }
//
//    public CompanyDataBuilder setOpen(double open) {
//        this.open = open;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setHigh(double high) {
//        this.high = high;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setLow(double low) {
//        this.low = low;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setMarketCap(int marketCap) {
//        this.marketCap = marketCap;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setPriceEarningsRatio(double priceEarningsRatio) {
//        this.priceEarningsRatio = priceEarningsRatio;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setPreviousClose(double previousClose) {
//        this.previousClose = previousClose;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setYearHigh(double yearHigh) {
//        this.yearHigh = yearHigh;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setYearLow(double yearLow) {
//        this.yearLow = yearLow;
//        return this;
//
//    }
//
//    public CompanyDataBuilder setFiveDayHigh(double fiveDayHigh) {
//        this.fiveDayHigh = fiveDayHigh;
//        return this;
//    }
//
//    public CompanyDataBuilder setFiveDayLow(double fiveDayLow) {
//        this.fiveDayLow = fiveDayLow;
//        return this;
//
//    }
//
//    public CompanyData build(){
//        return new CompanyData(ticker, open, high, low, marketCap, priceEarningsRatio, previousClose, yearHigh, yearLow, fiveDayHigh, fiveDayLow);
//    }
//}
//
