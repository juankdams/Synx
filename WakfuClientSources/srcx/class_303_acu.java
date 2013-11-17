import java.awt.font.GlyphVector;

class acu
  implements dGy
{
  private acu(aHl paramaHl)
  {
  }

  public boolean a(dVv paramdVv)
  {
    if (!paramdVv.Du()) {
      GlyphVector localGlyphVector = paramdVv.dvr();
      akR localakR = (akR)aHl.a(this.cSj).get(localGlyphVector.getFont());
      if (localakR != null) {
        localakR.remove(dVv.b(paramdVv));
      }
      paramdVv.release();
    } else {
      paramdVv.ae(false);
    }
    return true;
  }
}