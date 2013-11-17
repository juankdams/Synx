import java.util.Iterator;

public class aTo
{
  public static final String PACKAGE = "wakfu.spellDetails";

  public static void setSpellLevel(cSx paramcSx)
  {
    if ((paramcSx instanceof bXo)) {
      short s = (short)(int)((bXo)paramcSx).getValue();
      if (s > dMu.abu().nV()) {
        s = dMu.abu().nV();
      }

      cpa localcpa = paramcSx.cIl().getElementMap();
      if (localcpa == null) {
        return;
      }
      a(s, localcpa);
    }
  }

  public static void keyType(cSx paramcSx, aTp paramaTp)
  {
    if (paramaTp.getText().length() == 0) {
      return;
    }

    short s = bUD.getShort(paramaTp.getText());
    if (s > dMu.abu().nV()) {
      s = dMu.abu().nV();
    }
    cpa localcpa = paramcSx.cIl().getElementMap();
    if (localcpa == null) {
      return;
    }
    a(s, localcpa);
  }

  public static void processText(cSx paramcSx, dOc paramdOc, anG paramanG)
  {
    cWk localcWk = (cWk)paramcSx.cIl();
    cDG localcDG = localcWk.getBlockUnderMouse();
    ddB localddB;
    String str1;
    String[] arrayOfString1;
    String str2;
    String str3;
    if ((localcDG != null) && (localcDG.czB() == cUE.kHp)) {
      localddB = localcDG.aOi();
      if (localddB == null) {
        return;
      }
      if (localddB.cOJ() == bY.QP) {
        str1 = ((ckA)localddB).getId();
        if ((str1 != null) && (str1.length() > 0)) {
          arrayOfString1 = str1.split("_");
          if (arrayOfString1.length == 2) {
            str2 = arrayOfString1[0];
            str3 = arrayOfString1[1];

            if ((str2 == null) || (str2.length() == 0))
              return;
            int i;
            int j;
            short s;
            Object localObject1;
            Object localObject2;
            Object localObject3;
            if (str2.equals("state")) {
              i = Integer.parseInt(str3);
              j = bCO.sg(i);
              s = bCO.sh(i);

              localObject1 = (bXU)cNO.cFX().yF(j);
              if (((bXU)localObject1).nU() != s) {
                localObject1 = ((bXU)localObject1).cT(s);
              }

              if (paramcSx.mp() == CH.bGw) {
                localObject2 = new cjZ();
                ((cjZ)localObject2).a((bXU)localObject1);
                if (paramdOc.getElementMap() != null) {
                  localObject3 = (apX)dLE.doY().br("editableDescribedSpell", paramdOc.getElementMap().getId());
                  if (localObject3 != null) {
                    ((cjZ)localObject2).e(((dSR)((apX)localObject3).bsL()).getId());
                  }
                }
                ((cjZ)localObject2).a(paramdOc.getElementMap().getId());
                cjO.clE().j((cWG)localObject2);
              } else {
                dLE.doY().t("describedState", localObject1);

                ayw.popup(paramanG, paramdOc);
                paramdOc.a(CH.bGA, new MC(paramdOc), true);
              }

            }
            else if (str2.equals("glyph")) {
              i = Integer.parseInt(str3);
              j = bCO.sg(i);
              s = bCO.sh(i);

              localObject1 = bMF.bUo().fo(j);
              localObject2 = new bwO((aAn)localObject1, s);

              if (paramcSx.mp() == CH.bGw) {
                localObject3 = new cJo((bwO)localObject2);
                if (paramdOc.getElementMap() != null) {
                  apX localapX2 = (apX)dLE.doY().br("editableDescribedSpell", paramdOc.getElementMap().getId());
                  if (localapX2 != null) {
                    ((cJo)localObject3).e(((dSR)localapX2.bsL()).getId());
                  }
                }
                ((cJo)localObject3).a(paramdOc.getElementMap().getId());
                cjO.clE().j((cWG)localObject3);
              } else {
                dLE.doY().t("describedState", localObject2);

                ayw.popup(paramanG, paramdOc);
                paramdOc.a(CH.bGA, new MG(paramdOc), true);
              }

            }
            else if (str2.equals("spell")) {
              i = Integer.parseInt(str3);
              dSR localdSR = Be.Kj().ea(i);
              if (localdSR == null) {
                return;
              }
              if (paramcSx.mp() == CH.bGw) {
                apX localapX1 = new apX(localdSR, (short)0, -1L);
                sw.openSpellDescription(3, localapX1, paramdOc.getElementMap().getId());
              }
            }
          }
        }
      }
    }
    if ((localcDG != null) && (localcDG.czB() == cUE.kHq)) {
      localddB = localcDG.aOi();
      if (localddB == null) {
        return;
      }
      if (localddB.cOJ() == bY.QQ) {
        dLE.doY().t("describedState", null);
        str1 = ((cKf)localddB).cDW();
        if (str1 == null) {
          return;
        }
        arrayOfString1 = str1.split("-");
        str2 = arrayOfString1[0];

        if (arrayOfString1.length > 1) {
          String[] arrayOfString2 = arrayOfString1[1].split(",");
          str3 = bU.fH().getString(str2, arrayOfString2);
        } else {
          str3 = bU.fH().getString(str2);
        }
        dLE.doY().t("describedIcon", str3);
        ayw.popup(paramanG, localcWk);
        paramdOc.a(CH.bGA, new MF(paramdOc), true);
      }
    }
  }

  public static void restore(cSx paramcSx)
  {
    cpa localcpa = paramcSx.cIk().getElementMap();
    if (localcpa == null) {
      return;
    }
    apX localapX = (apX)dLE.doY().br("describedSpell", localcpa.getId());
    a(localapX.nU(), localcpa);
  }

  private static void a(short paramShort, cpa paramcpa) {
    apX localapX = (apX)dLE.doY().br("editableDescribedSpell", paramcpa.getId());
    if (localapX == null) {
      return;
    }
    localapX.d(paramShort, false);
    dad localdad = (dad)paramcpa.fi("tabbedContainer");
    if (localdad == null) {
      return;
    }
    boolean bool = localdad.getSelectedTabIndex() == 0;
    dLE.doY().a(localapX, new String[] { "level", "levelTextShort", "ap", "castInterval", "wp", "chrage", "mp", "castOnlyInLine", "range", "areaOfEffectIconURL", "conditionsDescription", "criticalDescription", "shortDescription", "testLineOfSight" });

    a(localapX, localapX, bool);
  }

  private static void a(Ce paramCe, apX paramapX, boolean paramBoolean)
  {
    for (Iterator localIterator = paramCe.iterator(); localIterator.hasNext(); ) {
      dpI localdpI = (dpI)localIterator.next();

      boolean bool = localdpI.cL(1L);
      if (((!bool) || (!paramBoolean)) && ((bool) || (paramBoolean)) && 
        (paramapX.nU() <= localdpI.zC()) && (paramapX.nU() >= localdpI.zB()))
      {
        int i = localdpI.bep();
        Object[] arrayOfObject = new Object[i];

        for (int j = 0; j < i; j++) {
          arrayOfObject[j] = Integer.valueOf(localdpI.a(j, paramapX.nU(), dNF.meh));
        }

        if (aBn.dVb.contains(localdpI.eo())) {
          a(aww.cMI().zw(localdpI.yR()), paramapX, paramBoolean);
        } else if ((localdpI.eo() == bsj.fSd.getId()) || (localdpI.eo() == bsj.fSO.getId()) || (localdpI.eo() == bsj.fWn.getId()) || (localdpI.eo() == bsj.fSV.getId()) || (localdpI.eo() == bsj.fYp.getId()))
        {
          DI.MJ().k(((dSR)paramapX.bsL()).getId(), localdpI.a(0, paramapX.nU(), dNF.meh), (short)localdpI.a(1, paramapX.nU(), dNF.meh));
        } else {
          cjK localcjK = cbb.b(localdpI.eo(), arrayOfObject);
          if (localcjK != null)
            a(localcjK, paramapX, paramBoolean);
        }
      }
    }
  }
}