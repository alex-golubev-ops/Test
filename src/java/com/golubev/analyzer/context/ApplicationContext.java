package com.golubev.analyzer.context;

import com.golubev.analyzer.entity.AbstractEntity;
import com.golubev.analyzer.parser.OrderItemsParser;
import com.golubev.analyzer.parser.OrderParser;
import com.golubev.analyzer.parser.ProductParser;
import com.golubev.analyzer.repo.RepoImp;

import java.util.List;

public class ApplicationContext {

    private static ApplicationContext context;

    private RepoImp orders;

    private RepoImp products;

    private RepoImp productItems;


    private ApplicationContext(){

    }

    public ApplicationContext getInstance(){
        if(context==null){
            context = new ApplicationContext();
        }
        return context;
    }

    public void loadData(String urlOrder, String urlProduct, String urlOrderItems) {
        OrderParser orderParser = new OrderParser(urlOrder);
        ProductParser productParser = new ProductParser(urlProduct);
        OrderItemsParser orderItemsParser = new OrderItemsParser(urlOrderItems);
        orders = new RepoImp();
        orders.setOrders((List<AbstractEntity>) orderItemsParser.getValue());
        products = new RepoImp();
        products.setOrders((List<AbstractEntity>) productParser.getValue());
        productItems = new RepoImp();
        productItems.setOrders((List<AbstractEntity>) orderItemsParser.getValue());
    }
}
