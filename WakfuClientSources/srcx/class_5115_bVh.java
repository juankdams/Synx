import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;

class bVh extends ProgressAdapter
{
  bVh(dqy paramdqy)
  {
  }

  public void completed(ProgressEvent paramProgressEvent)
  {
    dqy.d(this.hhl).setVisible(false);
    dqy.d(this.hhl).stop();
  }
}