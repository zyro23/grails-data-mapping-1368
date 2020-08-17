package myapp

import grails.gorm.services.Service

@Service(Dummy)
interface DummyDataService {

    List<Dummy> list()

}