package net.landofrails.learnumc;

import net.landofrails.learnumc.items.ItemNormal;
import net.landofrails.learnumc.items.ItemSignalLever;
import net.landofrails.learnumc.items.ItemSignalSO12;

public class LearnUMCItems {
    public static final ItemNormal ITEM_NORMAL = new ItemNormal(LearnUMC.MODID, "ItemNormal");
    public static final ItemSignalSO12 ITEM_SIGNALSO12 = new ItemSignalSO12(LearnUMC.MODID, "ItemSignalSO12");
    public static final ItemSignalLever ITEM_SIGNAL_LEVER = new ItemSignalLever(LearnUMC.MODID, "ItemSignalLever");

    public static void register() {
        // loads static classes and ctrs
    }
}
