package net.landofrails.learnumc.tile;

import cam72cam.mod.block.BlockEntityTickable;
import cam72cam.mod.entity.Player;
import cam72cam.mod.entity.boundingbox.IBoundingBox;
import cam72cam.mod.item.ItemStack;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.util.Facing;
import net.landofrails.learnumc.LearnUMCItems;

public class TileSignalLever extends BlockEntityTickable {
    private double fullHeight = 0;
    private double fullWidth = 0;
    private double fullLength = 0;

    private long ticks;
    private int leverRotate = 0;
    private float blockRotate;

    private boolean activated = false;

    public TileSignalLever(float rot) {
        this.blockRotate = rot;
    }

    @Override
    public ItemStack onPick() {
        return new ItemStack(LearnUMCItems.ITEM_SIGNAL_LEVER, 1);
    }

    @Override
    public IBoundingBox getBoundingBox() {
        return IBoundingBox.ORIGIN.expand(new Vec3d(fullLength, fullHeight, fullWidth)).offset(new Vec3d(0.5 - fullLength / 2, 0, 0.5 - fullWidth / 2));
    }

    @Override
    public boolean onClick(Player player, Player.Hand hand, Facing facing, Vec3d hit) {
        activated = !activated;
//        this.markDirty();
        return true;
    }

    @Override
    public void update() {
        if (activated && leverRotate < 40) {
            leverRotate++;
        } else if (!activated && leverRotate > 0) {
            leverRotate--;
        }
    }

    public long getLeverRotate() {
        return this.leverRotate;
    }

    public void setFullHeight(double fullHeight) {
        this.fullHeight = fullHeight;
    }

    public void setFullWidth(double fullWidth) {
        this.fullWidth = fullWidth;
    }

    public void setFullLength(double fullLength) {
        this.fullLength = fullLength;
    }

    public boolean isActivated() {
        return activated;
    }

    public float getBlockRotate() {
        return blockRotate;
    }

    public void setBlockRotate(float blockRotate) {
        this.blockRotate = blockRotate;
    }
}
