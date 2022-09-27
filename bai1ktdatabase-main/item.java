public class item extends customer {
    private int id;
    private String name ;
    private double price;
    private String moTa;

    public item(int id, String name,double price,String moTa ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.moTa = moTa;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}


