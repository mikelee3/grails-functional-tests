package grails.geb

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class SampleGebSpec extends GebSpec {
    void 'check _h1_ header'() {
        when:
        go '/'

        then:
        $('h1').text() == 'Welcome to Grails'
    }
}
