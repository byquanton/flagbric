package nl.theepicblock.flagbric;

import io.github.fablabsmc.fablabs.impl.bannerpattern.LoomPatternConversions;
import io.github.fablabsmc.fablabs.impl.bannerpattern.LoomPatternRenderContext;
import net.minecraft.item.ItemStack;

import java.awt.*;

public class BannerppHandler {
    public static void onPreRender(ItemStack stack) {
        LoomPatternRenderContext.setLoomPatterns(LoomPatternConversions.makeLoomPatternData(LoomPatternConversions.getLoomPatternTag(stack)));
    }
}
