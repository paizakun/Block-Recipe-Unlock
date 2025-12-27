package io.github.paizakun.blockrecipeunlock.mixin;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.crafting.Recipe;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Collection;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerRecipeBlockMixin {

    @Inject(
            method = "awardRecipes(Ljava/util/Collection;)I",
            at = @At("HEAD"),
            cancellable = true
    )
    private void blockAwardRecipes(
            Collection<Recipe<?>> recipes,
            CallbackInfoReturnable<Integer> cir
    ) {
        cir.setReturnValue(0);
    }
}


