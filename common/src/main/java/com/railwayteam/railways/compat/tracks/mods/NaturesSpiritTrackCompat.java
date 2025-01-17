package com.railwayteam.railways.compat.tracks.mods;

import com.railwayteam.railways.Railways;
import com.railwayteam.railways.compat.Mods;
import com.railwayteam.railways.compat.tracks.GenericTrackCompat;

public class NaturesSpiritTrackCompat extends GenericTrackCompat {
    NaturesSpiritTrackCompat() {
        super(Mods.NATURES_SPIRIT);
    }

    private static boolean registered = false;
    public static void register() {
        if (registered) {
            Railways.LOGGER.error("Duplicate registration of Nature's Spirit track compat");
            return;
        }
        registered = true;
        Railways.LOGGER.info("Registering tracks for Nature's Spirit");
        new NaturesSpiritTrackCompat().register(
                "redwood",
                "sugi",
                "wisteria",
                "fir",
                "willow",
                "aspen",
                "maple",
                "cypress",
                "olive",
                "joshua",
                "ghaf",
                "palo_verde"
        );
    }
}
