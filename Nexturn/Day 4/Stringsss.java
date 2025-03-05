public class Stringsss {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original String: " + sb);
        
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb);
        
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        System.out.println("Length of string: " + sb.length());
        
        System.out.println("Character at index 3: " + sb.charAt(3));
        
        sb.setCharAt(3, 'Z');
        System.out.println("After setCharAt: " + sb);
    }
}
