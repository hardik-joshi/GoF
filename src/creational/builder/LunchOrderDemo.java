package creational.builder;

public class LunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        LunchOrder lunchOrder = builder
                .bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey")
                .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
