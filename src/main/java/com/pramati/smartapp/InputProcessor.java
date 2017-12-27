package com.pramati.smartapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * This class contains the logic to process input recieved from chat bot.
 */
@Component
public class InputProcessor {

    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * This method processes incoming messages and return responses.
     *
     * @param message a message coming from a human user in a chat
     * @return the reply of the bot.
     * @throws Exception if the input is null.
     */
    public String process(String message) throws Exception {
        if (message == null) {
            throw new Exception("Please send some message");
        }

        log.info("Received message: {}", message);

        return "You just said \"" + message.replace("\"", "-") + "\" !";
    }

}
