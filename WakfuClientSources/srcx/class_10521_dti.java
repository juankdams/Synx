import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class dti
  implements ItemListener
{
  dti(ceu paramceu)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (ceu.a(this.lvN) != null)
      ceu.a(this.lvN).iP(paramItemEvent.getStateChange() == 1);
  }
}