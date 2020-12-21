package net.landofrails.learnumc.items;

import cam72cam.mod.entity.Player;
import cam72cam.mod.item.ClickResult;
import cam72cam.mod.item.CreativeTab;
import cam72cam.mod.item.CustomItem;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.math.Vec3i;
import cam72cam.mod.util.Facing;
import cam72cam.mod.world.World;
import net.landofrails.learnumc.LearnUMCBlocks;
import net.landofrails.learnumc.LearnUMCTabs;

import java.util.Collections;
import java.util.List;

public class ItemSignalSO12 extends CustomItem {
    public ItemSignalSO12(String modID, String name) {
        super(modID, name);
    }

    @Override
    public List<CreativeTab> getCreativeTabs() {
        return Collections.singletonList(LearnUMCTabs.MAIN_TAB);
    }

    @Override
    public ClickResult onClickBlock(Player player, World world, Vec3i pos, Player.Hand hand, Facing facing, Vec3d inBlockPos) {
        world.setBlock(pos.offset(facing), LearnUMCBlocks.BLOCK_SIGNAL_SO_12);
        return ClickResult.ACCEPTED;
    }
}
