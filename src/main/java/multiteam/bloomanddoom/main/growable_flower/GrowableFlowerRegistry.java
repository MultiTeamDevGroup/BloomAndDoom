package multiteam.bloomanddoom.main.growable_flower;

import com.mojang.math.Vector3d;
import multiteam.bloomanddoom.main.Registration;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import oshi.util.tuples.Pair;

import java.util.List;

public class GrowableFlowerRegistry {

    public static void register(){
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.POPPY,
                        List.of(
                                new Pair<>(Blocks.GREEN_CONCRETE.defaultBlockState(), new Vector3d(0d, 0d, 0d)),
                                new Pair<>(Blocks.GREEN_CONCRETE.defaultBlockState(), new Vector3d(0d, 1d, 0d)),
                                new Pair<>(Blocks.GREEN_CONCRETE.defaultBlockState(), new Vector3d(0d, 2d, 0d)),
                                new Pair<>(Blocks.GREEN_CONCRETE.defaultBlockState(), new Vector3d(0d, 3d, 0d)),
                                new Pair<>(Blocks.RED_CONCRETE.defaultBlockState(), new Vector3d(0d, 4d, 0d))
                        )
                )
        );
    }

    public static GrowableFlower doesRegistryContainThisFlower(Block flower){
        for (GrowableFlower growable : Registration.GROWABLE_FLOWERS) {
            if(growable.getFlower() == flower){
                return growable;
            }
        }
        return null;
    }
}
