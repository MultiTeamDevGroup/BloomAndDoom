package multiteam.bloomanddoom.main.growable_flower;

import com.mojang.math.Vector3d;
import multiteam.bloomanddoom.main.Registration;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import oshi.util.tuples.Pair;

import java.util.List;

public class GrowableFlowerRegistry {

    public static void register(){
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.DANDELION,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 2d, -1d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 1d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 4d, 0d),
                                block(Blocks.YELLOW_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.YELLOW_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.YELLOW_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.YELLOW_CONCRETE, 1d, 3d, 1d),
                                block(Blocks.YELLOW_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.YELLOW_CONCRETE, 1d, 3d, -1d),
                                block(Blocks.YELLOW_CONCRETE, 0d, 3d, 1d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.POPPY,
                        List.of(
                                block(Blocks.GREEN_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.GREEN_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.GREEN_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.GREEN_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.GREEN_CONCRETE, 0d, 4d, 0d),
                                block(Blocks.GREEN_CONCRETE, 1d, 0d, 0d),
                                block(Blocks.GREEN_CONCRETE, -1d, 0d, 0d),
                                block(Blocks.GREEN_CONCRETE, 0d, 0d, 1d),
                                block(Blocks.GREEN_CONCRETE, 0d, 0d, -1d),
                                block(Blocks.GREEN_CONCRETE, 2d, 1d, 0d),
                                block(Blocks.GREEN_CONCRETE, -2d, 1d, 0d),
                                block(Blocks.GREEN_CONCRETE, 0d, 1d, 2d),
                                block(Blocks.GREEN_CONCRETE, 0d, 1d, -2d),
                                block(Blocks.RED_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.RED_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.RED_CONCRETE, 0d, 5d, 0d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.RED_CONCRETE, 0d, 5d, 0d),
                                block(Blocks.RED_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.RED_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.RED_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.RED_CONCRETE, 0d, 6d, 1d),
                                block(Blocks.RED_CONCRETE, 0d, 6d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 6d, 0d),
                                block(Blocks.RED_CONCRETE, -1d, 6d, 1d),
                                block(Blocks.RED_CONCRETE, 0d, 6d, 1d),
                                block(Blocks.RED_CONCRETE, 1d, 5d, 1d),
                                block(Blocks.RED_CONCRETE, 0d, 4d, 1d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.BLUE_ORCHID,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 4d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 0d, -1d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, 1d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 2d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, 2d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, -2d),
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.LIME_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.LIME_CONCRETE, 1d, 4d, -2d),
                                block(Blocks.LIME_CONCRETE, 1d, 5d, -2d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, -2d, 3d, 2d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, -2d, 3d, -2d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, -2d, 2d, -1d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 2d, 2d, 1d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 2d, 3d, 0d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 0d, 5d, 2d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 0d, 6d, 2d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 1d, 6d, -2d),
                                block(Blocks.LIGHT_BLUE_CONCRETE, 2d, 5d, -2d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.ALLIUM,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 4d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 3d, 1d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.MAGENTA_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.MAGENTA_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, -1d, 4d, 1d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.MAGENTA_CONCRETE, 1d, 4d, -1d),
                                block(Blocks.MAGENTA_CONCRETE, 1d, 4d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.MAGENTA_CONCRETE, 2d, 4d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, -2d, 4d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 4d, -2d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 4d, 2d),
                                block(Blocks.MAGENTA_CONCRETE, 1d, 5d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 5d, 0d),
                                block(Blocks.MAGENTA_CONCRETE, 0d, 6d, 0d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.AZURE_BLUET,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 1d),
                                block(Blocks.LIME_CONCRETE, 0d, 0d, -1d),
                                block(Blocks.LIME_CONCRETE, -1d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 1d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 1d),
                                block(Blocks.LIME_CONCRETE, 1d, 2d, -1d),
                                block(Blocks.WHITE_CONCRETE, 0d, 1d, 1d),
                                block(Blocks.WHITE_CONCRETE, -2d, 1d, 1d),
                                block(Blocks.WHITE_CONCRETE, -2d, 1d, 0d),
                                block(Blocks.WHITE_CONCRETE, 2d, 1d, 1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 2d, 1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 2d, 0d),
                                block(Blocks.WHITE_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.WHITE_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.WHITE_CONCRETE, 1d, 1d, -1d),
                                block(Blocks.WHITE_CONCRETE, 0d, 2d, -1d),
                                block(Blocks.WHITE_CONCRETE, 0d, 1d, -2d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.RED_TULIP,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.RED_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.RED_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.RED_CONCRETE, 0d, 3d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.RED_CONCRETE, 1d, 4d, 0d),
                                block(Blocks.RED_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.RED_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 4d, 1d),
                                block(Blocks.RED_CONCRETE, 1d, 4d, -1d),
                                block(Blocks.RED_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.RED_CONCRETE, 1d, 5d, 0d),
                                block(Blocks.RED_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.RED_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.RED_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.RED_CONCRETE, 1d, 5d, 1d),
                                block(Blocks.RED_CONCRETE, -1d, 6d, -1d),
                                block(Blocks.RED_CONCRETE, -1d, 6d, 1d),
                                block(Blocks.RED_CONCRETE, 1d, 6d, -1d),
                                block(Blocks.RED_CONCRETE, 1d, 6d, 1d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.ORANGE_TULIP,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, -1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.ORANGE_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.ORANGE_CONCRETE, 0d, 3d, 1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 4d, 0d),
                                block(Blocks.ORANGE_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.ORANGE_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 4d, 1d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 4d, -1d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 5d, 0d),
                                block(Blocks.ORANGE_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.ORANGE_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 5d, -1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 5d, 1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 6d, -1d),
                                block(Blocks.ORANGE_CONCRETE, -1d, 6d, 1d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 6d, -1d),
                                block(Blocks.ORANGE_CONCRETE, 1d, 6d, 1d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.WHITE_TULIP,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, -1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.WHITE_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.WHITE_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.WHITE_CONCRETE, 0d, 3d, 1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.WHITE_CONCRETE, 1d, 4d, 0d),
                                block(Blocks.WHITE_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.WHITE_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 4d, 1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 4d, -1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.WHITE_CONCRETE, 1d, 5d, 0d),
                                block(Blocks.WHITE_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.WHITE_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 5d, -1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 5d, 1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 6d, -1d),
                                block(Blocks.WHITE_CONCRETE, -1d, 6d, 1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 6d, -1d),
                                block(Blocks.WHITE_CONCRETE, 1d, 6d, 1d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.PINK_TULIP,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.PINK_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.PINK_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.PINK_CONCRETE, 0d, 3d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.PINK_CONCRETE, 1d, 4d, 0d),
                                block(Blocks.PINK_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.PINK_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 4d, 1d),
                                block(Blocks.PINK_CONCRETE, 1d, 4d, -1d),
                                block(Blocks.PINK_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.PINK_CONCRETE, 1d, 5d, 0d),
                                block(Blocks.PINK_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.PINK_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 5d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.PINK_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.PINK_CONCRETE, 1d, 5d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 6d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 6d, 1d),
                                block(Blocks.PINK_CONCRETE, 1d, 6d, -1d),
                                block(Blocks.PINK_CONCRETE, 1d, 6d, 1d)
                        )
                )
        );
        Registration.GROWABLE_FLOWERS.add(
                new GrowableFlower(
                        Blocks.PINK_TULIP,
                        List.of(
                                block(Blocks.LIME_CONCRETE, 0d, 0d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 2d, 0d),
                                block(Blocks.LIME_CONCRETE, 0d, 3d, 0d),
                                block(Blocks.LIME_CONCRETE, 1d, 1d, 0d),
                                block(Blocks.LIME_CONCRETE, -1d, 1d, -1d),
                                block(Blocks.LIME_CONCRETE, -2d, 2d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 3d, 0d),
                                block(Blocks.PINK_CONCRETE, 1d, 3d, 0d),
                                block(Blocks.PINK_CONCRETE, 0d, 3d, -1d),
                                block(Blocks.PINK_CONCRETE, 0d, 3d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 4d, 0d),
                                block(Blocks.PINK_CONCRETE, 1d, 4d, 0d),
                                block(Blocks.PINK_CONCRETE, 0d, 4d, -1d),
                                block(Blocks.PINK_CONCRETE, 0d, 4d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 4d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 4d, 1d),
                                block(Blocks.PINK_CONCRETE, 1d, 4d, -1d),
                                block(Blocks.PINK_CONCRETE, 1d, 4d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 5d, 0d),
                                block(Blocks.PINK_CONCRETE, 1d, 5d, 0d),
                                block(Blocks.PINK_CONCRETE, 0d, 5d, -1d),
                                block(Blocks.PINK_CONCRETE, 0d, 5d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 5d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 5d, 1d),
                                block(Blocks.PINK_CONCRETE, 1d, 5d, -1d),
                                block(Blocks.PINK_CONCRETE, 1d, 5d, 1d),
                                block(Blocks.PINK_CONCRETE, -1d, 6d, -1d),
                                block(Blocks.PINK_CONCRETE, -1d, 6d, 1d),
                                block(Blocks.PINK_CONCRETE, 1d, 6d, -1d),
                                block(Blocks.PINK_CONCRETE, 1d, 6d, 1d)
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

    private static Pair<BlockState, Vector3d> block(Block block, double x, double y, double z){
        return new Pair<>(block.defaultBlockState(), new Vector3d(x, y, z));
    }
}
