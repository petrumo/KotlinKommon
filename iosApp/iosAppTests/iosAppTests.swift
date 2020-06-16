import XCTest
import SharedCode

class iosAppTests: XCTestCase {
    func testExample() {
        assert(!CommonKt.createApplicationScreenMessage().isEmpty)
    }
}
