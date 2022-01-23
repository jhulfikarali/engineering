package interviews;

/**
 * Java Generics work on all Object classes hence 
 * primitives are not supported in this solution. 
 * Polymorphism is the best solution in overall.
 */
public class SwapperGenericsSolution {
    
    static class Swapper<A> {
        A first, second;
        
        public Swapper(A first, A second) { 
            this.first = first; this.second = second; 
            System.out.println("Initial values: " + getFirst() + " and " + getSecond());
        }
        
        public A getFirst() { return first; }
        public A getSecond() { return second; }
        
        public Swapper swap() {
            A temp = this.first;
            this.first = second;
            this.second = temp;
            return this;
        }
    }
    
    public static void main(String args[]) {
      Swapper<Integer> integerSwapper = new Swapper(10, 25).swap();
      System.out.println("Swapped values: " + integerSwapper.getFirst() + " and " + integerSwapper.getSecond());
      
      Swapper<String> stringSwapper = new Swapper("hello", "there").swap();
      System.out.println("Swapped values: " + stringSwapper.getFirst() + " and " + stringSwapper.getSecond());

    }

}