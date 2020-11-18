package v07.paraellelitaet.javafx;

import javafx.concurrent.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import v07.paraellelitaet.regularthread.SlowCalculatorController;

public class SlowCalculateTask extends Task<String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SlowCalculateTask.class);


    @Override
    protected String call() throws Exception {
        //new thread
        LOGGER.info("Start calculation {}", Thread.currentThread());
        //calculate is slow now - who nows  a way to simulate that?

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                LOGGER.warn("Sleep was interrupted", e);
            }

            updateProgress(i, 10);
            updateMessage(i + "/10 done");
        }

        LOGGER.info("End calculation");

        return "5";
    }
}
