package ComponetScanTest;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

    public String teach() {
        return "hii teacher component got called from spring";
    }
}
