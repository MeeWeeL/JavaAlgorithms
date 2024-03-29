package HomeWork8;

public class Task1 {

    public static void main(String[] args) {
        var hashTable = new HashTableImpl<>(10);

        hashTable.put(new Product(1, "Orange"), 150); // 1:0
        hashTable.put(new Product(77, "Banana"), 100); // 7:0
        hashTable.put(new Product(67, "Carrot"), 228); // 7:1
        hashTable.put(new Product(60, "Lemon"), 250); // 0:0
        hashTable.put(new Product(51, "Milk"), 120); // 1:1
        hashTable.put(new Product(21, "Potato"), 67); // 1:2

        System.out.println("Size is " + hashTable.size());
        hashTable.display();

        System.out.println("Cost potato is " + hashTable.get(new Product(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Product(77, "Banana")));
        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));

        hashTable.remove(new Product(21, "Potato"));
        hashTable.remove(new Product(77, "Banana"));

        System.out.println("Cost potato is " + hashTable.get(new Product(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Product(77, "Banana")));
        System.out.println("Cost carrot is " + hashTable.get(new Product(67, "Carrot")));

        hashTable.put(new Product(47, "Pineapple"), 228);

        hashTable.display();
    }
}