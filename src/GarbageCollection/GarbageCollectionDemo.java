package GarbageCollection;

public class GarbageCollectionDemo {
	public static void main(String[] args) throws InterruptedException 
    { 
		GarbageCollectionDemo t1 = new GarbageCollectionDemo(); 
		GarbageCollectionDemo t2 = new GarbageCollectionDemo(); 
          
        // Nullifying the reference variable 
        t1 = null; 
          
        // requesting JVM for running Garbage Collector 
        System.gc(); 
          
        Thread.sleep(1000); 
        // Nullifying the reference variable 
        t2 = null; 
          
        // requesting JVM for running Garbage Collector 
        Runtime.getRuntime().gc(); 
        Thread.sleep(1000); 
      
    } 
      
    @Override
    // finalize method is called on object once  
    // before garbage collecting it 
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 
}
