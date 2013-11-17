import java.awt.Cursor;
import org.apache.log4j.Logger;

public class auk
  implements Xu
{
  private static Logger K = Logger.getLogger(auk.class);
  private Cursor dGx;

  public auk(Cursor paramCursor)
  {
    this.dGx = paramCursor;
  }

  public void show()
  {
    cBQ.cxL().aww().setCursor(this.dGx);
  }

  public void hide()
  {
  }
}