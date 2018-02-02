package goat.fpl.service;

import java.io.IOException;
import java.util.stream.Stream;

import goat.fpl.model.Element;
import goat.fpl.model.ElementType;

public interface ElementService {

    /**
     * Returns a collection of all element types in the game
     */
    Stream<ElementType> getElementTypes() throws IOException;

    /**
     * Returns a collection of all elements.
     */
    Stream<Element> getElements() throws IOException;
}
