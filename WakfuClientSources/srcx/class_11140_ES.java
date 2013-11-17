import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ES
  implements dRh
{
  private static final Logger K = Logger.getLogger(ES.class);
  public static final long bLa = 1L;
  public static final long bLb = 2L;
  public static final long bLc = 4L;
  public static final long bLd = 8L;
  public static final long bLe = 16L;
  public static final long bLf = 32L;
  public static final long bLg = 64L;
  public static final long bLh = 128L;
  public static final long bLi = 256L;
  public static final long bLj = 512L;
  public static final long bLk = 1024L;
  public static final long bLl = 2048L;
  public static final long bLm = 4096L;
  public static final long bLn = 8192L;
  public static final long bLo = 16384L;
  public static final long bLp = 32768L;
  private static final long bLq = 16L;
  public static final long bLr = 65536L;
  public static final long bLs = 131072L;
  public static final long bLt = 262144L;
  public static final long bLu = 524288L;
  public static final long bLv = 1048576L;
  public static final long bLw = 2097152L;
  public static final long bLx = 4194304L;
  public static final long bLy = 8388608L;
  public static final long bLz = 16777216L;
  public static final long bLA = 33554432L;
  public static final long bLB = 67108864L;
  public static final long bLC = 134217728L;
  public static final long bLD = 1073741824L;
  public static final long bLE = 2147483648L;
  public static final long bLF = 17179869184L;
  public static final long bLG = 34359738368L;
  public static final long bLH = 68719476736L;
  public static final long bLI = 137438953472L;
  public static final long bLJ = 274877906944L;
  public static final long bLK = 549755813888L;
  public static final long bLL = 1099511627776L;
  public static final long bLM = 2199023255552L;
  public static final long bLN = 4398046511104L;
  public static final long bLO = 8796093022208L;
  public static final long bLP = 17592186044416L;
  public static final long bLQ = 35184372088832L;
  public static final long bLR = 70368744177664L;
  public static final long bLS = 140737488355328L;
  public static final long bLT = 281474976710656L;
  protected final long[] bLU;
  private static final long[] bLV = new long[0];

  public ES(long[] paramArrayOfLong) {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
      this.bLU = bLV;
    else
      this.bLU = paramArrayOfLong;
  }

  public boolean bt(long paramLong) {
    for (int i = 0; i < this.bLU.length; i++) {
      if ((this.bLU[i] & paramLong) != 0L)
        return true;
    }
    return false;
  }

  public Cs a(alr paramalr1, alr paramalr2)
  {
    btH localbtH = btH.gcr;

    if ((this.bLU == null) || (this.bLU == bLV)) {
      return new Cs(btH.gcp, new ArrayList());
    }

    if (!paramalr1.ayb()) {
      return new Cs(btH.gcr, new ArrayList());
    }
    ArrayList localArrayList = new ArrayList();

    for (int i = 0; i < this.bLU.length; i++) {
      long l = this.bLU[i];

      if (((0x2 & l) == 0L) || 
        (paramalr1 == paramalr2))
      {
        if (((0x100 & l) == 0L) || 
          (paramalr1 != paramalr2))
        {
          if ((0x80 & l) != 0L) {
            if (paramalr1 != paramalr2)
            {
              if (paramalr2 != null)
              {
                if (((paramalr1 instanceof dMT)) && ((paramalr2 instanceof dMT))) {
                  if (((dMT)paramalr1).Fx() != ((dMT)paramalr2).Fx());
                }
              }
            }
          }
          else if ((0x0 & l) != 0L) {
            if (paramalr2 != null)
            {
              if ((paramalr2 instanceof dhJ))
              {
                if (paramalr1 != ((dhJ)paramalr2).afw());
              }
            }
          }
          else if ((0x0 & l) != 0L) {
            if (paramalr2 != null)
            {
              if ((paramalr2 instanceof dhJ))
              {
                if (paramalr1 != ((dhJ)paramalr2).aft());
              }
            }
          }
          else if ((0x4 & l) != 0L) {
            if (paramalr2 != null)
            {
              if ((paramalr1 instanceof dMT))
              {
                if ((paramalr2 instanceof dMT))
                {
                  if (((dMT)paramalr1).Fx() != ((dMT)paramalr2).Fx());
                }
              }
            }
          }
          else if ((0x8 & l) != 0L) {
            if (paramalr2 != null)
            {
              if ((paramalr1 instanceof dMT))
              {
                if ((paramalr2 instanceof dMT))
                {
                  if (((dMT)paramalr1).Fx() == ((dMT)paramalr2).Fx());
                }
              }
            }
          }
          else if ((0x10 & l) != 0L) {
            if ((paramalr1 instanceof dhJ))
            {
              if (paramalr1.getId() <= 0L);
            }
          }
          else if ((0x0 & l) != 0L) {
            if ((paramalr1 instanceof dhJ))
            {
              if (paramalr1.getId() > 0L);
            }
          }
          else if ((0x20 & l) != 0L) {
            if ((paramalr1 instanceof dhJ))
            {
              if (!((dhJ)paramalr1).aJr());
            }
          }
          else if ((0x0 & l) != 0L) {
            if ((paramalr1 instanceof dhJ))
            {
              if (((dhJ)paramalr1).aJr());
            }
          }
          else {
            if ((0x800 & l) != 0L) {
              if (!(paramalr1 instanceof hq)) {
                continue;
              }
              if (((hq)paramalr1).axG() != paramalr2)
                continue;
            }
            else
            {
              if ((paramalr1 instanceof hq))
                continue;
            }
            Object localObject1;
            if ((0x200 & l) != 0L) {
              if ((paramalr1 instanceof dhJ))
              {
                localObject1 = ((dhJ)paramalr1).bEY();
                if (localObject1 != null)
                {
                  int j = 0;
                  if ((localObject1 != null) && (((cOE)localObject1).LC().bbj() != null)) {
                    for (cjK localcjK : ((cOE)localObject1).LC().bbj())
                      if (localcjK.P(paramalr1.fa(), paramalr1.fb(), paramalr1.fc())) {
                        j = 1;
                        break;
                      }
                  }
                  if (j == 0);
                }
              }
            }
            else if ((0x400 & l) != 0L) {
              if (((paramalr1 instanceof dhJ)) && ((paramalr2 instanceof dhJ)))
              {
                localObject1 = ((dhJ)paramalr1).atN().E(paramalr2.fa(), paramalr2.fb(), paramalr2.fc());
                if (((adr)localObject1).aps() != 2);
              }

            }
            else if ((0x1000 & l) != 0L) {
              if ((paramalr1 instanceof dhJ))
              {
                localObject1 = (dhJ)paramalr1;
                if ((((dhJ)localObject1).aJr()) && (((dhJ)localObject1).afw() == paramalr2))
                {
                  if ((((dhJ)paramalr1).aJu()) || (((dhJ)paramalr1).byd()));
                }
              }
            }
            else if ((0x4000 & l) != 0L) {
              if ((paramalr1 instanceof dhJ))
              {
                if (!((dhJ)paramalr1).aJu());
              }

            }
            else if ((0x0 & l) != 0L) {
              if ((paramalr1 instanceof dhJ))
              {
                if (!((dhJ)paramalr1).byc());
              }
            }
            else {
              if ((0x0 & l) != 0L) {
                if (!(paramalr2 instanceof dhJ))
                  continue;
                if ((paramalr1 instanceof dhJ)) {
                  localObject1 = (dhJ)paramalr1;
                  if ((((dhJ)localObject1).aJr()) && (((dhJ)localObject1).afw() == paramalr2)) {
                    continue;
                  }
                }
              }
              if (((0x40 & l) == 0L) || 
                ((paramalr1 instanceof cjK)))
              {
                if (((0x0 & l) == 0L) || 
                  ((paramalr1 instanceof dhJ)))
                {
                  if ((0x0 & l) != 0L) {
                    if ((paramalr1 instanceof cjK))
                    {
                      if (((cjK)paramalr1).axG() != paramalr2);
                    }

                  }
                  else if ((0x0 & l) != 0L) {
                    if ((paramalr2 instanceof cjK))
                    {
                      if (((cjK)paramalr2).axG() != paramalr1);
                    }

                  }
                  else if ((0x0 & l) != 0L) {
                    if ((paramalr2 instanceof cjK))
                    {
                      if (((cjK)paramalr2).axG() == paramalr1);
                    }

                  }
                  else if (((0x10000 & l) == 0L) || 
                    (a(paramalr1, SB.ctA.uO())))
                  {
                    if (((0x20000 & l) == 0L) || 
                      (a(paramalr1, SB.ctB.uO())))
                    {
                      if (((0x40000 & l) == 0L) || 
                        (a(paramalr1, SB.ctC.uO())))
                      {
                        if (((0x80000 & l) == 0L) || 
                          (a(paramalr1, SB.ctD.uO())))
                        {
                          if (((0x100000 & l) == 0L) || 
                            (a(paramalr1, SB.ctE.uO())))
                          {
                            if (((0x200000 & l) == 0L) || 
                              (a(paramalr1, SB.ctF.uO())))
                            {
                              if (((0x400000 & l) == 0L) || 
                                (a(paramalr1, SB.ctG.uO())))
                              {
                                if (((0x800000 & l) == 0L) || 
                                  (a(paramalr1, SB.ctH.uO())))
                                {
                                  if (((0x1000000 & l) == 0L) || 
                                    (a(paramalr1, SB.ctI.uO())))
                                  {
                                    if (((0x2000000 & l) == 0L) || 
                                      (a(paramalr1, SB.ctJ.uO())))
                                    {
                                      if (((0x4000000 & l) == 0L) || 
                                        (a(paramalr1, SB.ctK.uO())))
                                      {
                                        if (((0x8000000 & l) == 0L) || 
                                          (a(paramalr1, SB.ctL.uO())))
                                        {
                                          if ((0x40000000 & l) != 0L) {
                                            if ((paramalr2 instanceof dhJ))
                                            {
                                              localObject1 = ((dhJ)paramalr2).aJp();
                                              if (localObject1 != null)
                                              {
                                                if (!a(paramalr1, ((bhh)localObject1).uO()));
                                              }
                                            }
                                          }
                                          else
                                          {
                                            Object localObject2;
                                            if ((0x80000000 & l) != 0L) {
                                              if (((paramalr2 instanceof dhJ)) && ((paramalr1 instanceof dhJ)))
                                              {
                                                localObject1 = ((dhJ)paramalr2).aJp();
                                                localObject2 = ((dhJ)paramalr1).aJp();

                                                if ((localObject1 != null) && (localObject2 != null))
                                                {
                                                  if (((bhh)localObject1).nn() != ((bhh)localObject2).nn());
                                                }
                                              }

                                            }
                                            else if ((0x0 & l) != 0L) {
                                              if ((paramalr2 instanceof dhJ))
                                              {
                                                localObject1 = (dhJ)paramalr2;
                                                if (((dhJ)localObject1).cRn() != paramalr1);
                                              }

                                            }
                                            else if ((0x0 & l) != 0L) {
                                              if ((paramalr1 instanceof dhJ))
                                              {
                                                localObject1 = (dhJ)paramalr1;
                                                if (!((dhJ)localObject1).c(cfY.hBQ));
                                              }

                                            }
                                            else if ((0x0 & l) != 0L) {
                                              if ((paramalr1 instanceof dhJ))
                                              {
                                                localObject1 = (dhJ)paramalr1;
                                                if (((dhJ)localObject1).c(cfY.hBQ));
                                              }

                                            }
                                            else if ((0x0 & l) != 0L) {
                                              if ((paramalr1 instanceof dle))
                                              {
                                                localObject1 = (dle)paramalr1;
                                                if (!((dle)localObject1).c(cfY.hBR));
                                              }

                                            }
                                            else if (((0x0 & l) != 0L) && 
                                              ((paramalr1 instanceof cjK)))
                                            {
                                              localObject1 = (cjK)paramalr1;
                                              if (((cjK)localObject1).c(cfY.hBR));
                                            }
                                            else if ((0x8000 & l) != 0L) {
                                              localObject1 = ((dhJ)paramalr1).bEY();
                                              if (localObject1 != null)
                                              {
                                                localObject2 = ((cOE)localObject1).LB();
                                                if (localObject2 != null)
                                                {
                                                  if (((UG)localObject2).au(paramalr1.fa(), paramalr1.fb()) != null);
                                                }
                                              }

                                            }
                                            else if ((1L & l) != 0L)
                                            {
                                              if (((paramalr2 instanceof dhJ)) && ((paramalr1 instanceof dhJ)))
                                              {
                                                localObject1 = (dhJ)paramalr1;
                                                if (((dhJ)localObject1).c(cfY.hBt));
                                              }
                                              else
                                              {
                                                localbtH = btH.gct;
                                              }
                                            } else { return new Cs(btH.gcp, localArrayList); }  }  }  }  }  }  }  }  }  }  }  }  }  }  }  }  }  } 
        }
      }
    }
    return new Cs(localbtH, localArrayList);
  }

  private static boolean a(alr paramalr, short paramShort) {
    if (!(paramalr instanceof dhJ))
      return false;
    bhh localbhh = ((dhJ)paramalr).aJp();
    if (localbhh == null)
      return false;
    return paramShort == localbhh.uO();
  }
}