import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.ListModel;

class diI extends MouseAdapter
{
  private diI(aLq paramaLq)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.getClickCount() == 2) {
      int i = aLq.c(this.cSK).locationToIndex(paramMouseEvent.getPoint());
      ListModel localListModel = aLq.c(this.cSK).getModel();
      vf localvf = (vf)localListModel.getElementAt(i);

      aLq.c(this.cSK).ensureIndexIsVisible(i);

      bsz localbsz = WakfuClientInstance.awy().awZ();
      localbsz.fY(localvf.eW());
    }
  }
}