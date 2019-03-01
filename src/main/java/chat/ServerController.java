package chat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ServerController {

    @RequestMapping(value = "/server", method = RequestMethod.GET)
    public Server[] getServers() {
        Server[] serverArray = new Server[3];
        serverArray[0] = new Server(1, "reactiflux");
        serverArray[1] = new Server(2, "rust-serer");
        serverArray[2] = new Server(3, "amethyst");
        return serverArray;
    }

    @RequestMapping(value = "/server", method = RequestMethod.POST)
    public String postServer() {
        return "You have posted a server";
    }
}