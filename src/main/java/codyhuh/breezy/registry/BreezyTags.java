package codyhuh.breezy.registry;

import codyhuh.breezy.Breezy;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class BreezyTags {
    public static final TagKey<Item> IGNITION_SOURCES = bind("ignition_sources");

    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(Breezy.MOD_ID, name));
    }
}