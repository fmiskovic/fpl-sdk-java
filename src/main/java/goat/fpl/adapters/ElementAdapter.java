package goat.fpl.adapters;

import goat.fpl.model.Element;
import goat.fpl.model.ElementType;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * Use this adapter to get data about specific Element(PL player e.g. Eden
 * Hazard).
 *
 * @Author Filip Miskovic
 * @Email fmiskovic@yandex.com
 */
public interface ElementAdapter {

    /**
     * Returns a collection of all element types in the game. Element types could be
     * Goalkeeper(GKP) Defender(DEF), Midfielder(MID) and FORWARD(FWD).
     */
    Stream<ElementType> getElementTypes() throws IOException, InterruptedException;

    /**
     * Returns a collection of all elements. By calling this method, you can find
     * useful information about PL players, like player price, form, transfer
     * in/out, goal scored, yellow cards etc.
     */
    Stream<Element> getElements() throws IOException, InterruptedException;
}
