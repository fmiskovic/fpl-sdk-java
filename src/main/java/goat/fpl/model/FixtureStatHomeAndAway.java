package goat.fpl.model;

import java.util.List;

public class FixtureStatHomeAndAway {

    private List<FixtureStatValue> a;
    private List<FixtureStatValue> h;

    public FixtureStatHomeAndAway() {
    }

    public List<FixtureStatValue> getA() {

	return a;
    }

    public List<FixtureStatValue> getH() {
	return h;
    }

    public void setA(List<FixtureStatValue> a) {
	this.a = a;
    }

    public void setH(List<FixtureStatValue> h) {
	this.h = h;
    }
}
