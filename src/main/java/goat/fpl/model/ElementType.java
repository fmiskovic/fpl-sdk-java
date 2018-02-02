package goat.fpl.model;

public class ElementType {

    private long id;
    private String plural_name;
    private String plural_name_short;
    private String singular_name;
    private String singular_name_short;

    public ElementType() {

    }

    public long getId() {
	return id;
    }

    public String getPlural_name() {
	return plural_name;
    }

    public String getPlural_name_short() {
	return plural_name_short;
    }

    public String getSingular_name() {
	return singular_name;
    }

    public String getSingular_name_short() {
	return singular_name_short;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setPlural_name(String plural_name) {
	this.plural_name = plural_name;
    }

    public void setPlural_name_short(String plural_name_short) {
	this.plural_name_short = plural_name_short;
    }

    public void setSingular_name(String singular_name) {
	this.singular_name = singular_name;
    }

    public void setSingular_name_short(String singular_name_short) {
	this.singular_name_short = singular_name_short;
    }

    @Override
    public String toString() {
	return "ElementType{" + "id=" + id + ", plural_name='" + plural_name + '\'' + '}';
    }
}
