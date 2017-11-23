package io.plumery.example.resources;

import com.google.common.collect.Lists;
import io.plumery.example.core.Item;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class SimpleApi {
    @GET
    @Path("/items")
    public List<Item> items() {
        Item item = new Item();
        // -- static typed fields
        item.setName("test");

        // -- extension fields
        item.unknownFields.add("newField", "newValue");

        return Lists.newArrayList(item);
    }

    @POST
    @Path("/items")
    public Item items(Item newItem) {
        // -- static typed fields
        String name = newItem.getName();

        // -- extension fields
        Map<String, Object> extensionFields = newItem.unknownFields;

        return newItem;
    }
}
