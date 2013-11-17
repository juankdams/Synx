import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class cqS
  implements ItemListener
{
  cqS(crA paramcrA)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    cWS.cKD().hV(paramItemEvent.getStateChange() == 1);
  }
}