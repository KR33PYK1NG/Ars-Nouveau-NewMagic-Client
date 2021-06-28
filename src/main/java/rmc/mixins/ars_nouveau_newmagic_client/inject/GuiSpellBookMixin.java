package rmc.mixins.ars_nouveau_newmagic_client.inject;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.hollingsworth.arsnouveau.client.gui.book.GuiSpellBook;

/**
 * Developed by RMC Team, 2021
 * @author KR33PY
 */
@Mixin(value = GuiSpellBook.class)
public abstract class GuiSpellBookMixin {

    @Shadow
    public int numLinks;

    @Inject(method = "Lcom/hollingsworth/arsnouveau/client/gui/book/GuiSpellBook;<init>(Lcom/hollingsworth/arsnouveau/api/ArsNouveauAPI;Lnet/minecraft/nbt/CompoundNBT;ILjava/lang/String;)V",
            at = @At(value = "TAIL"))
    private void changeSlotAmount(CallbackInfo mixin) {
        this.numLinks = 5;
    }

}