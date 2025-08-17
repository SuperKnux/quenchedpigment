package at.ski.quenchedpigment;

import at.ski.quenchedpigment.registry.QuenchedPigmentBlockEntities;
import at.ski.quenchedpigment.registry.QuenchedPigmentBlocks;
import at.ski.quenchedpigment.registry.QuenchedPigmentItemGroups;
import de.dafuqs.spectrum.api.color.ItemColors;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.items;

public class QuenchedPigment implements ModInitializer {

    public static final String MOD_ID = "quenchedpigment";

    public static Identifier locate(String name) {
        return Identifier.of(MOD_ID, name);
    }

    @Override
    public void onInitialize() {
        QuenchedPigmentBlocks.register();
        QuenchedPigmentItemGroups.register();

        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
           for (QuenchedPigmentBlocks.PropertyHolder entry : items) {
               ItemColors.ITEM_COLORS.registerColorMapping(entry.item(), entry.color());
           }
        });

        QuenchedPigmentBlockEntities.registerTiles(bind(Registries.BLOCK_ENTITY_TYPE));

    }

    private <T> BiConsumer<T, Identifier> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }
}
