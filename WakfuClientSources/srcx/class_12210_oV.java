import org.apache.log4j.Logger;

public abstract class oV extends dsv
{
  private static final Logger K = Logger.getLogger(oV.class);
  protected static final byte aUC = 1;
  protected static final byte aUD = 2;

  public static qU b(aYQ paramaYQ, float paramFloat)
  {
    int i = paramaYQ.readByte();
    switch (i) {
    case 1:
      return dft.kZP.s(paramaYQ, paramFloat);
    case 2:
      return crb.iaG.n(paramaYQ, paramFloat);
    }
    K.error("type de condition inconnu " + i);
    return null;
  }

  protected boolean a(qU paramqU1, qU paramqU2)
  {
    return (paramqU1.aYe == paramqU2.aYe) && (paramqU1.aYf == paramqU2.aYf) && (paramqU1.aYg == paramqU2.aYg) && (paramqU1.aYh == paramqU2.aYh) && (paramqU1.aYl == paramqU2.aYl) && (paramqU1.aYj == paramqU2.aYj) && (paramqU1.aYk == paramqU2.aYk) && (paramqU1.aYi == paramqU2.aYi) && (paramqU1.aYm == paramqU2.aYm) && (paramqU1.aYp == paramqU2.aYp) && (paramqU1.aYq == paramqU2.aYq) && (paramqU1.aYr == paramqU2.aYr) && (paramqU1.aYs == paramqU2.aYs) && (paramqU1.aYt == paramqU2.aYt) && (paramqU1.aYu == paramqU2.aYu) && (paramqU1.aYv == paramqU2.aYv) && (paramqU1.aYw == paramqU2.aYw);
  }
}