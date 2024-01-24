package dev.aredblock.velopulse;

import dev.aredblock.velopulse.request.Request;
import org.jetbrains.annotations.NotNull;

/**
 * @author aredblock
 * @since 0.5
 */
public final class VeloPulse {

    /** Creates a pull request to download a software
     * @param request The information about the desired software
     * @throws Exception
     */
    public static void pull(@NotNull Request request) throws Exception {
        if(request.getProvider().equals(Provider.VELOCITY)){
            Velocity.pull(request);
        } else if (request.getProvider().equals(Provider.PAPER)) {
            Paper.pull(request);
        }
    }
}
