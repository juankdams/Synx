import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class dtf
{
  public static final dtf lvw = new dtf();

  protected static final Logger K = Logger.getLogger(dtf.class);

  public static dtf cZk()
  {
    return lvw;
  }

  public Iterable a(alr paramalr, bcJ parambcJ, bbH parambbH, int paramInt1, int paramInt2, short paramShort)
  {
    if ((parambbH == null) || (parambcJ == null))
      return new azV();
    int i = 0;
    int j = 0;
    short s = 0;
    if (paramalr != null) {
      i = paramalr.fa();
      j = paramalr.fb();
      s = paramalr.fc();
    }

    CG localCG = paramalr == null ? CG.bFP : paramalr.E();
    return parambbH.a(i, j, s, paramInt1, paramInt2, paramShort, localCG, parambcJ.Lz());
  }

  public Iterable a(alr paramalr, bcJ parambcJ, bbH parambbH, int paramInt1, int paramInt2, short paramShort, dRh paramdRh)
  {
    if (paramdRh == null) {
      return a(paramalr, parambcJ, parambbH, paramInt1, paramInt2, paramShort);
    }

    if ((parambbH == null) || (parambcJ == null)) {
      return new azV();
    }
    LinkedList localLinkedList = new LinkedList();

    for (Iterator localIterator1 = parambcJ.Lz(); localIterator1.hasNext(); ) {
      alr localalr1 = (alr)localIterator1.next();
      Cs localCs = paramdRh.a(localalr1, paramalr);

      switch (cSQ.hfz[((btH)localCs.getFirst()).ordinal()]) {
      case 1:
        localLinkedList.add(localalr1);
        break;
      case 2:
        int i = 0;
        int j = 0;
        short s = 0;
        CG localCG = CG.bFM;
        if (paramalr != null) {
          i = paramalr.fa();
          j = paramalr.fb();
          s = paramalr.fc();
          localCG = paramalr.E();
        }
        if (parambbH.b(paramInt1, paramInt2, paramShort, i, j, s, localCG, localalr1.fa(), localalr1.fb(), localalr1.fc(), localalr1.afD()))
          localLinkedList.add(localalr1); break;
      case 3:
        for (alr localalr2 : (ArrayList)localCs.Lp()) {
          localLinkedList.add(localalr2);
        }

      }

    }

    return localLinkedList;
  }
}