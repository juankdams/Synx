import org.apache.log4j.Logger;

class dt extends dJN
  implements cFC
{
  private static final Logger K = Logger.getLogger(dt.class);
  static final dsc[] TI = new dsc[0];
  static final cCc[] TJ = new cCc[0];
  static final cyB[] TK = new cyB[0];
  static final brS[] TL = new brS[0];
  private aXL[] TM;

  public void a(bnp parambnp1, bnp parambnp2, bnp parambnp3, bnp parambnp4)
  {
    this.lVp = bnp.e(parambnp1, parambnp2, parambnp3, parambnp4);

    dgg localdgg1 = (dgg)parambnp1;
    dgg localdgg2 = (dgg)parambnp2;
    dgg localdgg3 = (dgg)parambnp3;
    dgg localdgg4 = (dgg)parambnp4;

    a(a(localdgg1, localdgg2, localdgg3, localdgg4));
    a(c(localdgg1, localdgg2, localdgg3, localdgg4));
    a(d(localdgg1, localdgg2, localdgg3, localdgg4));
    a(b(localdgg1, localdgg2, localdgg3, localdgg4));

    e(localdgg1, localdgg2, localdgg3, localdgg4);

    kB(a(localdgg1, localdgg2, localdgg3, localdgg4, nM.aSa));
    kC(a(localdgg1, localdgg2, localdgg3, localdgg4, nM.aSb));
    kD(a(localdgg1, localdgg2, localdgg3, localdgg4, nM.aSc));
    kE(a(localdgg1, localdgg2, localdgg3, localdgg4, nM.aSd));
  }

  private brS[] a(dgg paramdgg1, dgg paramdgg2, dgg paramdgg3, dgg paramdgg4)
  {
    return TL;
  }

  private dsc[] b(dgg paramdgg1, dgg paramdgg2, dgg paramdgg3, dgg paramdgg4)
  {
    dsc[] arrayOfdsc1 = paramdgg1 == null ? TI : paramdgg1.cPI().aDh();
    dsc[] arrayOfdsc2 = paramdgg2 == null ? TI : paramdgg2.cPI().aDh();
    dsc[] arrayOfdsc3 = paramdgg3 == null ? TI : paramdgg3.cPI().aDh();
    dsc[] arrayOfdsc4 = paramdgg4 == null ? TI : paramdgg4.cPI().aDh();

    int i = arrayOfdsc1.length + arrayOfdsc2.length + arrayOfdsc3.length + arrayOfdsc4.length;
    if (i == 0)
      return TI;
    dsc[] arrayOfdsc5 = new dsc[i];
    a(arrayOfdsc5, arrayOfdsc1, arrayOfdsc2, arrayOfdsc3, arrayOfdsc4);
    return arrayOfdsc5;
  }

  private cyB[] c(dgg paramdgg1, dgg paramdgg2, dgg paramdgg3, dgg paramdgg4)
  {
    cyB[] arrayOfcyB1 = paramdgg1 == null ? TK : paramdgg1.cPI().aDg();
    cyB[] arrayOfcyB2 = paramdgg2 == null ? TK : paramdgg2.cPI().aDg();
    cyB[] arrayOfcyB3 = paramdgg3 == null ? TK : paramdgg3.cPI().aDg();
    cyB[] arrayOfcyB4 = paramdgg4 == null ? TK : paramdgg4.cPI().aDg();

    int i = arrayOfcyB1.length + arrayOfcyB2.length + arrayOfcyB3.length + arrayOfcyB4.length;
    if (i == 0)
      return TK;
    cyB[] arrayOfcyB5 = new cyB[i];
    a(arrayOfcyB5, arrayOfcyB1, arrayOfcyB2, arrayOfcyB3, arrayOfcyB4);
    return arrayOfcyB5;
  }

  private cCc[] d(dgg paramdgg1, dgg paramdgg2, dgg paramdgg3, dgg paramdgg4)
  {
    cCc[] arrayOfcCc1 = paramdgg1 == null ? TJ : paramdgg1.cPI().aDf();
    cCc[] arrayOfcCc2 = paramdgg2 == null ? TJ : paramdgg2.cPI().aDf();
    cCc[] arrayOfcCc3 = paramdgg3 == null ? TJ : paramdgg3.cPI().aDf();
    cCc[] arrayOfcCc4 = paramdgg4 == null ? TJ : paramdgg4.cPI().aDf();

    int i = arrayOfcCc1.length + arrayOfcCc2.length + arrayOfcCc3.length + arrayOfcCc4.length;
    if (i == 0)
      return TJ;
    cCc[] arrayOfcCc5 = new cCc[i];
    a(arrayOfcCc5, arrayOfcCc1, arrayOfcCc2, arrayOfcCc3, arrayOfcCc4);
    return arrayOfcCc5;
  }

  private void a(Sq[] paramArrayOfSq1, Sq[] paramArrayOfSq2, Sq[] paramArrayOfSq3, Sq[] paramArrayOfSq4, Sq[] paramArrayOfSq5)
  {
    int i = 0;
    Sq localSq;
    for (int j = 0; j < paramArrayOfSq2.length; j++) {
      localSq = paramArrayOfSq2[j].ado();
      Sq tmp24_22 = localSq; tmp24_22.boO = ((byte)(tmp24_22.boO + 0));
      Sq tmp36_34 = localSq; tmp36_34.boP = ((byte)(tmp36_34.boP + 0));
      paramArrayOfSq1[(i++)] = localSq;
    }
    for (j = 0; j < paramArrayOfSq3.length; j++) {
      localSq = paramArrayOfSq3[j].ado();
      Sq tmp82_80 = localSq; tmp82_80.boO = ((byte)(tmp82_80.boO + 9));
      Sq tmp95_93 = localSq; tmp95_93.boP = ((byte)(tmp95_93.boP + 0));
      paramArrayOfSq1[(i++)] = localSq;
    }
    for (j = 0; j < paramArrayOfSq4.length; j++) {
      localSq = paramArrayOfSq4[j].ado();
      Sq tmp143_141 = localSq; tmp143_141.boO = ((byte)(tmp143_141.boO + 0));
      Sq tmp155_153 = localSq; tmp155_153.boP = ((byte)(tmp155_153.boP + 9));
      paramArrayOfSq1[(i++)] = localSq;
    }
    for (j = 0; j < paramArrayOfSq5.length; j++) {
      localSq = paramArrayOfSq5[j].ado();
      Sq tmp204_202 = localSq; tmp204_202.boO = ((byte)(tmp204_202.boO + 9));
      Sq tmp217_215 = localSq; tmp217_215.boP = ((byte)(tmp217_215.boP + 9));
      paramArrayOfSq1[(i++)] = localSq;
    }
  }

  public void a(aXL[] paramArrayOfaXL) {
    this.TM = paramArrayOfaXL;
  }

  private long a(dgg paramdgg1, dgg paramdgg2, dgg paramdgg3, dgg paramdgg4, nM paramnM)
  {
    long l = 0L;

    short s1 = paramdgg1 == null ? 0 : paramdgg1.cPI().a(paramnM);
    short s2 = paramdgg2 == null ? 0 : paramdgg2.cPI().a(paramnM);
    short s3 = paramdgg3 == null ? 0 : paramdgg3.cPI().a(paramnM);
    short s4 = paramdgg4 == null ? 0 : paramdgg4.cPI().a(paramnM);

    for (int i = 0; i < 18; i += 3) {
      for (int j = 0; j < 18; j += 3) {
        int k = blh.cp(i, j);
        boolean bool = a(i, j, s1, s2, s3, s4);
        l = bCO.b(l, k, bool);
      }
    }
    return l;
  }

  private boolean a(int paramInt1, int paramInt2, short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    short s;
    if (paramInt1 < 9)
      s = paramInt2 < 9 ? paramShort1 : paramShort3;
    else {
      s = paramInt2 < 9 ? paramShort2 : paramShort4;
    }

    int i = paramInt1 % 9;
    int j = paramInt2 % 9;
    int k = blh.cp(i, j);
    return bCO.i(s, k);
  }

  private void e(dgg paramdgg1, dgg paramdgg2, dgg paramdgg3, dgg paramdgg4)
  {
    float f = 0.0F;
    f += (paramdgg1 != null ? paramdgg1.cPI().aDe() : 0.0F);
    f += (paramdgg2 != null ? paramdgg2.cPI().aDe() : 0.0F);
    f += (paramdgg3 != null ? paramdgg3.cPI().aDe() : 0.0F);
    f += (paramdgg4 != null ? paramdgg4.cPI().aDe() : 0.0F);
    dx(f);
  }

  public short a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.TM.length != 0) {
      for (aXL localaXL : this.TM) {
        int k = paramInt1 + this.aEd * 18;
        int m = paramInt2 + this.aEe * 18;
        if (localaXL.A(k, m, paramInt3)) {
          return 0;
        }
      }
    }
    return super.a(paramInt1, paramInt2, paramInt3);
  }
}