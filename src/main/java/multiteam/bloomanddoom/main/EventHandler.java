package multiteam.bloomanddoom.main;

import multiteam.bloomanddoom.BloomAndDoom;
import multiteam.bloomanddoom.main.growable_flower.GrowableFlower;
import multiteam.bloomanddoom.main.growable_flower.GrowableFlowerRegistry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BloomAndDoom.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SubscribeEvent
    public static void onBonemealUsed(PlayerInteractEvent event){
        Level level = event.getLevel();
        Block block = level.getBlockState(event.getPos()).getBlock();
        ItemStack handStack = event.getItemStack();

        if(handStack.is(Items.BONE_MEAL)){ //If player has used bonemeal on a block then,
            GrowableFlower flower = GrowableFlowerRegistry.doesRegistryContainThisFlower(block);
            if(flower != null){ //we detect if the block is a growable flower //TODO implement growable flower registry so we dont have to test for each flower and that way its also moddable
                if(level.isClientSide){ //then we A, spawn particles on clientside
                    //TODO play bonemeal particles in world
                }else{ //B, grow flower aka place flower stem and petal blocks on server side
                    flower.growAt(event.getPos(), (ServerLevel)level);
                }
            }
        }

    }
}
