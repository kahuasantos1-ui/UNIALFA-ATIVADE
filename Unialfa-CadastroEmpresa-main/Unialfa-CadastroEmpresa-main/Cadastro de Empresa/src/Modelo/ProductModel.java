
package Modelo;

public class ProductModel {
    private Long id;
    private String name;
    private double price;
    private String BarCode;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the BarCode
     */
    public String getBarCode() {
        return BarCode;
    }

    /**
     * @param BarCode the BarCode to set
     */
    public void setBarCode(String BarCode) {
        this.BarCode = BarCode;
    }
    
    
    
}
