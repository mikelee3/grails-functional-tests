package grails.service.sample

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class SampleServiceSpec extends Specification implements ServiceUnitTest<SampleService>, DataTest {

    void "test serviceMethod"() {
        when:
        String result = service.serviceMethod()

        then:
        result == "Service Method"
    }
}
