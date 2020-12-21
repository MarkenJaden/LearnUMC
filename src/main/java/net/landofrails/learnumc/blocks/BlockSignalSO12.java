package net.landofrails.learnumc.blocks;

import cam72cam.mod.block.BlockEntity;
import cam72cam.mod.block.BlockTypeEntity;
import net.landofrails.learnumc.tile.TileSignalSO12;

public class BlockSignalSO12 extends BlockTypeEntity {
    public BlockSignalSO12(String modID, String name) {
        super(modID, name);
    }

    @Override
    protected BlockEntity constructBlockEntity() {
        return new TileSignalSO12();
    }
}
