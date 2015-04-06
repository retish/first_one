package edu.cheezelovers.firstweb.servlet;

/**
 * Created with IntelliJ IDEA.
 * User: kristina
 * Date: 2/10/15
 * Time: 1:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataHolder {

    public static ProductInfo[] getProductInfo() {
        ProductInfo[] result = new ProductInfo[3];
        ProductInfo table = new ProductInfo();
        table.price = 1500;
        table.product = "Table";

        ProductInfo window = new ProductInfo();
        window.price = 1300;
        window.product = "Window";

        ProductInfo bed = new ProductInfo();
        bed.price = 500;
        bed.product = "Bed";

        result[0] = table;
        result[1] = window;
        result[2] = bed;


        return result;
    }
}
