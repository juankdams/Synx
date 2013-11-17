import java.awt.font.GlyphVector;
import java.util.ArrayList;
import java.util.List;

class cBt
{
  final List isy = new ArrayList();

  final cSR isz = new cSR();

  cBt(cLb paramcLb) {
  }

  public List mF(String paramString) {
    this.isy.clear();

    int i = 0; for (int j = paramString.length(); i < j; i++) {
      this.isy.add(P(paramString.charAt(i)));
    }

    return this.isy;
  }

  public void clearCacheEntry(int paramInt)
  {
    dov localdov = (dov)this.isz.remove(paramInt);
    if (localdov != null)
      localdov.clear();
  }

  public void clearAllCacheEntries()
  {
    this.isz.a(new bJi(this));

    this.isz.clear();
  }

  public void a(dov paramdov) {
    this.isz.put(paramdov.getUnicodeID(), paramdov);
  }

  private dov P(char paramChar) {
    dov localdov = (dov)this.isz.get(paramChar);
    if (localdov == null) {
      GlyphVector localGlyphVector = aHl.eeV.a(paramChar, cLb.s(this.dXC), this.dXC.getFontRenderContext());
      int i = localGlyphVector.getGlyphCode(0);

      localdov = new dov(this.dXC, paramChar, i, localGlyphVector, this);

      a(localdov);
    }
    return localdov;
  }
}