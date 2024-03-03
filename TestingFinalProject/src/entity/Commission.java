package entity;

public class Commission {

    private int totalLocks, totalStocks, totalBarrales;
    private double lockPrice, stockPrice, barralesPrice, lockSales, stockSales, barraelSale, sales, commission;

    public Commission() {
        lockPrice = 30;
        stockPrice = 35;
        barralesPrice = 40;
    }

    public void setInput(int locks, int stocks, int barrales) {
        this.totalLocks = locks;
        this.totalStocks = stocks;
        this.totalBarrales = barrales;
    }

    public int getTotalLocks() {
        return totalLocks;
    }

    public int getTotalStocks() {
        return totalStocks;
    }

    public int getTotalBarrales() {
        return totalBarrales;
    }

    public double calSale() {
        lockSales = lockPrice * totalLocks;
        stockSales = stockPrice * totalStocks;
        barraelSale = barralesPrice * totalBarrales;

        sales = lockSales + stockSales + barraelSale;

        return sales;
    }

    public double calCommission(double sales) {

        boolean c1 = (1 <= totalLocks) && (totalLocks <= 70);
        boolean c2 = (1 <= totalStocks) && (totalStocks <= 80);
        boolean c3 = (1 <= totalBarrales) && (totalBarrales <= 90);

        if (!c1 || !c2 || !c3) {
            commission = 0.0;
        } else {
            if (sales > 1800) {
                commission = 0.10 * 1000.0;
                commission = commission + 0.15 * 800;
                commission = commission + 0.20 * (sales - 1800.0);

            } else if (sales > 1000) {
                commission = 0.10 * 1000;
                commission = commission + 0.15 * (sales - 1000);

            } else {
                commission = 0.10 * sales;
            }
        }
        return commission;
    }

}
