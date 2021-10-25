package be.intecbrussel;

public class ApplicationContext {  // IOC
    public static DependencyInterface getDependency(){
        return new GmailDependency();
    }

    public static SomeService getSomeService(){
        return new SomeService(getDependency());
    }

    public static AnotherService getAnotherService(){
        return new AnotherService(getDependency());
    }

//    public static SomeViewClass getView(){
//        return new ViewClass(getSomeService());
//    }


}
