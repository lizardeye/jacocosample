package sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = TestApplicationStarter.class)
@ExtendWith(SpringExtension.class)
public class SampleTest {

    @Autowired
    private SampleService sampleService;

    @Test
    public void sampleTest(){
        assert 1==1;
    }

    @Test
    public void doWork(){
        sampleService.doWork();
    }
}
