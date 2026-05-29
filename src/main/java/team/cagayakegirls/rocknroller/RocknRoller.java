package team.cagayakegirls.rocknroller;

import fi.dy.masa.itemscroller.ItemScroller;
import fi.dy.masa.itemscroller.compat.modmenu.ModMenuImpl;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = RocknRoller.MOD_ID, dist = Dist.CLIENT)
public class RocknRoller {
    public static final String MOD_ID = "rocknroller";

    public RocknRoller(ModContainer modContainer) {
        if (FMLLoader.getCurrent().getDist().isClient()) {
            modContainer.registerExtensionPoint(IConfigScreenFactory.class, new ModMenuImpl().getModConfigScreenFactory());
            new ItemScroller().onInitialize();
        }
    }
}
