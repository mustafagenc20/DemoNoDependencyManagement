package be.intecbrussel;

public class SomeService {
    private DependencyInterface dependency;

    public SomeService(DependencyInterface dependency){  // Dependency injection
        this.dependency = dependency;
    }

    // DbConnector
    // HC - LC

    // 1. We moeten 4 aanpassingen doen (in dit kleine projectje)
    // 2. We moeten 2 versillende soorten aanpassingen doen ==> DependencyInterface ile cozuldu
}
