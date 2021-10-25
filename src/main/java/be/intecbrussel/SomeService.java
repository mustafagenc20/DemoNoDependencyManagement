package be.intecbrussel;

public class SomeService {
    private SomeDependency dependency;
    public SomeService(SomeDependency dependency){
        this.dependency = new SomeDependency();
    }
}
