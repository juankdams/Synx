import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class vC extends csx
{
  public ArrayList Et()
  {
    ArrayList localArrayList = new ArrayList();
    ayn localayn = bWW.ccf().FB();
    if (localayn == null) {
      return localArrayList;
    }
    aYr localaYr = localayn.ava();

    dqU localdqU = Ew();
    if (localdqU == dqU.ltp) {
      return localArrayList;
    }

    if (byv.bFN().bFO().cJf().HL()) {
      return localArrayList;
    }

    int i = Ey().size() > 0 ? 1 : 0;
    int j = EA().size() > 0 ? 1 : 0;
    int k = Ex().size() > 0 ? 1 : 0;
    int m = Ez().size() > 0 ? 1 : 0;

    if (localdqU == dqU.ltq) {
      if (Ev())
        localArrayList.add(new Nh("6001020.xps"));
    }
    else if (((i != 0) && (j != 0)) || ((k != 0) && (m != 0)) || ((i != 0) && (m != 0)) || ((j != 0) && (k != 0)))
      localArrayList.add(new Nh("800224.xps"));
    else if (k != 0)
      localArrayList.add(new Nh("800193.xps"));
    else if (m != 0)
      localArrayList.add(new Nh("800194.xps"));
    else if (i != 0)
      localArrayList.add(new Nh("800222.xps"));
    else if (j != 0) {
      localArrayList.add(new Nh("800223.xps"));
    }

    return localArrayList;
  }

  public String Eu() {
    ayn localayn = bWW.ccf().FB();
    if (localayn == null) {
      return null;
    }
    dqU localdqU = Ew();

    if (localdqU == dqU.ltp) {
      return null;
    }

    if (byv.bFN().bFO().cJf().HL()) {
      return null;
    }

    lZ locallZ = new lZ();

    boolean bool = Ev();
    if (bool) {
      locallZ.tI().am(ict);
      locallZ.a("\n").a(bU.fH().getString("desc.mru.illegalAction"));
      locallZ.tJ();
    }

    List localList1 = Ex();
    if (localList1.size() > 0) {
      locallZ.tH().tI().am(ics);
      locallZ.tz().a(bU.fH().getString("nation.law.mru.good")).tA();
      locallZ.tJ();
      a(locallZ, localList1, ics, bool);
    }
    List localList2 = Ez();
    if (localList2.size() > 0) {
      locallZ.tH().tI().am(ict);
      locallZ.tz().a(bU.fH().getString("nation.law.mru.bad")).tA();
      locallZ.tJ();
      a(locallZ, localList2, ict, bool);
    }
    List localList3 = Ey();
    if (localList3.size() > 0) {
      locallZ.tH().tI().am("9ed34b");
      locallZ.tz().a(bU.fH().getString("nation.law.mru.probablyGood")).tA();
      locallZ.tJ();
      a(locallZ, localList3, "9ed34b", bool);
    }
    List localList4 = EA();
    if (localList4.size() > 0) {
      locallZ.tH().tI().am("f48140");
      locallZ.tz().a(bU.fH().getString("nation.law.mru.probablyBad")).tA();
      locallZ.tJ();
      a(locallZ, localList4, "f48140", bool);
    }
    return locallZ.length() > 0 ? locallZ.tP() : null;
  }

  public static void a(lZ paramlZ, List paramList, String paramString, boolean paramBoolean) {
    for (dWf localdWf : paramList) {
      int i = localdWf.TL() > 0 ? 1 : 0;
      paramlZ.tH().tI();
      paramlZ.am(paramString);
      paramlZ.a("    " + bU.fH().b(97, (int)localdWf.getId(), new Object[0]));
      if (paramBoolean) {
        paramlZ.tJ();
        return;
      }
      paramlZ.tz().a(" (" + (i != 0 ? "+" : "") + localdWf.TM() + "%/" + (i != 0 ? "+" : "") + localdWf.TL());
      try {
        paramlZ.a(aPf.b(dfn.eT((byte)9), -1, -1, "north", "citizenScore") + ")");
      } catch (bdh localbdh) {
        K.error("erreur au chargement de l'icon de citizen");
      }
      paramlZ.tA().tJ();
    }
  }

  protected boolean Ev() {
    if (Ew() != dqU.ltq) {
      return false;
    }
    List localList1 = Ez();
    List localList2 = EA();
    return (!localList1.isEmpty()) || (!localList2.isEmpty());
  }

  public static dqU Ew()
  {
    ayn localayn = bWW.ccf().FB();
    if (localayn == null) {
      return null;
    }
    aYr localaYr = localayn.ava();
    if (localaYr == aYr.feh) {
      return null;
    }
    byz localbyz = byv.bFN().bFO();
    cvY localcvY = localbyz.cJf();
    return localcvY.UI().aMP().jq(localaYr.bP());
  }

  private List Ex() {
    return dWf.T(EB());
  }

  private List Ey() {
    return dWf.T(EC());
  }

  private List Ez() {
    return dWf.U(EB());
  }

  private List EA() {
    return dWf.U(EC());
  }

  public abstract List EB();

  public abstract List EC();
}