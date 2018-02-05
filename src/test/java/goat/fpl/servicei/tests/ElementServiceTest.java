package goat.fpl.servicei.tests;

import java.io.IOException;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import goat.fpl.model.Element;
import goat.fpl.model.ElementType;
import goat.fpl.service.ElementService;
import goat.fpl.service.impl.ElementServiceImpl;

public class ElementServiceTest {

    private ElementService elementService;

    @Test
    public void getElementTypesTest() throws IOException {
	Stream<ElementType> stream = getElementService().getElementTypes();
	Assert.assertNotNull(stream);

	stream.forEach(et -> Assert.assertNotNull(et.getPlural_name()));
    }

    @Test
    public void getElementsTest() throws IOException {
	Stream<Element> stream = getElementService().getElements();
	Assert.assertNotNull(stream);

	stream.forEach(e -> {
	    Assert.assertNotNull(e.getFirst_name());
	    Assert.assertNotNull(e.getSecond_name());
	});
    }

    @Before
    public void init() {
	elementService = ElementServiceImpl.INSTANCE;
    }

    private ElementService getElementService() {
	return elementService;
    }
}
