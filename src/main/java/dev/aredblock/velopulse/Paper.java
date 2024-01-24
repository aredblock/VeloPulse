package dev.aredblock.velopulse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.aredblock.velopulse.request.Request;
import dev.aredblock.velopulse.utils.HttpRequest;
import org.apache.commons.io.FileUtils;

import java.net.URL;

final class Paper {
    public static int latestVersion(){
        final var gson = new Gson();
        var request = "";

        try {
            request = HttpRequest.request(new URL("https://api.papermc.io/v2/projects/paper/versions/1.20.4/builds/"));
        }catch (Exception e){
            e.printStackTrace();
        }

        final var requestObject = gson.fromJson(request, JsonObject.class);
        final var buildArray = requestObject.get("builds").getAsJsonArray();
        final var builds = buildArray.asList();

        return builds.get(builds.size() - 1).getAsJsonObject().get("build").getAsInt();
    }

    public static void pull(Request request) throws Exception {
        final var latestBuild = latestVersion();
        FileUtils.copyURLToFile(new URL("https://api.papermc.io/v2/projects/paper/versions/1.20.4/builds/" +  latestBuild + "/downloads/paper-1.20.4-" +  latestBuild + ".jar"), request.getDestination());
    }
}
