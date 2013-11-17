import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bys
{
  public static final String gkk = "[se]";
  public static final String gkl = "[target]";
  public static final String gkm = "[casterName]";
  public static final String gkn = "\\[se\\]";
  public static final String gko = "\\[target\\]";
  public static final String gkp = "\\[casterName\\]";
  private final bWF gkq;
  private static final Logger K = Logger.getLogger(bys.class);

  private static final int[] gkr = { 30, 40, 190 };

  public bys(bWF parambWF)
  {
    this.gkq = parambWF;
  }

  void bFJ()
  {
    ckT localckT = this.gkq.mD();
    byz localbyz = byv.bFN().bFO();

    if ((localckT == null) || (localbyz == null) || (!localckT.equals(localbyz.bGv()))) {
      return;
    }

    if (!bFL()) {
      return;
    }

    if ((this.gkq.bov() instanceof bPD)) {
      return;
    }

    if (!bFK()) {
      return;
    }

    dle localdle = this.gkq.bov().bke();
    if (localdle == null) {
      return;
    }
    if (((localdle instanceof Su)) && (F.a((Su)localdle))) {
      return;
    }

    long l = this.gkq.gA();

    if (!a(localckT, l)) {
      return;
    }

    String str = bFM();
    if (str.length() > 0)
      bWF.ehE.info(str);
  }

  private static boolean a(ckT paramckT, long paramLong)
  {
    if (paramLong == -9223372036854775808L) {
      return true;
    }

    if (paramckT.dg(paramLong) != null) {
      return true;
    }

    if (paramckT.LC().ec(paramLong) != null) {
      return true;
    }

    if ((paramckT instanceof arl)) {
      return ((arl)paramckT).ew(paramLong) != null;
    }

    return false;
  }

  private boolean bFK() {
    return (this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).beq());
  }

  private boolean bFL()
  {
    return !aUP.c(gkr, this.gkq.bov().getId());
  }

  private String gi(long paramLong) {
    ckT localckT = this.gkq.mD();
    Su localSu = localckT.dg(paramLong);
    if (localSu != null) {
      return localSu.getName();
    }
    aAn localaAn = (aAn)localckT.LC().ec(paramLong);
    if (localaAn != null) {
      return localaAn.getName();
    }

    if ((localckT instanceof arl)) {
      dle localdle = ((arl)localckT).ew(paramLong);
      if ((localdle instanceof cMb)) {
        return ((cMb)localdle).getName();
      }
    }

    return "";
  }

  private String bFM()
  {
    lZ locallZ = new lZ();
    int i = (((dpI)this.gkq.bov().bkc()).bet()) || (this.gkq.gA() == -9223372036854775808L) ? 1 : 0;

    long l = i != 0 ? this.gkq.Iw() : this.gkq.gA();
    locallZ.tI().am(cPU.kAB).a(gi(l));
    locallZ.a(bU.fH().getString("colon"));
    locallZ.tJ();
    locallZ.tI().am(cPU.kAC);
    String str = a(locallZ, false);
    return str == null ? "" : str;
  }

  private String a(lZ paramlZ, boolean paramBoolean)
  {
    int i = this.gkq.bov().getId();
    ArrayList localArrayList = new ArrayList();
    dpI localdpI = (dpI)this.gkq.bov().bkc();
    int j = localdpI.yR();

    String str1 = "";
    Object localObject5;
    Object localObject4;
    if ((j != -1) && (!paramBoolean) && (bU.fH().ed(13, j))) {
      int k = (i == bsj.fTb.getId()) && (localdpI.bep() > 0) ? 1 : 0;
      int m = k != 0 ? localdpI.a(0, ((bqk)this.gkq.bov().wa()).nU(), dNF.meh) : this.gkq.bov().getValue();
      Object localObject2;
      if ((i == bsj.fSs.getId()) || (i == bsj.fWn.getId()))
      {
        localObject2 = (bXU)cNO.cFX().yF(this.gkq.bov().getValue());
        str1 = bU.fH().b(13, j, new Object[] { ((bXU)localObject2).getName() });
      }
      else
      {
        int i2;
        if (i == bsj.fSd.getId()) {
          localObject2 = (bZG)this.gkq.bov();
          i2 = 0;
          if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 2)) {
            i2 = ((dpI)this.gkq.bov().bkc()).a(1, ((bZG)localObject2).cVC(), dNF.meh);
          }
          localObject5 = (bXU)cNO.cFX().yF(((bZG)localObject2).pl());
          str1 = bU.fH().b(13, j, new Object[] { cxo.a((bJC)localObject5, ((bZG)this.gkq.bov()).cek(), ((bXU)localObject5).bRe(), true), Integer.valueOf(i2) });
        } else if (i == bsj.fYp.getId()) {
          localObject2 = (bZG)this.gkq.bov();
          i2 = 0;
          if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 2)) {
            i2 = ((dpI)this.gkq.bov().bkc()).a(1, ((bZG)localObject2).cVC(), dNF.meh);
          }
          localObject5 = (bXU)cNO.cFX().yF(((bZG)localObject2).pl());
          str1 = bU.fH().b(13, j, new Object[] { cxo.a((bJC)localObject5, ((bZG)this.gkq.bov()).cek(), ((bXU)localObject5).bRe(), true), Integer.valueOf(i2) });
        }
        else
        {
          int i1;
          if ((i == bsj.fSH.getId()) || (i == bsj.fSX.getId()) || (i == bsj.fSq.getId()))
          {
            i1 = 0;
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 1)) {
              i1 = ((dpI)this.gkq.bov().bkc()).a(0, this.gkq.bov().cVC(), dNF.meh);
            }
            localObject4 = bU.fH().b(6, i1, new Object[0]);
            str1 = bU.fH().b(13, j, new Object[] { localObject4 });
          } else if ((i == bsj.fVs.getId()) || (i == bsj.fWz.getId()))
          {
            i1 = 0;
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 1)) {
              i1 = ((dpI)this.gkq.bov().bkc()).a(0, this.gkq.bov().cVC(), dNF.meh);
            }
            localObject4 = bU.fH().b(6, i1, new Object[0]);
            str1 = bU.fH().b(13, j, new Object[] { localObject4 });
          } else if ((i == bsj.fVa.getId()) || (i == bsj.fWx.getId()))
          {
            i1 = 0;
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 2)) {
              i1 = ((dpI)this.gkq.bov().bkc()).a(1, this.gkq.bov().cVC(), dNF.meh);
            }
            localObject4 = bU.fH().b(6, i1, new Object[0]);
            str1 = bU.fH().b(13, j, new Object[] { localObject4 });
          } else if (i == bsj.fSg.getId()) {
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 1)) {
              i1 = ((dpI)this.gkq.bov().bkc()).a(0, this.gkq.bov().cVC(), dNF.meh);
              localArrayList.add(bU.fH().b(7, i1, new Object[0]));
            }
          } else {
            str1 = bU.fH().b(13, j, new Object[] { bU.fH().iK(m) });
          }
        }
      }
    }
    String str2;
    if (str1.contains("[se]")) {
      str2 = a(paramlZ, true);
      str1 = str1.replaceAll("\\[se\\]", str2);
    } else if ((paramBoolean) || (str1.length() == 0) || (j == duw.daf().yR()))
    {
      str2 = bU.fH().ec(30, i);
      if (str2.length() > 0)
      {
        Object localObject1;
        Object localObject3;
        if ((i == bsj.fSd.getId()) || (i == bsj.fSO.getId()) || (i == bsj.fSV.getId()) || (i == bsj.fWn.getId()) || (i == bsj.fYp.getId()))
        {
          localObject1 = (bZG)this.gkq.bov();
          localObject3 = String.valueOf(((bZG)localObject1).cek());
          localObject4 = (bXU)cNO.cFX().yF(((bZG)localObject1).pl());
          switch (((bZG)localObject1).bou())
          {
          case 3:
          case 6:
            return null;
          case 2:
            str2 = bU.fH().getString("effect.immuned", new Object[] { ((bXU)localObject4).getName() });
            break;
          case 4:
          case 5:
          default:
            localObject5 = new StringBuilder(cxo.a((bJC)localObject4, ((bZG)this.gkq.bov()).cek(), ((bXU)localObject4).bRe(), true));
            a((StringBuilder)localObject5);
            localArrayList.add(((StringBuilder)localObject5).toString());
            localArrayList.add(localObject3);
          }
        } else if (i == bsj.fRG.getId()) {
          localObject1 = (bXU)cNO.cFX().yF(localdpI.a(0, ((bqk)this.gkq.bov().wa()).nU(), dNF.meh));
          localObject3 = new StringBuilder(((bXU)localObject1).getName());
          localArrayList.add(((StringBuilder)localObject3).toString());
          localArrayList.add(String.valueOf(localdpI.a(1, ((bqk)this.gkq.bov().wa()).nU(), dNF.meh)));
        } else if (i == bsj.fSs.getId()) {
          localObject1 = (bXU)cNO.cFX().yF(this.gkq.bov().getValue());
          localObject3 = new StringBuilder(((bXU)localObject1).getName());
          a((StringBuilder)localObject3);
          localArrayList.add(((StringBuilder)localObject3).toString());
        } else if ((i == bsj.fSn.getId()) || (i == bsj.fSG.getId()) || (i == bsj.fUW.getId()))
        {
          localObject1 = new StringBuilder().append(bU.fH().b(6, this.gkq.bov().getValue(), new Object[0]));
          a((StringBuilder)localObject1);
          localArrayList.add(((StringBuilder)localObject1).toString());
        } else if ((i == bsj.fUY.getId()) || (i == bsj.fUX.getId()) || (i == bsj.fVb.getId()))
        {
          localObject1 = (bVw)Hh.QM().dh(this.gkq.bov().getValue());

          if (localObject1 != null)
            localObject3 = new StringBuilder(((bVw)localObject1).getName());
          else {
            localObject3 = new StringBuilder("");
          }
          a((StringBuilder)localObject3);
          localArrayList.add(((StringBuilder)localObject3).toString());
        } else if (i == bsj.fSr.getId()) {
          localObject1 = new StringBuilder();
          a((StringBuilder)localObject1);
          localArrayList.add(((StringBuilder)localObject1).toString());
        } else if (i == bsj.fRh.getId()) {
          localObject1 = (bXU)cNO.cFX().yF(((hn)this.gkq.bov()).pl());
          localArrayList.add(((bXU)localObject1).getName());
          try {
            localArrayList.add(Integer.toString(this.gkq.bov().getValue()));
          } catch (Exception localException2) {
            K.error("problème à la recupération du % de resistance d'état");
          }
        }
        else
        {
          int n;
          if ((i == bsj.fSX.getId()) || (i == bsj.fSH.getId()) || (i == bsj.fSo.getId()) || (i == bsj.fSh.getId()) || (i == bsj.fSq.getId()))
          {
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 1)) {
              n = ((dpI)this.gkq.bov().bkc()).a(0, this.gkq.bov().cVC(), dNF.meh);
              localArrayList.add(bU.fH().b(6, n, new Object[0]));
            }
          } else if ((i == bsj.fVs.getId()) || (i == bsj.fWz.getId()))
          {
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 1)) {
              n = ((dpI)this.gkq.bov().bkc()).a(0, this.gkq.bov().cVC(), dNF.meh);
              localArrayList.add(bU.fH().b(6, n, new Object[0]));
            }
          } else if ((i == bsj.fVa.getId()) || (i == bsj.fWx.getId()))
          {
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 2)) {
              n = ((dpI)this.gkq.bov().bkc()).a(1, this.gkq.bov().cVC(), dNF.meh);
              localArrayList.add(bU.fH().b(6, n, new Object[0]));
            }
          } else if (i == bsj.fSg.getId()) {
            if ((this.gkq.bov().bkc() != null) && (((dpI)this.gkq.bov().bkc()).bep() >= 1)) {
              n = ((dpI)this.gkq.bov().bkc()).a(0, this.gkq.bov().cVC(), dNF.meh);
              localArrayList.add(bU.fH().b(7, n, new Object[0]));
            }
          } else {
            StringBuilder localStringBuilder = new StringBuilder().append(bU.fH().iK(this.gkq.bov().getValue()));
            a(localStringBuilder);
            localArrayList.add(localStringBuilder.toString());
          }
        }
        str2 = jr(str2);
        paramlZ.a(str2);

        b(paramlZ);

        paramlZ.tJ();
        try {
          str1 = bjv.format(paramlZ.tP(), localArrayList.toArray());
        } catch (Exception localException1) {
          K.error("problème dans le formattage de la chaine " + paramlZ, localException1);
        }
      }
    } else if (str1 != null)
    {
      paramlZ.a(jr(str1));
      paramlZ.tJ();
      str1 = paramlZ.tP();
    }

    return str1;
  }

  private void b(lZ paramlZ) {
    switch (this.gkq.bov().bou()) {
    case 7:
      paramlZ.a(" (").a(bU.fH().getString("exec.block.chat")).a(")");
    }
  }

  private String jr(String paramString)
  {
    String str1 = Vz.dI(paramString);

    if ((!str1.contains("[target]")) && (!str1.contains("[casterName]")))
    {
      return str1;
    }

    ckT localckT = this.gkq.mD();
    String str2 = localckT.dg(this.gkq.gA()).getName();
    str1 = str1.replaceAll("\\[target\\]", str2);
    dle localdle = this.gkq.bov().bke();
    if (localdle != null) {
      Su localSu = localckT.dg(localdle.getId());
      if (localSu != null) {
        str1 = str1.replaceAll("\\[casterName\\]", localSu.getName());
      }
    }

    return str1;
  }

  private void a(StringBuilder paramStringBuilder) {
    switch (this.gkq.bov().bou()) {
    case 4:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.absorb")).append(")");
      break;
    case 1:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.failed")).append(")");
      break;
    case 2:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.immune")).append(")");
      break;
    case 13:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.seduction.immunity")).append(")");
      break;
    case 3:
    case 6:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.resist")).append(")");
      break;
    case 12:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.level.too.high")).append(")");
      break;
    case 14:
      paramStringBuilder.append(" (").append(bU.fH().getString("exec.seduction.success")).append(")");
    case 5:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    }
  }
}