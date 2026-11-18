public class StackDemo {
    public static void main(String[] args) {
        // Uji 1: Stack Integer
        System.out.println("=== Uji Stack Integer ===");
        ArrayStack<Integer> numbers = new ArrayStack<>(3);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        // Uji Overflow Error (Step 19)
        try {
            numbers.push(4);
        } catch (ArrayStack.ArrayStackException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }

        // Uji LIFO
        System.out.println("Pop: " + numbers.pop()); // 3
        System.out.println("Pop: " + numbers.pop()); // 2
        System.out.println("Pop: " + numbers.pop()); // 1

        // Uji Underflow Error (Step 19)
        try {
            numbers.pop();
        } catch (ArrayStack.ArrayStackException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }

        // Uji 2: Stack String
        System.out.println("\n=== Uji Stack String ===");
        ArrayStack<String> texts = new ArrayStack<>(2);
        texts.push("PBO");
        texts.push("Collection");
        System.out.println("Pop: " + texts.pop()); // Collection
        System.out.println("Pop: " + texts.pop()); // PBO
    }
}
