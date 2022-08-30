package multiteam.bloomanddoom.main.growable_flower;

import com.mojang.math.Vector3d;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import oshi.util.tuples.Pair;

import java.util.List;

public class GrowableFlower {
    private final Block flower;
    private final List<Pair<BlockState, Vector3d>> blockStructure;

    public GrowableFlower(Block flower, List<Pair<BlockState, Vector3d>> blockStructure){
        this.flower = flower;
        this.blockStructure = blockStructure;
    }

    public Block getFlower(){return this.flower;}

    public void growAt(BlockPos basePos, ServerLevel level, GrowMethod method){
        for (Pair<BlockState, Vector3d> pair : this.blockStructure) {
            BlockPos currentPos = new BlockPos(basePos.getX()+pair.getB().x, basePos.getY()+pair.getB().y, basePos.getZ()+pair.getB().z);
            switch (method){
                case DEFAULT:
                    level.setBlockAndUpdate(currentPos, pair.getA());
                break;
                case DROP_IF_OCCUPIED:
                    if(level.getBlockState(currentPos).is(pair.getA().getBlock())){
                        level.destroyBlock(currentPos, true);
                    }
                    if(level.getBlockState(currentPos).isAir() || level.getBlockState(currentPos).is(this.flower)){
                        level.setBlockAndUpdate(currentPos, pair.getA());
                    }else{
                        level.addFreshEntity(new ItemEntity(level, basePos.getX(), basePos.getY(), basePos.getZ(), new ItemStack(pair.getA().getBlock().asItem())));
                    }
                break;
            }
        }
    }

    public enum GrowMethod{
        DEFAULT,
        DROP_IF_OCCUPIED
    }
}


