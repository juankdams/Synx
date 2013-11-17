import java.util.Comparator;

final class Zl
{
  public static Comparator a(dpI paramdpI, int paramInt1, int paramInt2, short paramShort)
  {
    if (paramdpI.a(PY.coD)) {
      return new cTt();
    }
    if (paramdpI.a(PY.coJ)) {
      return new bkW(paramInt1, paramInt2);
    }
    bbH localbbH = paramdpI.aui();
    if (localbbH == null) {
      return null;
    }
    chY localchY = localbbH.eL();
    switch (dMB.mcM[localchY.ordinal()]) {
    case 1:
      return new bkW(paramInt1, paramInt2);
    }
    return null;
  }
}