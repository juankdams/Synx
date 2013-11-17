import java.util.ArrayList;
import java.util.Iterator;

class diV
  implements bUc
{
  public void a(cCq paramcCq)
  {
    dCb localdCb = paramcCq.cyG();
    if (localdCb == null) {
      return;
    }
    aAn localaAn = paramcCq.cyH();

    localdCb.es("AnimStatique");
    localdCb.a(new cfN(this, localdCb, localaAn));

    del localdel = new del(localaAn);
    localdel.d(18106);
    localdel.c(true);
    cjO.clE().j(localdel);
  }

  protected String b(aAn paramaAn) {
    lZ locallZ = new lZ();
    if (paramaAn.axG() != null) {
      locallZ.a("[").a(((cTK)paramaAn.axG()).getName()).a("] ");
    }
    locallZ.a(bU.fH().b(6, (int)paramaAn.clt(), new Object[0]));
    eu localeu = eu.ayM;
    String str = "hp.var";
    if (paramaAn.getType() == xj.bps.xj()) {
      localeu = eu.azR;
      str = "remaining.turns";
    } else if (paramaAn.getType() == xj.bpz.xj()) {
      localeu = eu.aAg;
      str = "hp.var.barrel";
    } else if (paramaAn.getType() == xj.bpA.xj()) {
      localeu = eu.aAg;
      str = "hp.var.glyph";
    } else if (paramaAn.getType() == xj.bpl.xj()) {
      localeu = eu.aAg;
      str = "hp.var.beacon";
    }
    if (paramaAn.b(localeu)) {
      locallZ.a(" (");
      locallZ.a(bU.fH().getString(str, new Object[] { Integer.valueOf(paramaAn.e(localeu)) }));
      locallZ.a(")");
    }

    dDN localdDN = paramaAn.atO();
    if (localdDN != null) {
      ArrayList localArrayList = new ArrayList();

      for (Object localObject = localdDN.iterator(); ((Iterator)localObject).hasNext(); ) {
        aVc localaVc = (aVc)((Iterator)localObject).next();
        if ((localaVc instanceof dpI)) {
          localArrayList.add((dpI)localaVc);
        }
      }
      if (!localdDN.isEmpty()) {
        localObject = cxo.a(new cJH(localArrayList, (int)paramaAn.clt(), (short)0, true, cMx.krQ, 0));
        int i = 0; for (int j = ((ArrayList)localObject).size(); i < j; i++) {
          locallZ.tH().a((CharSequence)((ArrayList)localObject).get(i));
        }
      }
    }
    return locallZ.tP();
  }
}