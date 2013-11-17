import java.io.File;
import java.util.Enumeration;
import java.util.StringTokenizer;

public abstract class amW extends aGK
  implements gb
{
  protected bQM dpI = new bQM();

  public void b(FF paramFF)
  {
    super.b(paramFF);
    this.dpI.b(paramFF);
  }

  public cMT OA()
  {
    return this.dpI.OA();
  }

  public cMT OB()
  {
    return this.dpI.OB();
  }

  public cMT OC()
  {
    return this.dpI.OC();
  }

  public cMT OD()
  {
    return this.dpI.OD();
  }

  public EZ azr()
  {
    return this.dpI.azr();
  }

  public void bE(String paramString)
  {
    this.dpI.bE(paramString);
  }

  public void eL(String paramString)
  {
    d("The items attribute is deprecated. Please use the includes attribute.", 1);

    if ((paramString == null) || (paramString.equals("*")) || (paramString.equals(".")))
    {
      OA().setName("**");
    } else {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ", ");
      while (localStringTokenizer.hasMoreTokens()) {
        String str = localStringTokenizer.nextToken().trim();
        if (str.length() > 0)
          OA().setName(str + "/**");
      }
    }
  }

  public void bF(String paramString)
  {
    this.dpI.bF(paramString);
  }

  public void eM(String paramString)
  {
    d("The ignore attribute is deprecated.Please use the excludes attribute.", 1);

    if ((paramString != null) && (paramString.length() > 0)) {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ", ", false);

      while (localStringTokenizer.hasMoreTokens())
        OC().setName("**/" + localStringTokenizer.nextToken().trim() + "/**");
    }
  }

  public void cv(boolean paramBoolean)
  {
    this.dpI.cv(paramBoolean);
  }

  protected bqf D(File paramFile)
  {
    this.dpI.s(paramFile);
    return this.dpI.y(Ga());
  }

  public void u(File paramFile)
  {
    this.dpI.u(paramFile);
  }

  public void v(File paramFile)
  {
    this.dpI.v(paramFile);
  }

  public void setCaseSensitive(boolean paramBoolean)
  {
    this.dpI.setCaseSensitive(paramBoolean);
  }

  public void cw(boolean paramBoolean)
  {
    this.dpI.cw(paramBoolean);
  }

  public boolean lT()
  {
    return this.dpI.lT();
  }

  public int lU()
  {
    return this.dpI.lU();
  }

  public ank[] a(FF paramFF)
  {
    return this.dpI.a(paramFF);
  }

  public Enumeration lV()
  {
    return this.dpI.lV();
  }

  public void a(ank paramank)
  {
    this.dpI.a(paramank);
  }

  public void a(eO parameO)
  {
    this.dpI.a(parameO);
  }

  public void a(bQW parambQW)
  {
    this.dpI.a(parambQW);
  }

  public void a(czH paramczH)
  {
    this.dpI.a(paramczH);
  }

  public void a(dbz paramdbz)
  {
    this.dpI.a(paramdbz);
  }

  public void a(dIM paramdIM)
  {
    this.dpI.a(paramdIM);
  }

  public void a(diF paramdiF)
  {
    this.dpI.a(paramdiF);
  }

  public void a(dFB paramdFB)
  {
    this.dpI.a(paramdFB);
  }

  public void a(cNP paramcNP)
  {
    this.dpI.a(paramcNP);
  }

  public void a(arQ paramarQ)
  {
    this.dpI.a(paramarQ);
  }

  public void a(bxQ parambxQ)
  {
    this.dpI.a(parambxQ);
  }

  public void a(UF paramUF)
  {
    this.dpI.a(paramUF);
  }

  public void a(bJY parambJY)
  {
    this.dpI.a(parambJY);
  }

  public void a(cPj paramcPj)
  {
    this.dpI.a(paramcPj);
  }

  public void a(buP parambuP)
  {
    this.dpI.a(parambuP);
  }

  public void a(aS paramaS)
  {
    this.dpI.a(paramaS);
  }

  public void a(dSW paramdSW)
  {
    this.dpI.a(paramdSW);
  }

  public void a(bMy parambMy)
  {
    this.dpI.a(parambMy);
  }

  public void a(NA paramNA)
  {
    this.dpI.a(paramNA);
  }

  public void b(ank paramank)
  {
    this.dpI.b(paramank);
  }

  protected final bQM azs()
  {
    return this.dpI;
  }
}