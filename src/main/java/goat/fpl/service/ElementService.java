package goat.fpl.service;

import java.io.IOException;
import java.util.stream.Stream;

import goat.fpl.model.Element;
import goat.fpl.model.ElementType;

/**
 * Use this service to get data about specific Element(PL player e.g. Eden
 * Hazard).
 *
 * @Author Filip Miskovic
 */
public interface ElementService {

    /**
     * Returns a collection of all element types in the game. Element types could be
     * Goalkeeper(GKP) Defender(DEF), Midfielder(MID) and FORWARD(FWD).
     */
    Stream<ElementType> getElementTypes() throws IOException;

    /**
     * Returns a collection of all elements. By calling this method, you can find
     * useful information about PL players, like player price, form, transfer
     * in/out, goal scored, yellow cards etc.
     */
    Stream<Element> getElements() throws IOException;
}
