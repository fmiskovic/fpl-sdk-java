package goat.fpl.adapters;

import goat.fpl.model.Event;
import goat.fpl.model.EventElements;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public interface EventAdapter {

    /**
     * Returns all element data for a specified event
     *
     * @param event The event number
     */
    Optional<EventElements> findElementsByEvent(int event) throws IOException, InterruptedException;

    /**
     * Returns the current event number
     */
    int getCurrentEventNumber() throws IOException;

    /**
     * Returns a collection of all events
     */
    Stream<Event> getEvents() throws IOException;
}
