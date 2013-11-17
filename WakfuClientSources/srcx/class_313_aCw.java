import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class aCw
  implements ItemListener
{
  aCw(cNk paramcNk)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (this.dXg.fZp == null)
      return;
    boolean bool = paramItemEvent.getStateChange() == 1;
    this.dXg.fZp.rs().fM(bool);
  }
}