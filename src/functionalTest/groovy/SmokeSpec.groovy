import geb.spock.GebSpec

class SmokeSpec extends GebSpec {
    void "main page title should be 'Home'"() {
        when:
        go ''

        then:
        title == 'Home'
    }
}
