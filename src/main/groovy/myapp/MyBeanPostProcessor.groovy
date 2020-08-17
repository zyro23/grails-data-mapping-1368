package myapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component

@Component
class MyBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    DummyDataService dummyDataService

}
