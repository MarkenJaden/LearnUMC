package net.landofrails.learnumc;

import net.landofrails.learnumc.items.ItemNormal;
import net.landofrails.learnumc.items.ItemSignalLever;
import net.landofrails.learnumc.items.ItemSignalSO12;
import net.landofrails.learnumc.items.ItemVr0_Hv_Vorsignal;

public class LearnUMCItems {
    public static final ItemNormal ITEM_NORMAL = new ItemNormal(LearnUMC.MODID, "ItemNormal");
    public static final ItemSignalSO12 ITEM_SIGNALSO12 = new ItemSignalSO12(LearnUMC.MODID, "ItemSignalSO12");
    public static final ItemSignalLever ITEM_SIGNAL_LEVER = new ItemSignalLever(LearnUMC.MODID, "ItemSignalLever");
    public static final ItemVr0_Hv_Vorsignal ITEM_VR_0_HV_VORSIGNAL = new ItemVr0_Hv_Vorsignal(LearnUMC.MODID, "ItemVr0_Hv_Vorsignal");

    public static void register() {
        // loads static classes and ctrs
    }
}
