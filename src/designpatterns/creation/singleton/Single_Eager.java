package designpatterns.creation.singleton;

public class Single_Eager {
    /**
     * Public Instance Initialized when loading the class
     **/
    private static final Single_Eager instance = new Single_Eager();

    private Single_Eager() {
        /**Private Constructor**/
    }

    public static Single_Eager getInstance() {
        return instance;
    }
}


