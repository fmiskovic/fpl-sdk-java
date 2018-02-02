package goat.fpl.service;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import goat.fpl.model.Event;
import goat.fpl.model.EventElements;

public interface EventService {

    /**
     * Returns all element data for a specified event
     *
     * @param event
     *            The event number
     */
    Optional<EventElements> findElementsByEvent(int event) throws IOException;

    /**
     * Returns the current event number
     */
    int getCurrentEventNumber() throws IOException;

    /**
     * Returns a collection of all events
     */
    Stream<Event> getEvents() throws IOException;
}
