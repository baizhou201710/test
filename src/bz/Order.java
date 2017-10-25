package bz;

import java.util.List;

public class Order {

    private String id;
    private List<Goods> goods;
    private float tolAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public float getTolAmount() {
        tolAmount = 0.00f;
        if (goods != null && goods.size() > 0) {
            for (Goods good : goods) {
                tolAmount = tolAmount + good.getPrice() * good.getAmount();
            }
        }
        return tolAmount;
    }

    public void setTolAmount(float tolAmount) {
        this.tolAmount = tolAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", goods=" + goods +
                ", tolAmount=" + getTolAmount() +
                '}';
    }


}
