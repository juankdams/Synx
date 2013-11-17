import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class cqP
  implements ItemListener
{
  cqP(crA paramcrA)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    cDz.iwP.hV(paramItemEvent.getStateChange() == 1);
  }
}