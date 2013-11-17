import org.eclipse.swt.browser.LocationAdapter;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.widgets.Text;

class bVi extends LocationAdapter
{
  bVi(dqy paramdqy, Text paramText)
  {
  }

  public void changed(LocationEvent paramLocationEvent)
  {
    this.hhm.setText(paramLocationEvent.location);
  }
}