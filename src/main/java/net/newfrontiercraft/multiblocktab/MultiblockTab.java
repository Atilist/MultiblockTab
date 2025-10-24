package net.newfrontiercraft.multiblocktab;

import net.modificationstation.stationapi.api.util.Namespace;
import org.apache.logging.log4j.Logger;

public class MultiblockTab {
    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static final Logger LOGGER = NAMESPACE.getLogger();
}
