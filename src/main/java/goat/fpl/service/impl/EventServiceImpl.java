package goat.fpl.service.impl;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import goat.fpl.model.Event;
import goat.fpl.model.EventElements;
import goat.fpl.model.LiveEvent;
import goat.fpl.service.DataService;
import goat.fpl.service.EventService;

public class EventServiceImpl implements EventService {

    public static final EventService INSTANCE = new EventServiceImpl();

    private DataService dataService = DataServiceImpl.INSTANCE;

    private EventServiceImpl() {

    }

    @Override
    public Optional<EventElements> findElementsByEvent(int event) throws IOException {
	Optional<LiveEvent> liveEvent = getDataService().findLiveEvent(event);
	return liveEvent.isPresent() ? Optional.of(liveEvent.get().getElements()) : Optional.empty();
    }

    @Override
    public int getCurrentEventNumber() throws IOException {
	return 0;
    }

    @Override
    public Stream<Event> getEvents() throws IOException {
	return null;
    }

    private DataService getDataService() {
	return dataService;
    }
}
