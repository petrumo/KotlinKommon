import UIKit
import SharedCode

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = CommonKt.createApplicationScreenMessage()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}
