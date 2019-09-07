package goat.fpl.servicei.tests;

import goat.fpl.model.Element;
import goat.fpl.model.ElementType;
import goat.fpl.adapters.ElementAdapter;
import goat.fpl.adapters.impl.ElementAdapterImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.stream.Stream;

public class ElementAdapterTest {

    private ElementAdapter elementAdapter;

    @Test
    public void getElementTypesTest() throws IOException, InterruptedException {
        Stream<ElementType> stream = getElementAdapter().getElementTypes();
        Assert.assertNotNull(stream);

        stream.forEach(et -> Assert.assertNotNull(et.getPlural_name()));
    }

    @Test
    public void getElementsTest() throws IOException, InterruptedException {
        Stream<Element> stream = getElementAdapter().getElements();
        Assert.assertNotNull(stream);

        stream.forEach(e -> {
            Assert.assertNotNull(e.getFirst_name());
            Assert.assertNotNull(e.getSecond_name());
        });
    }

    @Before
    public void init() {
        elementAdapter = ElementAdapterImpl.INSTANCE;
    }

    private ElementAdapter getElementAdapter() {
        return elementAdapter;
    }
}
