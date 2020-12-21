package net.landofrails.learnumc;

import net.landofrails.learnumc.blocks.BlockSignalLever;
import net.landofrails.learnumc.blocks.BlockSignalSO12;

public class LearnUMCBlocks {
    //    public static final BlockNormal BLOCK_NORMAL = new BlockNormal(LearnUMC.MODID, "BlockNormal");
    public static final BlockSignalSO12 BLOCK_SIGNAL_SO_12 = new BlockSignalSO12(LearnUMC.MODID, "BlockSignalSO12");
    public static final BlockSignalLever BLOCK_SIGNAL_LEVER = new BlockSignalLever(LearnUMC.MODID, "BlockSignalLever");

    public static void register() {
        // loads static classes and ctrs
    }
}
