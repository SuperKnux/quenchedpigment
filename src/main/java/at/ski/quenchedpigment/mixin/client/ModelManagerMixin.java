package at.ski.quenchedpigment.mixin.client;


import at.ski.quenchedpigment.client.QuenchedClientRegistry;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

// https://github.com/VazkiiMods/Botania/blob/986dff2e8cd9f40f7e4d6ed7b30c98944bdb3b87/Fabric/src/main/java/vazkii/botania/fabric/mixin/client/ModelManagerFabricMixin.java#L34
@Mixin(BakedModelManager.class)
public class ModelManagerMixin {

    @Shadow
    private Map<Identifier, BakedModel>models;

    @Inject(at = @At(value = "INVOKE_ASSIGN", target = ""))

    private void onModelBake(ModelLoader modelLoader, ResourceManager resourceManager, Profiler profiler, CallbackInfo ci) {
        QuenchedClientRegistry.onModelBake(modelLoader, this.models);
    }
}
