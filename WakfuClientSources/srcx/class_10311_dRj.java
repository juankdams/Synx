import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class dRj
  implements ItemListener
{
  dRj(csH paramcsH)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    btL.gcv.fn(paramItemEvent.getStateChange() == 1);
  }
}