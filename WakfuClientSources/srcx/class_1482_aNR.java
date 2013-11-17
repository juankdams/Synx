import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;

class aNR extends ProgressAdapter
{
  aNR(oa paramoa, dqy paramdqy)
  {
  }

  public void completed(ProgressEvent paramProgressEvent)
  {
    hx.aGS.pz();
    this.aAU.getBrowser().removeProgressListener(this);
  }
}