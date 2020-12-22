package net.landofrails.learnumc;

import cam72cam.mod.ModCore;
import cam72cam.mod.ModEvent;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.render.BlockRender;
import cam72cam.mod.render.ItemRender;
import cam72cam.mod.resource.Identifier;
import net.landofrails.learnumc.render.block.TileSignalLeverRender;
import net.landofrails.learnumc.render.block.TileSignalSO12Render;
import net.landofrails.learnumc.render.block.TileVr0_Hv_VorsignalRender;
import net.landofrails.learnumc.render.item.ObjItemRender;
import net.landofrails.learnumc.tile.TileSignalLever;
import net.landofrails.learnumc.tile.TileSignalSO12;
import net.landofrails.learnumc.tile.TileVr0_Hv_Vorsignal;

//1.12.2
@net.minecraftforge.fml.common.Mod(modid = LearnUMC.MODID, name = "Learn UMC", version = "0.0.1", dependencies = "required-after:universalmodcore@[1.0,1.1)", acceptedMinecraftVersions = "[1.12,1.13)")
//1.7.10
//@cpw.mods.fml.common.Mod(modid = LearnUMC.MODID, name = "Learn UMC", version = "0.0.1", dependencies = "required-after:universalmodcore@[1.0,1.1)", acceptedMinecraftVersions = "[1.7.10,1.10)")
//1.16.4
//@net.minecraftforge.fml.common.Mod(LearnUMC.MODID)
//@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = LearnUMC.MODID, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)
public class LearnUMC extends ModCore.Mod {
    public static final String MODID = "learnumc";

    static {
        try {
            ModCore.register(new net.landofrails.learnumc.LearnUMC());
        } catch (Exception e) {
            throw new RuntimeException("Could not load mod " + MODID, e);
        }
    }

    //1.16.4
//    @SubscribeEvent
//    public static void genData(GatherDataEvent event) {
//        ModCore.genData(MODID, event);
//    }

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
                BlockRender.register(LearnUMCBlocks.BLOCK_VR_0_HV_VORSIGNAL, TileVr0_Hv_VorsignalRender::render, TileVr0_Hv_Vorsignal.class);

                ItemRender.register(LearnUMCItems.ITEM_NORMAL, new Identifier(LearnUMC.MODID, "items/katanagear"));
                ItemRender.register(LearnUMCItems.ITEM_SIGNALSO12, ObjItemRender.getModelFor(new Identifier(LearnUMC.MODID, "models/item/so12/signalso12.obj"), new Vec3d(0.5, 0, 0.5), 2));
                ItemRender.register(LearnUMCItems.ITEM_SIGNAL_LEVER, ObjItemRender.getModelFor(new Identifier(LearnUMC.MODID, "models/block/signalslever/signalslever.obj"), new Vec3d(0.5, 0.6, 0.5), 1));
                ItemRender.register(LearnUMCItems.ITEM_VR_0_HV_VORSIGNAL, ObjItemRender.getModelFor(new Identifier(LearnUMC.MODID, "models/block/vr0_hv_vorsignal/vr0_hv_vorsignal.obj"), new Vec3d(0.5, 0, 0.5), 1));
                break;
        }
    }

    @Override
    public void serverEvent(ModEvent event) {

    }
}
