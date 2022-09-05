import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfProducts = 0;
        ArrayList<String> listOfProducts = new ArrayList<>();
        while (true) {
            System.out.println("Choose the operation: ");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            String product = scanner.nextLine();
            if (operation == 1) {
                System.out.println("What kind of products do you want to add? ");
                //  if (scanner.hasNext())
                product = scanner.nextLine();
                listOfProducts.add(product);
                numberOfProducts++;

                System.out.println("Your shopping list: " + listOfProducts.size());

            } else if (operation == 2) {
                System.out.println("Your shopping list: ");
                for (int i = 0; i < listOfProducts.size(); i++) {
                    System.out.println(i + 1 + "." + listOfProducts.get(i));

                }
            } else if (operation == 3) {
                System.out.println("Your shopping list: ");
                for (int i = 0; i < listOfProducts.size(); i++) {
                    System.out.println(i + 1 + "." + listOfProducts.get(i));

                }
                System.out.println("What kind of products do you want to delete? " +
                        "enter the name or the number");
                String removeProduct = scanner.nextLine();
                try {
                    int numberOfRemovingProduct = Integer.parseInt(removeProduct);

                    System.out.println("The " + listOfProducts.get(numberOfRemovingProduct - 1) + " was deleted");
                    listOfProducts.remove(numberOfRemovingProduct - 1);
                    System.out.println("Your shopping list: ");
                    for (int i = 0; i < listOfProducts.size(); i++) {
                        System.out.println(i + 1 + "." + listOfProducts.get(i));

                    }
                } catch (NumberFormatException e) {
                    if (listOfProducts.contains(removeProduct)) {
                        listOfProducts.remove(removeProduct);
                        System.out.println("The " + removeProduct + " was deleted");
                        System.out.println("Your shopping list: ");
                        for (int i = 0; i < listOfProducts.size(); i++) {
                            System.out.println(i + 1 + "." + listOfProducts.get(i));

                        }
                    }

                }

            } else if (operation == 4) {
                System.out.println("Enter the text for searching");
                String searchingText = scanner.nextLine();
                String queryLower = searchingText.toLowerCase();
                for (int i = 0; i < listOfProducts.size(); i++) {
                    String itemLower = listOfProducts.get(i).toLowerCase();
                    if (itemLower.contains(queryLower)) {
                        System.out.println(i + 1 + "." + listOfProducts.get(i));
                    }
                }
            }
        }

    }
}

