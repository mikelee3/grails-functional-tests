package grails.service.sample

import grails.gorm.transactions.Transactional

@Transactional
class SampleService {

    String serviceMethod() {
        return "Service Method"
    }
}
