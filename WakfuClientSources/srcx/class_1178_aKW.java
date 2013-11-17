import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.log4j.Logger;

public final class aKW extends bLQ
{
  aKW(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
  }

  public cdG bcH() {
    return cdG.hxt;
  }

  public final aKW gR(String paramString) {
    dNt localdNt = (dNt)byb().get(paramString);
    if ((localdNt != null) && ((localdNt instanceof aKW)))
      return (aKW)localdNt;
    return (aKW)a(new aKW(paramString, this, dUl.mrx));
  }

  public final aKW gS(String paramString) {
    return (aKW)a(new aKW(paramString, this, dUl.mrx));
  }

  public final boq a(String paramString, dUl paramdUl) {
    dNt localdNt = (dNt)byb().get(paramString);
    if ((localdNt != null) && ((localdNt instanceof boq)))
      return (boq)localdNt;
    return (boq)a(new boq(paramString, this, paramdUl));
  }

  public final boq b(String paramString, dUl paramdUl) {
    return (boq)a(new boq(paramString, this, paramdUl));
  }

  public final cvU c(String paramString, dUl paramdUl) {
    return (cvU)a(new cvU(paramString, this, paramdUl));
  }

  public final aYw d(String paramString, dUl paramdUl) {
    return (aYw)a(new aYw(paramString, this, paramdUl));
  }

  public final cAs e(String paramString, dUl paramdUl) {
    return (cAs)a(new cAs(paramString, this, paramdUl));
  }

  public final CL f(String paramString, dUl paramdUl) {
    return (CL)a(new CL(paramString, this, paramdUl));
  }

  public void a(cXr paramcXr) {
    a(paramcXr, cdG.hxt);
    paramcXr.dT((short)byb().size());
    for (dNt localdNt : byb().values())
      localdNt.a(paramcXr);
  }

  public void a(ByteBuffer paramByteBuffer, String paramString)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[paramByteBuffer.get() & 0xFF];
      paramByteBuffer.get(arrayOfByte);
      String str = dzp.aJ(arrayOfByte);
      int k = paramByteBuffer.get() & 0xFF;
      int m = paramByteBuffer.get() & 0xFF;
      cdG localcdG = cdG.values()[k];
      dUl localdUl = dUl.values()[m];
      dNt localdNt1 = rx(str);
      if (localdNt1 != null) {
        if (localdNt1.dpY() == localdUl)
          localdNt1.a(paramByteBuffer, paramString);
        else
          K.error("Impossible de fusionner des nodes de mergeMode différents : " + localdNt1.dpY() + " != " + localdUl);
      }
      else {
        dNt localdNt2 = a(localcdG.cgv().a(str, this, localdUl));
        localdNt2.a(paramByteBuffer, paramString);
      }
    }
  }
}