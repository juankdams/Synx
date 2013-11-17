import java.util.ArrayList;

public class cOr
{
  private static final adz kwS = new adz();

  private static final dGy kwT = new cMR();

  public static void execute()
  {
    if (!ayg.aJQ().ais()) {
      return;
    }
    ctR localctR = cGm();

    kr localkr = kwS.apz();
    while (localkr.hasNext()) {
      i = localkr.next();
      if (!localctR.contains(i)) {
        aWc.blo().b(new cld(null, wK.dq(i), (short)0));
      }
      localkr.remove();
    }

    int i = 0; for (int j = localctR.size(); i < j; i++) {
      kwS.hL(localctR.uM(i));
      aWc.blo().b(new cld(null, wK.dq(localctR.uM(i)), (short)localctR.wI(i)));
    }
  }

  private static ctR cGm() {
    ctR localctR = new ctR();

    V(new cMM(localctR));

    return localctR;
  }

  public static void cGn() {
    if (!ayg.aJQ().ais())
      return;
    V(kwT);
  }

  private static void V(dGy paramdGy)
  {
    ArrayList localArrayList = ayg.aJQ().aJS();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dWu localdWu = (dWu)localArrayList.get(i);
      if ((localdWu instanceof Em)) {
        Em localEm = (Em)localdWu;
        if (localEm.isVisible())
          paramdGy.d(localEm);
      }
    }
  }
}