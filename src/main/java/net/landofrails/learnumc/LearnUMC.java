package net.landofrails.learnumc;

import cam72cam.mod.ModCore;
import cam72cam.mod.ModEvent;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.render.BlockRender;
import cam72cam.mod.render.ItemRender;
import cam72cam.mod.resource.Identifier;
import net.landofrails.learnumc.render.block.TileSignalLeverRender;
import net.landofrails.learnumc.render.block.TileSignalSO12Render;
import net.landofrails.learnumc.render.item.ObjItemRender;
import net.landofrails.learnumc.tile.TileSignalLever;
import net.landofrails.learnumc.tile.TileSignalSO12;

@net.minecraftforge.fml.common.Mod(modid = LearnUMC.MODID, name = "Learn UMC", version = "0.0.1", dependencies = "required-after:universalmodcore@[1.0,1.1)", acceptedMinecraftVersions = "[1.12,1.13)")
public class LearnUMC extends ModCore.Mod {
    public static final String MODID = "learnumc";

    static {
        try {
            ModCore.register(new net.landofrails.learnumc.LearnUMC());
        } catch (Exception e) {
            throw new RuntimeException("Could not load mod " + MODID, e);
        }
    }

    @Override
    public String modID() {
        return MODID;
    }

    @Override
    public void commonEvent(ModEvent event) {

        switch (event) {
            case START:
                ModCore.Mod.info("Start learning process...");
                break;
            case CONSTRUCT:
                LearnUMCBlocks.register();
                LearnUMCItems.register();
        }

    }

    @Override
    public void clientEvent(ModEvent event) {
        switch (event) {
            case CONSTRUCT:
                BlockRender.register(LearnUMCBlocks.BLOCK_SIGNAL_SO_12, TileSignalSO12Render::render, TileSignalSO12.class);
                BlockRender.register(LearnUMCBlocks.BLOCK_SIGNAL_LEVER, TileSignalLeverRender::render, TileSignalLever.class);

                ItemRender.register(LearnUMCItems.ITEM_NORMAL, new Identifier(LearnUMC.MODID, "items/katanagear"));
                ItemRender.register(LearnUMCItems.ITEM_SIGNALSO12, ObjItemRender.getModelFor(new Identifier(LearnUMC.MODID, "models/item/so12/signalso12.obj"), new Vec3d(0.5, 0, 0.5), 2));
                ItemRender.register(LearnUMCItems.ITEM_SIGNAL_LEVER, ObjItemRender.getModelFor(new Identifier(LearnUMC.MODID, "models/block/signalslever/signalslever.obj"), new Vec3d(0.5, 0.6, 0.5), 1));
                break;
        }
    }

    @Override
    public void serverEvent(ModEvent event) {

    }
}
