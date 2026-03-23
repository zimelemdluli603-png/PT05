import java.util.ArrayList;
import java.util.Scanner;

public class testItem {

    // Display items grouped by type (classic for-loop)
    public static void displayItems(ArrayList<Item> items) {
        System.out.println("\n--- Books ---");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item instanceof Book) {
                System.out.println(item);
            }
        }

        System.out.println("\n--- Movies ---");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item instanceof Movie) {
                System.out.println(item);
            }
        }
    }

    // Find item by title (classic for-loop)
    public static int findItem(ArrayList<Item> items, String searchTitle) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equalsIgnoreCase(searchTitle)) {
                return i;
            }
        }
        return -1;
    }

    // Sort items by title (nested loop swap style)
    public static void sortItems(ArrayList<Item> items) {
        int count = items.size();

        for (int k = 0; k < count - 1; k++) {          
            for (int j = k + 1; j < count; j++) {      
                if (items.get(k).getTitle().compareToIgnoreCase(items.get(j).getTitle()) > 0) {
                    // swap
                    Item temp = items.get(k);
                    items.set(k, items.get(j));
                    items.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        // Populate ArrayList
        items.add(new Book("The Hobbit", 1937, "J.R.R. Tolkien"));
        items.add(new Movie("Inception", 2010, 148));
        items.add(new Book("1984", 1949, "George Orwell"));
        items.add(new Movie("Interstellar", 2014, 169));

        // Display items
        displayItems(items);

        // Search for an item
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a title to search: ");
        String searchTitle = sc.nextLine();

        int index = findItem(items, searchTitle);
        if (index != -1) {
            System.out.println("Item found at index: " + index + " → " + items.get(index));
        } else {
            System.out.println("Item not found.");
        }

        // Sort items
        sortItems(items);

        // Display sorted items
        System.out.println("\n--- Sorted Items ---");
        displayItems(items);

        sc.close();
    }
}
