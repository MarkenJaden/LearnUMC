package net.landofrails.learnumc.items;

import cam72cam.mod.item.CreativeTab;
import cam72cam.mod.item.CustomItem;
import net.landofrails.learnumc.LearnUMCTabs;

import java.util.Collections;
import java.util.List;

public class ItemNormal extends CustomItem {
    public ItemNormal(String modID, String name) {
        super(modID, name);
    }

    @Override
    public List<CreativeTab> getCreativeTabs() {
        return Collections.singletonList(LearnUMCTabs.MAIN_TAB);
    }
}
