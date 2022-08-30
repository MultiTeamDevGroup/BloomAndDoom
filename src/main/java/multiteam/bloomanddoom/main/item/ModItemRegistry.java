package multiteam.bloomanddoom.main.item;

import multiteam.bloomanddoom.BloomAndDoom;
import multiteam.multicore_lib.MultiCoreLib;
import multiteam.multicore_lib.setup.example.Registration;
import multiteam.multicore_lib.setup.example.main.item.HoverTextItemExample2Item;
import multiteam.multicore_lib.setup.example.main.item.HoverTextItemExampleItem;
import multiteam.multicore_lib.setup.example.main.item.TeleportToolExample;
import multiteam.multicore_lib.setup.utilities.generic.ItemGroupTool;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {

    public static final ItemGroupTool BLOOM_AND_DOOM_ITEMS = new ItemGroupTool(BloomAndDoom.MODID + "_items", () -> new ItemStack(Items.POPPY));

    //public static final RegistryObject<Item> HOVERTEXTITEM_EXAMPLE = Registration.ITEMS.register("hover_text_item_example", () -> new HoverTextItemExampleItem(new Item.Properties().tab(MCL_EXAMPLES_TAB)));

    public static void register(){}
}
