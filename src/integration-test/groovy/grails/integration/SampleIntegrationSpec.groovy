package grails.integration

import grails.gorm.transactions.Rollback
import grails.service.sample.SampleService
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class SampleIntegrationSpec extends Specification {

    SampleService sampleService

    void 'check integration tests'() {
        when:
        String result = sampleService.serviceMethod()

        then:
        result == "Service Method"
    }
}
