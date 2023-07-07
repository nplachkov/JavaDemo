package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.printf("Drawer contains: ");
        System.out.println(kitchenDrawer);


        System.out.printf("\nTaking top element: ");
        System.out.println(kitchenDrawer.pop());
        System.out.printf("\nWhats left?: ");
        System.out.println(kitchenDrawer);
    }
}
