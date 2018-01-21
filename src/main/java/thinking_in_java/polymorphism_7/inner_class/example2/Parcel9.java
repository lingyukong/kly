package thinking_in_java.polymorphism_7.inner_class.example2;

import thinking_in_java.polymorphism_7.inner_class.example1.Destination;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 10:57
 * @see
 */
public class Parcel9 {
    public Destination dest(final String dest, final float price) {
        return new Destination() {
            private int cost;
            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println("Over budget!");
            }
            private String label = dest;
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.dest("Tanzania", 101.395F);
    }
}
