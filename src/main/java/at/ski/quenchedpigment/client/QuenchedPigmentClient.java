package at.ski.quenchedpigment.client;

import at.petrak.hexcasting.client.RegisterClientStuff;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

public class QuenchedPigmentClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        QuenchedClientRegistry.registerBlockEntityRenderers(new QuenchedClientRegistry.BlockEntityRendererRegisterererer() {

            @Override
            public <T extends BlockEntity> void registerBlockEntityRenderer(BlockEntityType<T> type, BlockEntityRendererFactory<? super T> berp) {
                {
                    BlockEntityRendererFactories.register(type, berp);
                }
            }
        });
    }
}
