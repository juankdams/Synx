import java.util.ArrayList;
import org.apache.log4j.Logger;

public class rs
{
  protected static final Logger K = Logger.getLogger(rs.class);
  public static final int aZA = 20015;
  protected final adz aZB = new adz();

  public boolean cB(int paramInt) {
    return this.aZB.hL(paramInt);
  }

  public final boolean cC(int paramInt) {
    return this.aZB.contains(paramInt);
  }

  public void clear() {
    this.aZB.clear();
  }

  public void a(bFj parambFj)
  {
    for (kr localkr = this.aZB.apz(); localkr.hasNext(); ) {
      daX localdaX = new daX();
      localdaX.kSV = localkr.next();
      parambFj.gAo.add(localdaX);
    }
  }

  public final void b(bFj parambFj) {
    for (int i = 0; i < parambFj.gAo.size(); i++)
      cB(((daX)parambFj.gAo.get(i)).kSV);
  }

  public String toString()
  {
    return "EmoteHandler{m_knownEmotes=" + this.aZB + '}';
  }
}