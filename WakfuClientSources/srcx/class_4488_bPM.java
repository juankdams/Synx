import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class bPM
  implements ItemListener
{
  bPM(alQ paramalQ)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    int i = paramItemEvent.getStateChange() == 1 ? 1 : 0;
    alQ.b(this.esr).cz(i == 0);
  }
}