package com.flores.expandablecardview.model;
/**
 * ItemExpandableEntity
 *
 * @author bill.flores - Avantica
 * @since 06/25/2019
 */

public class ItemExpandableEntity {

    private String name;
    private String value;

    public ItemExpandableEntity(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
