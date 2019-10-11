package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* This is the latest change to Master */

/* Change made by Editable branch */
/* again */
/* Once again */

/* Change made by Edited_by_another_person */
/* Do these changes stick? */

/* Updating Comments */
/* Editable additional change */
/* Additional change added by Edited by another person */
/* Editable additional change */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String template3 = "How are you?, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value = "/howAreYou", method = RequestMethod.GET)
    public Greeting howAreYou(@RequestParam(value="name", defaultValue="Sir Joe") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template3, name));
    }
}
