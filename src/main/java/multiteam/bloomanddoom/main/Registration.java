package multiteam.bloomanddoom.main;

import multiteam.bloomanddoom.main.block.ModBlockRegistry;
import multiteam.bloomanddoom.main.growable_flower.GrowableFlower;
import multiteam.bloomanddoom.main.growable_flower.GrowableFlowerRegistry;
import multiteam.bloomanddoom.main.item.ModItemRegistry;
import multiteam.multicore_lib.MultiCoreLib;
import multiteam.multicore_lib.setup.example.main.block.ExampleModBlocks;
import multiteam.multicore_lib.setup.example.main.item.ExampleModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import oshi.util.tuples.Pair;

import java.util.ArrayList;
import java.util.List;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MultiCoreLib.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MultiCoreLib.MOD_ID);
    //public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, MultiCoreLib.MOD_ID);
    //public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MultiCoreLib.MOD_ID);

    public static final List<GrowableFlower> GROWABLE_FLOWERS = new ArrayList<GrowableFlower>();

    public static void register(){
        IEventBus modeEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modeEventBus);
        ITEMS.register(modeEventBus);
        //POTIONS.register(modeEventBus);
        //ENTITY_TYPES.register(modeEventBus);

        ModBlockRegistry.register();
        ModItemRegistry.register();
        //ModPotions.register();
        //ModEntities.register();
        GrowableFlowerRegistry.register();
    }
}
