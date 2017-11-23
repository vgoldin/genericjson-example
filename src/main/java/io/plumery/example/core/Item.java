package io.plumery.example.core;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;

public class Item extends GenericData {
    @Key
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
