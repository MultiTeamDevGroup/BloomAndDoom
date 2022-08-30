package multiteam.bloomanddoom.main.growable_flower;

import com.mojang.math.Vector3d;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import oshi.util.tuples.Pair;

import java.util.List;

public class GrowableFlower {
    private Block flower;
    private List<Pair<BlockState, Vector3d>> blockStructure;

    public GrowableFlower(Block flower, List<Pair<BlockState, Vector3d>> blockStructure){
        this.flower = flower;
        this.blockStructure = blockStructure;
    }

    public Block getFlower(){return this.flower;}

    public void growAt(BlockPos basePos, ServerLevel level){
        for (Pair<BlockState, Vector3d> pair : blockStructure) {
            BlockPos currentPos = new BlockPos(basePos.getX()+pair.getB().x, basePos.getY()+pair.getB().y, basePos.getZ()+pair.getB().z);
            level.setBlockAndUpdate(currentPos, pair.getA());
        }
    }
}
