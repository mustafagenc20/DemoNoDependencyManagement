package be.intecbrussel;

public class SomeService {
    private DependencyInterface dependency;

    public SomeService(){
        this.dependency = new GmailDependency();
    }

    public SomeService(DependencyInterface dependency){  // Dependency injection
        this.dependency = dependency;
    }

    // DbConnector
    // HC - LC

    // 1. We moeten 4 aanpassingen doen (in dit kleine projectje)
    // 2. We moeten 2 versillende soorten aanpassingen doen ==> with DependencyInterface solved

    // Dependency Management Framework
    // IOC - Inversion of Control - Framework
    // Framework vs Library

    // JPA - specificatie vs Hibernate - imlementatie
}
