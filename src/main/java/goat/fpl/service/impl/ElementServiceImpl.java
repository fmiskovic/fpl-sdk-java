package goat.fpl.service.impl;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.Element;
import goat.fpl.model.ElementType;
import goat.fpl.service.DataService;
import goat.fpl.service.ElementService;

public class ElementServiceImpl implements ElementService {

    public static final ElementService INSTANCE = new ElementServiceImpl();

    private DataService dataService = DataServiceImpl.INSTANCE;

    private ElementServiceImpl() {
    }

    @Override
    public Stream<ElementType> getElementTypes() throws IOException {
	Optional<BootstrappedData> opt = getDataService().getBootstrapData();
	return opt.isPresent() ? Stream.of(opt.get().getElement_types()) : Stream.empty();
    }

    @Override
    public Stream<Element> getElements() throws IOException {
	Optional<BootstrappedData> opt = getDataService().getBootstrapData();
	return opt.isPresent() ? Stream.of(opt.get().getElements()) : Stream.empty();
    }

    private DataService getDataService() {
	return dataService;
    }
}
