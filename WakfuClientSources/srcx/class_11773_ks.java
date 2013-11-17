import java.util.ArrayList;
import java.util.Iterator;

public class ks extends dFz
{
  private bBn aNS;
  private gA aNT;
  private bZH aNU;
  private azp aNV;
  private dpI aNW;
  private boolean aNX;

  public ks(bBn parambBn, gA paramgA, azp paramazp, bZH parambZH, XG paramXG)
  {
    this(parambBn, paramgA, paramgA != null ? paramgA.nU() : parambBn.nU(), paramazp, parambZH, paramXG);
  }

  public ks(bBn parambBn, gA paramgA, short paramShort, azp paramazp, bZH parambZH, XG paramXG)
  {
    super(paramXG.a(parambBn, paramgA), 0, paramShort, true, null, null, paramXG.ajH(), 0);
    this.aNS = parambBn;
    this.aNT = paramgA;
    this.aNV = paramazp;
    this.aNU = parambZH;
    this.aNX = paramXG.ajG();
  }

  public void f(ArrayList paramArrayList)
  {
    Iterator localIterator;
    if (this.aNS.acu() == cqG.iat)
      for (localIterator = ((dHt)this.aNS).cCK(); localIterator.hasNext(); ) {
        aLM localaLM = (aLM)localIterator.next();
        dpI localdpI = localaLM.nc(0);
        if (((!this.aNX) || (!localdpI.bev())) && ((this.aNX) || (localdpI.bev())))
        {
          aFA localaFA = cxo.xb(localdpI.eo());
          lZ locallZ = cxo.ill.cLY();
          this.aNW = localaLM.nc(localaLM.bdo() - 1);
          localaFA.a(locallZ, localdpI, this);
          paramArrayList.add(locallZ.tP());
        }
      }
    this.aNW = null;
  }

  public String a(String paramString, dpI paramdpI) {
    if (((this.aNX) && (paramdpI.bev())) || ((!this.aNX) && (!paramdpI.bev())))
    {
      return "";
    }

    short s = this.aNT != null ? this.aNT.nU() : this.aNS.nU();

    doA localdoA = (doA)bsj.bAv().kD(paramdpI.eo());
    dSc localdSc = null;
    if ((localdoA instanceof dqZ))
      localdSc = ((dqZ)localdoA).sw();
    else if ((localdoA instanceof aYO))
      localdSc = ((aYO)localdoA).sw();
    else if ((localdoA instanceof kM))
      localdSc = ((kM)localdoA).sw();
    else if ((localdoA instanceof cJc)) {
      localdSc = ((cJc)localdoA).sw();
    }

    if ((localdSc != null) && (this.aNU != null) && (this.aNV != null)) {
      int i = 0;
      int j = 0;

      azO[] arrayOfazO = this.aNT == null ? this.aNS.bKn().nh() : this.aNT.oi().bKn().nh();

      if (arrayOfazO.length > 0) {
        i = paramdpI.a(0, s, dNF.meh);
        if (this.aNW != null) {
          j = this.aNW.a(0, s, dNF.meh);
        }

        int k = 0;
        int m = 0;
        Object localObject1 = null;

        int n = arrayOfazO.length;
        Object localObject2;
        Object localObject3;
        if (this.aNT != null)
        {
          for (; (k < n) && (m == 0); k++) {
            localObject2 = arrayOfazO[k];
            localObject3 = (gA)this.aNU.dB((short)((azO)localObject2).bJ());
            if ((localObject3 != null) && (((gA)localObject3).oj() == this.aNT.oj())) {
              m = 1;
              localObject1 = localObject3;
            }
          }
        }

        if (m == 0)
        {
          for (k = 0; 
            k < n; k++) {
            localObject2 = arrayOfazO[k];
            localObject3 = (gA)this.aNU.dB((short)((azO)localObject2).bJ());
            if (localObject3 == null)
            {
              break;
            }
          }
          if (k == arrayOfazO.length)
          {
            for (k = 0; 
              k < n; k++) {
              localObject2 = arrayOfazO[k];
              localObject3 = (gA)this.aNU.dB((short)((azO)localObject2).bJ());
              if ((localObject3 != null) && (((gA)localObject3).ok() == this.aNS.getId()))
              {
                break;
              }
            }
          }
          if (k == arrayOfazO.length) {
            k = 0;
          }

        }

        if (m != 0) {
          localObject2 = localObject1;
        } else {
          localObject3 = arrayOfazO[k];
          localObject2 = (gA)this.aNU.dB((short)((azO)localObject3).bJ());
        }

        if (localObject2 != null) {
          int i1 = ((gA)localObject2).nU();
          Iterator localIterator = ((gA)localObject2).iterator();
          while (localIterator.hasNext()) {
            dpI localdpI = (dpI)localIterator.next();
            if ((localdpI.eo() == paramdpI.eo()) && (localdpI.zB() <= i1) && (localdpI.zC() >= i1))
            {
              i -= localdpI.a(0, i1, dNF.meh);
              if (this.aNW != null) {
                j -= localdpI.a(0, i1, dNF.meh);
              }
            }
          }
        }

      }

      if (localdSc.isNegative() != (localdoA.DU() == cMe.krl)) {
        i = -i;
        if (this.aNW != null) {
          j = -j;
        }
      }

      lZ locallZ = cxo.ill.cLY();
      if ((i != 0) || (j != 0))
      {
        locallZ.a(" (");
        locallZ.tz();
        locallZ.am(i == 0 ? "ffffff" : i > 0 ? "00b400" : "b40000");
        if (i > 0) {
          locallZ.a("+");
        }
        locallZ.bw(i).tA();
        if (this.aNW != null) {
          locallZ.a("/").tz();

          locallZ.am(j == 0 ? "ffffff" : j > 0 ? "00b400" : "b40000");
          if (j > 0) {
            locallZ.a("+");
          }
          locallZ.bw(j).tA();
        }
        locallZ.a(")");
        if (this.aNW != null) {
          cxo.ilm.a(locallZ);
        }
      }
      else
      {
        locallZ.a(" (").bw(localdSc.isExpandable() ? this.aNV.f(localdSc) : this.aNV.e(localdSc)).a(")");
      }

      return paramString + locallZ.tP();
    }
    return paramString;
  }
}