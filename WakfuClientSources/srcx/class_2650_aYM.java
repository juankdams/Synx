import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class aYM
{
  private static final Logger K = Logger.getLogger(aYM.class);

  private static final Pattern feE = Pattern.compile("[+-]");

  private final KR feF = new KR();
  private final PX feG = new PX();
  private final cDM feH;

  public aYM(cDM paramcDM, ArrayList paramArrayList, short paramShort)
  {
    this(paramcDM, paramArrayList, paramShort, false);
  }

  public aYM(cDM paramcDM, ArrayList paramArrayList, short paramShort, boolean paramBoolean) {
    a(paramArrayList, paramShort, paramBoolean);
    this.feH = paramcDM;
  }

  public ArrayList aaP()
  {
    dPx localdPx = new dPx();
    for (Object localObject1 = this.feF.Vo(); ((dyO)localObject1).hasNext(); ) {
      ((dyO)localObject1).fl();
      localObject2 = eu.a(Byte.valueOf(bCO.cp(((dyO)localObject1).fm())));
      int i = this.feG.ap(((eu)localObject2).bJ());

      String str = cd(i, ((dyO)localObject1).value());

      bTI localbTI = bTI.dx(bCO.cq(((dyO)localObject1).fm()));
      if (localbTI != null) {
        str = str + " " + cxo.l(localbTI);
      }
      localdPx.c(((eu)localObject2).bJ(), str);
    }

    localObject1 = new ArrayList(localdPx.size());
    Object localObject2 = localdPx.yv();
    Arrays.sort((byte[])localObject2);
    for (byte b : localObject2) {
      ((ArrayList)localObject1).add(localdPx.bf(b));
    }
    return localObject1;
  }

  public dPx l(dle paramdle)
  {
    dPx localdPx = new dPx();
    for (dyO localdyO = this.feF.Vo(); localdyO.hasNext(); ) {
      localdyO.fl();
      eu localeu = eu.a(Byte.valueOf(bCO.cp(localdyO.fm())));
      bTI localbTI = bTI.dx(bCO.cq(localdyO.fm()));
      int i = this.feG.ap(localeu.bJ());
      int j = localdyO.value();

      String str1 = cd(i, j);

      lZ locallZ = new lZ();
      locallZ.a(str1);

      if (localbTI != null) {
        try {
          String str2 = String.format(ay.bd().getString("elementsSmallIconsPath"), new Object[] { localbTI.name() });
          locallZ.a(" ").a(aPf.c(str2, -1, -1, null));
        } catch (bdh localbdh) {
          K.error("Problème de propriété", localbdh);
        }
      }

      if ((localeu == eu.ayM) || (localeu == eu.ayN) || (localeu == eu.ayO) || (localeu == eu.ayP))
      {
        locallZ.a(" (").bw(paramdle.a(localeu).max()).a(")");
      }
      else locallZ.a(" (").bw(paramdle.e(localeu)).a(")");

      localdPx.c(localeu.bJ(), locallZ.tP());
    }
    return localdPx;
  }

  private String cd(int paramInt1, int paramInt2) {
    String str1 = this.feH.ec(10, paramInt1);
    str1 = feE.matcher(str1).replaceAll("");
    String str2 = "+" + paramInt2;
    return bjv.format(str1, new Object[] { str2 });
  }

  private void a(ArrayList paramArrayList, short paramShort, boolean paramBoolean) {
    Collections.sort(paramArrayList, cOJ.kxr);

    ArrayList localArrayList = paramArrayList;

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dpI localdpI = (dpI)localArrayList.get(i);
      if ((paramBoolean) || (!localdpI.bev()))
      {
        doA localdoA = (doA)bsj.bAv().kD(localdpI.eo());
        bTI localbTI = localdoA.Cz();
        dSc localdSc;
        int k;
        if ((localdoA instanceof dqZ)) {
          localdSc = ((tY)localdoA).sw();
          k = 1;
        } else if ((localdoA instanceof aYO)) {
          localdSc = ((tY)localdoA).sw();
          k = 0;
        } else if ((localdoA instanceof kM)) {
          localdSc = ((kM)localdoA).sw();
          k = 1; } else {
          if (!(localdoA instanceof cJc)) continue;
          localdSc = ((cJc)localdoA).sw();
          k = 0;
        }

        if (localdSc == null) {
          if (!bB) throw new AssertionError();
          K.error("CharacteristicType inconnu pour l'effet" + localdpI.yR() + " actionId=" + localdpI.eo() + "  " + localdoA.getClass());
        }
        else {
          byte b = localdSc.bJ();
          if (!this.feG.contains(b))
            this.feG.c(b, localdpI.eo());
          int m;
          if (k != 0)
            m = localdpI.a(0, paramShort, dNF.meh);
          else {
            m = -localdpI.a(0, paramShort, dNF.meh);
          }

          short s = bCO.l(b, (byte)(localbTI != null ? localbTI.bJ() : -1));
          this.feF.b(s, m, m); } 
      }
    }
  }

  public String m(dle paramdle) { return a(l(paramdle)); }

  private static String a(dPx paramdPx)
  {
    lZ locallZ = new lZ();

    int i = 0;
    String str1 = (String)paramdPx.bf(eu.ayM.bJ());
    if (str1 != null) {
      locallZ.tz().am("fe201b").a(str1).tA().tH();
      i = 1;
    }
    str1 = (String)paramdPx.bf(eu.ayN.bJ());
    if (str1 != null) {
      locallZ.tz().am("00afea").a(str1).tA().tH();
      i = 1;
    }
    str1 = (String)paramdPx.bf(eu.ayO.bJ());
    if (str1 != null) {
      locallZ.tz().am("00b400").a(str1).tA().tH();
      i = 1;
    }
    str1 = (String)paramdPx.bf(eu.ayP.bJ());
    if (str1 != null) {
      locallZ.tz().am("c04aff").a(str1).tA().tH();
      i = 1;
    }
    if (i != 0) {
      locallZ.tH();
    }

    if (a(paramdPx, locallZ, new eu[] { eu.azc, eu.azj, eu.aze, eu.azl, eu.azg, eu.azn, eu.azf, eu.azm, eu.azd, eu.azk, eu.ayZ }))
    {
      locallZ.tH();
    }

    if (a(paramdPx, locallZ, new eu[] { eu.ayU, eu.azq, eu.ayS, eu.ayT, eu.ayQ, eu.ayR, eu.azr, eu.azp, eu.aAe, eu.azz }))
    {
      locallZ.tH();
    }

    if (a(paramdPx, locallZ, new eu[] { eu.ayV, eu.azI, eu.aza, eu.ayY }))
    {
      locallZ.tH();
    }

    a(paramdPx, locallZ, new eu[] { eu.azM, eu.azL, eu.azK, eu.azP });

    String str2 = locallZ.tP();

    int j = 0;
    int k = str2.length();
    while ((j < k) && (str2.charAt(k - j - 1) == '\n')) {
      j++;
    }

    return str2.substring(0, str2.length() - j);
  }

  private static boolean a(dPx paramdPx, lZ paramlZ, eu[] paramArrayOfeu)
  {
    boolean bool = false;
    for (eu localeu : paramArrayOfeu) {
      String str = (String)paramdPx.bf(localeu.bJ());
      if (str != null)
      {
        paramlZ.a(str).tH();
        bool = true;
      }
    }
    return bool;
  }
}