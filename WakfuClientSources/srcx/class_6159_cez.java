import org.apache.log4j.Logger;

public class cez extends bwH
{
  protected void a(dWu paramdWu, apV paramapV)
  {
    int[] arrayOfInt = paramapV.cZ(paramdWu.getId());
    if ((!bB) && (arrayOfInt == null)) throw new AssertionError("element interactif " + paramdWu.getId() + " n'a pas de vue");
    for (int i = 0; i < arrayOfInt.length; i++) {
      int j = arrayOfInt[i];
      if (K.isTraceEnabled())
        K.trace("Adding view " + j + " to element " + paramdWu.getId());
      abc localabc = va(j);
      if (localabc != null)
        paramdWu.c(localabc);
    }
  }

  public abc va(int paramInt) {
    return ((cfx)this.ghg).va(paramInt);
  }
}