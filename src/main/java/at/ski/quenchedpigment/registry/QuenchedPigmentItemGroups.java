package at.ski.quenchedpigment.registry;

import de.dafuqs.fractal.api.ItemSubGroupEvents;
import de.dafuqs.spectrum.api.item_group.ItemGroupIDs;
import net.minecraft.item.ItemStack;

public class QuenchedPigmentItemGroups {
    public static void register() {
        ItemSubGroupEvents.modifyEntriesEvent(ItemGroupIDs.SUBTAB_DECORATION).register(entries -> {
            for (QuenchedPigmentBlocks.PropertyHolder item : QuenchedPigmentBlocks.items) {
                if (item.subGroup().getIdentifier().equals(ItemGroupIDs.SUBTAB_DECORATION)) {
                    entries.add(new ItemStack(item.item()));
                }
            }
        });
    }
}
