import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Event;

class axH extends KeyAdapter
{
  axH(pC parampC)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.keyCode == 13) || (paramKeyEvent.character == ' ')) {
      Event localEvent = new Event();
      this.dMT.notifyListeners(13, localEvent);
    }
  }
}