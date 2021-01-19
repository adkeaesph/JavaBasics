package GarbageCollection;

public class GarbageCollectionDemo {
	static int counter = 0;
	GarbageCollectionDemo demo;
	
	public static void show() {
		GarbageCollectionDemo demo = new GarbageCollectionDemo();
	}
	public static void main(String[] args) throws InterruptedException 
    { 
		GarbageCollectionDemo t1 = new GarbageCollectionDemo(); 
		GarbageCollectionDemo t2 = new GarbageCollectionDemo(); 
          
        // Nullifying the reference variable 
        t1 = null; 
          
        // requesting JVM for running Garbage Collector 
        System.gc(); 
        Thread.sleep(1000);
        //0-----------------------------------------------------------------------------------  
        
        // Nullifying the reference variable 
        t2 = null; 
          
        // requesting JVM for running Garbage Collector 
        Runtime.getRuntime().gc(); 
        Thread.sleep(1000); 
        //1-----------------------------------------------------------------------------------
        
        t1 = new GarbageCollectionDemo();
        t2 = new GarbageCollectionDemo();
        
        //referencing t2 to t1; object earlier referenced by t2 is eligible for garbage collection 
        t2 = t1;
        System.gc();
        Thread.sleep(1000);
        //2-----------------------------------------------------------------------------------
        
        //anonymous object is eligible for garbage collection
        new GarbageCollectionDemo();
        System.gc();
        Thread.sleep(1000);
        //3------------------------------------------------------------------------------------
        
        //object created inside method is eligible for garbage collection
        show();
        System.gc();
        Thread.sleep(1000);
        //4------------------------------------------------------------------------------------
        
        //Island of isolation
        t1 = new GarbageCollectionDemo();
        t2 = new GarbageCollectionDemo();
        t1.demo = t2;
        t2.demo = t1;
        t1 = null;
        t2 = null;
        System.gc();
        Thread.sleep(1000);
        //5 - t1, 6 - t2 and 7 is an island pointing each other-------------------------------------------------------------------------------------
    } 
      
    @Override
    // finalize method is called on object once  
    // before garbage collecting it 
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object "+ counter + " garbage collected : " + this);
        counter++;
    } 
}
