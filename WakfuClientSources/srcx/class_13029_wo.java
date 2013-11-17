import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class wo extends diV
{
  protected String b(aAn paramaAn)
  {
    lZ locallZ = new lZ();
    if (paramaAn.axG() != null)
      locallZ.a("[").a(((Su)paramaAn.axG()).getName()).a("] ");
    locallZ.a(bU.fH().b(6, (int)paramaAn.clt(), new Object[0]));
    Object localObject2;
    Object localObject3;
    aVc localaVc;
    if ((paramaAn instanceof dLR)) {
      localObject1 = (dLR)paramaAn;
      if (paramaAn.b(eu.ayM)) {
        locallZ.a(" (").a(bU.fH().getString("hp.var", new Object[] { Integer.valueOf(paramaAn.e(eu.ayM)) })).a(")");
      }

      if (paramaAn.b(eu.aAg)) {
        locallZ.a(" (").a(bU.fH().getString("hp.var.area", new Object[] { Integer.valueOf(paramaAn.e(eu.aAg)) })).a(")");
      }

      switch (((dLR)localObject1).czh())
      {
      case 1:
        int i;
        if (paramaAn.b(eu.ayN)) {
          i = paramaAn.e(eu.ayN);
          if (i > 0)
            locallZ.a("\n . ").a(bU.fH().getString("xelors.dial.ap.var", new Object[] { Integer.valueOf(i) }));
        }
        if (paramaAn.b(eu.azq)) {
          i = paramaAn.e(eu.azq);
          if (i > 0)
            locallZ.a("\n . ").a(bU.fH().getString("xelors.dial.init.var", new Object[] { Integer.valueOf(i) })); 
        }
        break;
      case 3:
        localObject2 = paramaAn.atO();
        for (localObject3 = ((dDN)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) {
          localaVc = (aVc)((Iterator)localObject3).next();
          if (localaVc.bkc().eo() == bsj.fVk.getId()) {
            KS localKS = (KS)localaVc;
            dle localdle = localKS.bkf();
            if ((localdle instanceof Su))
            {
              Su localSu = (Su)localdle;
              locallZ.tH().a(bU.fH().getString("desc.target")).a(" : ").a(localSu.getName());
              if (!localSu.b(eu.ayM)) break;
              locallZ.a(" (");
              locallZ.a(bU.fH().getString("hp.var", new Object[] { Integer.valueOf(localSu.e(eu.ayM) + localSu.e(eu.aAj)) }));

              locallZ.a(")"); break;
            }
          }
        }

        break;
      case 4:
        locallZ.a(" (");
        if (((dLR)localObject1).du(1467L))
          locallZ.a(bU.fH().getString("microbot.is.activated"));
        else
          locallZ.a(bU.fH().getString("microbot.is.not.activated"));
        locallZ.e(')');
      case 2:
      }

    }

    Object localObject1 = paramaAn.atO();
    if (localObject1 != null) {
      localObject2 = new ArrayList();

      for (localObject3 = ((dDN)localObject1).iterator(); ((Iterator)localObject3).hasNext(); ) {
        localaVc = (aVc)((Iterator)localObject3).next();
        if ((localaVc instanceof dpI))
          ((ArrayList)localObject2).add((dpI)localaVc);
      }
      if (!((dDN)localObject1).isEmpty()) {
        localObject3 = cxo.a(new cJH((List)localObject2, (int)paramaAn.clt(), (short)0, true, cMx.krQ, 0));
        int j = 0; for (int k = ((ArrayList)localObject3).size(); j < k; j++) {
          locallZ.tH().a((CharSequence)((ArrayList)localObject3).get(j));
        }
      }
    }
    return locallZ.tP();
  }
}