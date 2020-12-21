package net.landofrails.learnumc;

import cam72cam.mod.item.CreativeTab;
import cam72cam.mod.item.ItemStack;

public class LearnUMCTabs {

    public static CreativeTab MAIN_TAB;

    static {
        MAIN_TAB = new CreativeTab(LearnUMC.MODID + ".main", () -> new ItemStack(LearnUMCItems.ITEM_SIGNALSO12, 1));
    }

}
