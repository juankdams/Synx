import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ckc
  implements aBt
{
  public static final int hKs = 102;
  private static final int hKt = 1500;
  private static final int hcp = 250;
  private static final String[] aBO = { "worldAndFightBarDialog" };
  public static final String hKu = "ecaflipDice";
  public static final String hKv = "ecaflipClubImage";
  public static final String hKw = "ecaflipClubLabel";
  public static final String hKx = "AnimDe-";
  private final bKm aBR;
  private final ArrayList hKy = new ArrayList();
  private final List hKz = new ArrayList();
  private final ArrayList hKA = new ArrayList();

  public ckc(bKm parambKm) {
    this.aBR = parambKm;

    for (String str : aBO) {
      cpa localcpa = cBQ.cxL().coO().nf(str);
      if (localcpa != null)
      {
        auC localauC = (auC)localcpa.fi("ecaflipDice");
        if (localauC != null) {
          this.hKy.add(localauC);
        }
        czv localczv = (czv)localcpa.fi("ecaflipClubImage");
        if (localczv != null)
          this.hKz.add(localczv);
        caF localcaF = (caF)localcpa.fi("ecaflipClubLabel");
        if (localcaF != null)
          this.hKA.add(localcaF);
      }
    }
  }

  public void a(bXL parambXL)
  {
    doA localdoA;
    bJC localbJC;
    if (parambXL.getId() == 1000) {
      localdoA = ((cpl)parambXL).coV();
      if (localdoA.getId() != bsj.fSj.getId())
        return;
      if (localdoA.bkf() != this.aBR) {
        return;
      }
      localbJC = ((bPD)localdoA).bWk();
      if (localbJC.bQW() == 102)
        dd(localbJC.nU());
    } else if (parambXL.getId() == 1001) {
      localdoA = ((ayh)parambXL).aJX();
      if (localdoA.getId() != bsj.fSj.getId())
        return;
      if (localdoA.bkf() != this.aBR) {
        return;
      }
      localbJC = ((bPD)localdoA).bWk();
      if (localbJC.bQW() == 102)
        dd((short)0);
    }
  }

  public void a(cjK paramcjK) {
  }

  public void b(cjK paramcjK) {
  }

  private void dd(short paramShort) {
    for (int i = this.hKA.size() - 1; i >= 0; i--)
      ((caF)this.hKA.get(i)).setText(String.valueOf(paramShort));
  }

  private static void a(List paramList, Collection paramCollection) {
    for (int i = paramList.size() - 1; i >= 0; i--)
      paramCollection.add(((dOc)paramList.get(i)).getAppearance());
  }

  public void dL(byte paramByte) {
    if ((paramByte < 1) || (paramByte > 6)) {
      return;
    }
    if ((this.hKA.isEmpty()) || (this.hKz.isEmpty()) || (this.hKy.isEmpty()))
    {
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    a(this.hKA, localArrayList1);
    a(this.hKz, localArrayList1);

    dOc localdOc1 = (dOc)this.hKA.get(0);

    localdOc1.a(new aga(bNa.gRx, bNa.gRu, localArrayList1, 0, 250, 1, ddp.kWG));

    localdOc1.a(new aga(bNa.gRu, bNa.gRx, localArrayList1, 1500, 250, 1, ddp.kWG));

    ArrayList localArrayList2 = new ArrayList();
    for (int i = this.hKy.size() - 1; i >= 0; i--) {
      auC localauC = (auC)this.hKy.get(i);
      localauC.setAnimName("AnimDe-" + paramByte);
      localArrayList2.add(localauC);
    }
    dOc localdOc2 = (dOc)this.hKy.get(0);

    localdOc2.a(new aga(bNa.gRu, bNa.gRx, localArrayList2, 0, 250, 1, ddp.kWG));

    localdOc2.a(new aga(bNa.gRx, bNa.gRu, localArrayList2, 1500, 250, 1, ddp.kWG));
  }

  public void clear() {
    cpX.hZN.a(this.aBR);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EcaflipFightListener");
    localStringBuilder.append("{m_character=").append(this.aBR);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}