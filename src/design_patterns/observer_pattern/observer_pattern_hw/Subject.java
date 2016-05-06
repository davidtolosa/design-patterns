package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Subject
 */
public class Subject {

    private List<StockBroker> stockBrokers= new ArrayList<StockBroker>();

    public void addStockBroker(StockBroker stockBroker){
        stockBrokers.add(stockBroker);
    }

    public void notifyStockBroker(Map<String,Double> stockList){
        for(StockBroker broker:stockBrokers){
            broker.update(stockList);
        }
    }
}
