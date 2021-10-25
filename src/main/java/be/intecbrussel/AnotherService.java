package be.intecbrussel;

public class AnotherService {
    private SomeDependency someDependency;

    public AnotherService(){
        this.someDependency = new SomeDependency();
    }
}
