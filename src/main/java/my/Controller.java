package my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @Autowired
    private MessageService service;

    public MessageService getService() {
        return service;
    }
}
