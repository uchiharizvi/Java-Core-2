package designpatterns.creation.singleton;

public class Single_Eager_Static {
    /**
     * Public Instance Initialized when loading the class
     **/
    private static final Single_Eager_Static instance;

    private Single_Eager_Static() {
        /**Private Constructor**/
    }

    /**Static Block**/
    static {
        instance = new Single_Eager_Static();
    }
}
