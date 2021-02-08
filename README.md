# Functional Test Example

This is a proof of concept for adding a separate location for functional tests.

## Separates rollback (integration) and non-rollback (functional, geb) tests

Creates Gradle functional test implementation so that you can keep functional tests (i.e. tests that don't roll back)
separate from integration tests that do roll back.

This delineation is a bit arbitrary, but helps keep different kinds of tests separate. This separation was available in
Grails 2.

## Command Line

Just run unit and integration tests normally.

For functional tests, use the functionalTest Gradle task. All options should work like other Gradle test
tasks:

    ./gradlew functionalTest

## Notes

* Functional test code should go into the src/functional-test/groovy directory. 

* The GebConfig.groovy file gets moved to src/functional-test/resources.

* Removes the Grails Geb plugin and uses Geb directly. This way we can upgrade / tweak Geb
  independent of Grails itself.

* In the build.gradle file, we move Geb and associated libraries to the functionalTest scope so
  that the Geb, Selenium, and supporting libraries are separate from our regular integration tests.

## See

* https://blog.inspeerity.com/gradle/integration-and-unit-separate-gradle-tasks/
* https://guides.grails.org/grails-geb-multiple-browsers/guide/index.html
* https://docs.gradle.org/current/userguide/java_testing.html#sec:configuring_java_integration_tests