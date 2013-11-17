import org.apache.log4j.Logger;

public class cOG extends brP
{
  private static final Logger K = Logger.getLogger(cOG.class);
  private final aLI iaa;

  public cOG(BX paramBX, aLI paramaLI)
  {
    super(paramBX);
    this.iaa = paramaLI;
  }

  public boolean h(aXL paramaXL)
  {
    q(paramaXL);
    r(paramaXL);

    return !bzZ();
  }

  private void q(aXL paramaXL) {
    alY localalY = paramaXL.bmZ();
    cUh localcUh1 = paramaXL.adj();
    boolean bool1 = localcUh1.aTC();

    int i = paramaXL.bmV();
    int j = paramaXL.bmW();
    int k = localalY.getWidth();
    int m = localalY.getHeight();

    aXL[] arrayOfaXL1 = null;
    int n = -32768;
    int i1 = -32768;
    for (int i2 = j; i2 < j + m; i2++)
      for (int i3 = i; i3 < i + k; i3++) {
        boolean bool2 = localalY.bg(i3 - i, i2 - j);
        if ((!bool1) || (!bool2))
        {
          short s1 = (short)asc.jT(i3);
          short s2 = (short)asc.jU(i2);

          if ((arrayOfaXL1 == null) || (n != s1) || (i1 != s2)) {
            arrayOfaXL1 = ((BX)this.fNP).g(s1, s2);
            n = s1;
            i1 = s2;
          }

          for (aXL localaXL : arrayOfaXL1)
            if (localaXL.gv() != paramaXL.gv())
            {
              cUh localcUh2 = localaXL.adj();
              if (localaXL.be(i3, i2))
              {
                if ((!bool1) && (!localcUh2.aTC())) {
                  j(new cbR(localaXL));
                }
                else if (!bool2)
                {
                  if (localaXL.contains(i3, i2))
                  {
                    if ((!bool1) || (!localaXL.bg(i3, i2)))
                    {
                      j(new cbR(localaXL)); }  } 
                }
              }
            }
        }
      }
  }

  private void r(aXL paramaXL) { dQx localdQx = paramaXL.bmX();
    for (int i = localdQx.hqw; i < localdQx.hqx; i++)
      for (int j = localdQx.hqu; j < localdQx.hqv; j++) {
        short s1 = BX.ef(j);
        short s2 = BX.eg(i);
        short s3 = ((BX)this.fNP).R(s1, s2);

        if (!((BX)this.fNP).Q(s1, s2)) {
          g(s3, s1, s2);
        }
        else if (cqs.a(this.iaa, (BX)this.fNP, j, i))
          g(s3, s1, s2);
      }
  }

  private void g(short paramShort1, short paramShort2, short paramShort3)
  {
    cDs localcDs = ars.dzL.aP(paramShort1);
    j(new bcQ(localcDs, paramShort2, paramShort3));
  }
}