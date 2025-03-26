class LinearProbing {
    private int[] table;
    private boolean[] occupied;
    private int size;

    public LinearProbing(int capacity) {
        size = capacity;
        table = new int[size];
        occupied = new boolean[size]; // To track occupied slots
    }

    private int hash(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hash(key);
        while (occupied[index]) {  // Linear probing
            index = (index + 1) % size;
        }
        table[index] = key;
        occupied[index] = true;
    }

    public boolean search(int key) {
        int index = hash(key);
        int startIndex = index;

        while (occupied[index]) {
            if (table[index] == key)
                return true; // Key found
            index = (index + 1) % size;

            if (index == startIndex) // Full loop, key not found
                return false;
        }
        return false;
    }

    public void delete(int key) {
        int index = hash(key);
        int startIndex = index;

        while (occupied[index]) {
            if (table[index] == key) {
                occupied[index] = false; // Mark slot as empty
                return;
            }
            index = (index + 1) % size;

            if (index == startIndex) // Full loop, key not found
                return;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (occupied[i])
                System.out.println("Index " + i + ": " + table[i]);
            else
                System.out.println("Index " + i + ": empty");
        }
    }

    public static void main(String[] args) {
        LinearProbing hashTable = new LinearProbing(10);
        hashTable.insert(23);
        hashTable.insert(33);
        hashTable.insert(43); // Collision, should probe
        hashTable.insert(13);
        
        System.out.println("Hash Table:");
        hashTable.display();

        System.out.println("\nSearch 33: " + hashTable.search(33));
        System.out.println("Search 50: " + hashTable.search(50));

        hashTable.delete(33);
        System.out.println("\nAfter deleting 33:");
        hashTable.display();
    }
}

