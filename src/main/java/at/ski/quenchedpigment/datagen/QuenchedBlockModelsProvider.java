package at.ski.quenchedpigment.datagen;

import at.petrak.hexcasting.client.render.GaslightingTracker;
import at.ski.quenchedpigment.block.QuenchedPigmentBlock;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlinx.serialization.json.Json;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static at.ski.quenchedpigment.QuenchedPigment.MOD_ID;
import static at.ski.quenchedpigment.registry.QuenchedPigmentBlocks.QUENCHED_BLACK_BLOCK;

public class QuenchedBlockModelsProvider extends FabricModelProvider {

    public QuenchedBlockModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generatePigmentModels(QUENCHED_BLACK_BLOCK, generator, "black");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.writer.accept(ModelIds.getItemModelId(QUENCHED_BLACK_BLOCK.asItem()), generateItemPigmentModels(ModelIds.getItemModelId(QUENCHED_BLACK_BLOCK.asItem()), "black"));
    }

    public void generatePigmentModels(Block block, BlockStateModelGenerator generator, String color) {
        generator.modelCollector.accept(ModelIds.getBlockModelId(block), generateBlockPigmentModel(ModelIds.getBlockModelId(block), color));
    }

    public Supplier<JsonElement> generateItemPigmentModels(Identifier identifier, String color) {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();

        for (int i = 0; i < QuenchedPigmentBlock.VARIANTS; i++) {
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();


            jsonObject3.addProperty(GaslightingTracker.GASLIGHTING_PRED.toString(), i);
            jsonObject2.add("predicate", jsonObject3);

            jsonObject2.addProperty("model", identifier.toString() + "_" + i);
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("overrides", jsonArray);

        return () -> jsonObject;
    }

    public Supplier<JsonElement> generateBlockPigmentModel(Identifier identifier, String color) {
        JsonObject jsonObject = Models.CUBE_ALL.createJson(identifier, Map.of(TextureKey.ALL, Objects.requireNonNull(Identifier.of(MOD_ID, "quenched_" + color + "_block_0"))));

        return () -> jsonObject;
    }
}
