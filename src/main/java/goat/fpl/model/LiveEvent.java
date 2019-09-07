package goat.fpl.model;

public class LiveEvent {

    private EventElements elements;
    private Fixture[] fixtures;

    public EventElements getElements() {
        return elements;
    }

    public void setElements(EventElements elements) {
        this.elements = elements;
    }

    public Fixture[] getFixtures() {
        return fixtures;
    }

    public void setFixtures(Fixture[] fixtures) {
        this.fixtures = fixtures;
    }
}
