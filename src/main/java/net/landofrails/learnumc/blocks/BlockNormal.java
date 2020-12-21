package net.landofrails.learnumc.blocks;

import cam72cam.mod.block.BlockType;
import cam72cam.mod.entity.Player;
import cam72cam.mod.item.ItemStack;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.math.Vec3i;
import cam72cam.mod.util.Facing;
import cam72cam.mod.world.World;

public class BlockNormal extends BlockType {
    /**
     * Construct a new BlockType (backed by a std minecraft block)<br>
     * <br>
     * Should be called during ModEvent.CONSTRUCT
     *
     * @param modID
     * @param name
     */
    public BlockNormal(String modID, String name) {
        super(modID, name);
    }

    @Override
    public boolean tryBreak(World world, Vec3i pos, Player player) {
        return false;
    }

    @Override
    public void onBreak(World world, Vec3i pos) {
        //Do nothing
    }

    @Override
    public boolean onClick(World world, Vec3i pos, Player player, Player.Hand hand, Facing facing, Vec3d hit) {
        return false;
    }

    @Override
    public ItemStack onPick(World world, Vec3i pos) {
        return null;
    }

    @Override
    public void onNeighborChange(World world, Vec3i pos, Vec3i neighbor) {
        //Do nothing
    }
}
