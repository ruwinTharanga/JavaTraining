package SingletonP;

import java.util.concurrent.SynchronousQueue;

public class SingletonD {

    private static volatile SingletonD single_instance = null;
    public String s;
    private SingletonD (){

        s = "is a technical device to used for computer.";
    }

    public static SingletonD getSingletonD (){

        if(single_instance == null) {
            synchronized (SingletonD.class) {
                if (single_instance == null) {
                    single_instance = new SingletonD();
                }
            }
        }
        return single_instance;
    }

}
