package goat.fpl.adapters.impl;

import goat.fpl.model.Event;
import goat.fpl.model.EventElements;
import goat.fpl.model.LiveEvent;
import goat.fpl.adapters.DataAdapter;
import goat.fpl.adapters.EventAdapter;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class EventAdapterImpl implements EventAdapter {

    public static final EventAdapter INSTANCE = new EventAdapterImpl();

    private final DataAdapter dataAdapter = DataAdapterImpl.INSTANCE;

    private EventAdapterImpl() {

    }

    @Override
    public Optional<EventElements> findElementsByEvent(int event) throws IOException, InterruptedException {
        Optional<LiveEvent> liveEvent = getDataAdapter().findLiveEvent(event);
        return liveEvent.map(LiveEvent::getElements);
    }

    @Override
    public int getCurrentEventNumber() {
        return 0;
    }

    @Override
    public Stream<Event> getEvents() {
        return null;
    }

    private DataAdapter getDataAdapter() {
        return dataAdapter;
    }
}
