package goat.fpl.servicei.tests;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import goat.fpl.model.ElementStats;
import goat.fpl.model.EventElements;
import goat.fpl.service.EventService;
import goat.fpl.service.impl.EventServiceImpl;

public class EventServiceTest {

    private static final int EVENT = 20;

    private EventService eventService;

    @Test
    public void findElementsByEvent() throws IOException {
	Optional<EventElements> opt = getEventService().findElementsByEvent(EVENT);
	Assert.assertTrue(opt.isPresent());

	EventElements data = opt.get();

	Map<Long, ElementStats> stats = data.getStats();
	Assert.assertNotNull(stats);
	Assert.assertTrue(!stats.isEmpty());
    }

    public EventService getEventService() {
	return eventService;
    }

    @Before
    public void init() {
	eventService = EventServiceImpl.INSTANCE;
    }
}
