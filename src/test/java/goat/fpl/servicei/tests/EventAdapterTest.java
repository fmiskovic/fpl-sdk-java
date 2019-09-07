package goat.fpl.servicei.tests;

import goat.fpl.model.ElementStats;
import goat.fpl.model.EventElements;
import goat.fpl.adapters.EventAdapter;
import goat.fpl.adapters.impl.EventAdapterImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

public class EventAdapterTest {

    private static final int EVENT = 20;

    private EventAdapter eventAdapter;

    @Test
    public void findElementsByEvent() throws IOException, InterruptedException {
        Optional<EventElements> opt = getEventAdapter().findElementsByEvent(EVENT);
        Assert.assertTrue(opt.isPresent());

        EventElements data = opt.get();

        Map<Long, ElementStats> stats = data.getStats();
        Assert.assertNotNull(stats);
        Assert.assertFalse(stats.isEmpty());
    }

    public EventAdapter getEventAdapter() {
        return eventAdapter;
    }

    @Before
    public void init() {
        eventAdapter = EventAdapterImpl.INSTANCE;
    }
}
