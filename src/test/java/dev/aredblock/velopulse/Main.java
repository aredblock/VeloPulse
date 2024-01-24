package dev.aredblock.velopulse;

import dev.aredblock.velopulse.request.Request;

import java.io.File;

public final class Main {
    public static void main(String[] args) throws Exception {
        VeloPulse.pull(new Request(Provider.VELOCITY,new File("velocity-latest.jar")));
    }
}
