package be.intecbrussel;

public class ApplicationContext {
    public static DependencyInterface getDependency(){
        return new SomeDependency();
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
