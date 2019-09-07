package goat.fpl.adapters.impl;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.Element;
import goat.fpl.model.ElementType;
import goat.fpl.adapters.DataAdapter;
import goat.fpl.adapters.ElementAdapter;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class ElementAdapterImpl implements ElementAdapter {

    public static final ElementAdapter INSTANCE = new ElementAdapterImpl();

    private final DataAdapter dataAdapter = DataAdapterImpl.INSTANCE;

    private ElementAdapterImpl() {
    }

    @Override
    public Stream<ElementType> getElementTypes() throws IOException, InterruptedException {
        Optional<BootstrappedData> opt = getDataAdapter().getBootstrapData();
        return opt.map(bootstrappedData -> Stream.of(bootstrappedData.getElement_types())).orElseGet(Stream::empty);
    }

    @Override
    public Stream<Element> getElements() throws IOException, InterruptedException {
        Optional<BootstrappedData> opt = getDataAdapter().getBootstrapData();
        return opt.map(bootstrappedData -> Stream.of(bootstrappedData.getElements())).orElseGet(Stream::empty);
    }

    private DataAdapter getDataAdapter() {
        return dataAdapter;
    }
}
