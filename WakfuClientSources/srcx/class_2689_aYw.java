import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aYw extends bLQ
{
  private final FT feu;
  private final FT bGR;
  private final FT bGS;

  public aYw(String paramString, dNt paramdNt, dUl paramdUl)
  {
    super(paramString, paramdNt, paramdUl);
    this.feu = ((FT)a(new FT("total", this, paramdUl)));
    this.bGR = ((FT)a(new FT("min", this, paramdUl)));
    this.bGS = ((FT)a(new FT("max", this, paramdUl)));
  }

  public void e(cbQ paramcbQ)
  {
    long l1 = 0L;
    long l2 = 9223372036854775807L;
    long l3 = -9223372036854775808L;
    for (int i = 0; i < paramcbQ.size(); i++) {
      long l4 = paramcbQ.uD(i);
      l1 += l4;
      if (l4 < l2) {
        l2 = l4;
      }
      if (l4 > l3) {
        l3 = l4;
      }
    }
    this.feu.fM(l1);
    this.bGR.fM(l2);
    this.bGS.fM(l3);
  }

  public void a(cXr paramcXr) {
    a(paramcXr, cdG.hxu);
    paramcXr.jn(this.feu.getValue());
    paramcXr.jn(this.bGR.getValue());
    paramcXr.jn(this.bGS.getValue());
  }

  public void a(ByteBuffer paramByteBuffer, String paramString) {
    if (this.mee != dUl.mrx) {
      K.warn("ATTENTION! Le noeud MultipleValuesPropertyNode ne supporte pas d'autre mode de fusion que REPLACE pour l'instant");
    }
    this.feu.fM(paramByteBuffer.getLong());
    this.bGR.fM(paramByteBuffer.getLong());
    this.bGS.fM(paramByteBuffer.getLong());
  }
}