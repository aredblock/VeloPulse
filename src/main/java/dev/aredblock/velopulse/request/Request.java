package dev.aredblock.velopulse.request;

import dev.aredblock.velopulse.Provider;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.File;

/** Request is a provider for the various download information
 * @author aredblock
 * @since 0.5
 */
@AllArgsConstructor
@Getter
public final class Request {
    /** Provider specifies which software is to be used
     */
    private final Provider provider;
    private final File destination;
}
