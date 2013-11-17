import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

class bVe
  implements Listener
{
  bVe(dqy paramdqy, Text paramText)
  {
  }

  public void handleEvent(Event paramEvent)
  {
    dqy.c(this.hhl).setUrl(this.hhm.getText());
  }
}