import java.awt.font.GlyphVector;
import org.apache.log4j.Logger;

class dVv
  implements bBz
{
  private static final aee aOr = new bOO(new aNO());
  private boolean muq;
  private GlyphVector mur;
  private String bFu;

  public static dVv a(GlyphVector paramGlyphVector, String paramString)
  {
    dVv localdVv;
    try
    {
      localdVv = (dVv)aOr.Mm();
    } catch (Exception localException) {
      aHl.i().error("Problème au borrowObject.");
      localdVv = new dVv();
      localdVv.aJ();
    }
    localdVv.mur = paramGlyphVector;
    localdVv.bFu = paramString;
    return localdVv;
  }

  public GlyphVector dvr()
  {
    return this.mur;
  }

  public void ae(boolean paramBoolean) {
    this.muq = paramBoolean;
  }

  public boolean Du() {
    return this.muq;
  }

  private String getValue() {
    return this.bFu;
  }

  public void aJ() {
    this.muq = true;
  }

  public void bc() {
    this.mur = null;
    this.bFu = null;
  }

  public void release() {
    try {
      aOr.y(this);
    } catch (Exception localException) {
      bc();
    }
  }
}