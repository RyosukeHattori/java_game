import java.util.*;

public class main01 {
    public static void main(String[] args) {

        List<Item> item = new ArrayList<>();
        item.add(new Item(1, "リンゴ", 100));
        item.add(new Item(2, "スイカ", 400));
        item.add(new Item(3, "メロン", 600));

        Scanner s = new Scanner(System.in);

        System.out.println("ユーザー名を入力してください");
        String username = s.next();
        System.out.println(username + "さん、何を買いますか？商品番号を入力してください");
        System.out.println("１、リンゴ　100円　２、スイカ　400円　３、メロン　600円");
        int orderNumber = Integer.parseInt(s.next());
        System.out.println(item.get(orderNumber).getName() + "、ですね！いくつ買いますか？");
        int orderCount = Integer.parseInt(s.next());
        int sumPrice = orderCount * item.get(orderNumber).getPrice();

        System.out.println("合計金額は" + sumPrice + "円です、" + username + "さん、ありがとうございました");
    }

}

class Item {

    private int number;
    private String name;
    private int price;

    public Item(int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

}
