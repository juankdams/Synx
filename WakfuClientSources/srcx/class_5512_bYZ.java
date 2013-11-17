import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;

public class bYZ
{
  private static final short hpn = 2;
  private static final bur hpo = new cyI();

  public static cuB a(cXf paramcXf, dMM paramdMM, int paramInt1, int paramInt2, Nm paramNm, cGw paramcGw, dqg paramdqg)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    ArrayList localArrayList = paramcXf.a(paramInt1, paramInt2, paramdMM.getAltitude(), bYP.hoH, 0.0F, 0.0F);
    int i = localArrayList.size();
    if (i == 0) {
      return null;
    }

    int j = paramdMM.dpB();
    int k = paramdMM.dpC();
    short s1 = paramdMM.cJB() != null ? paramdMM.cJB().fc() : paramdMM.fc();

    paramdqg.cXr();
    paramdqg.ae(j, k, s1);
    paramdqg.a(paramNm);

    paramdqg.a(paramdMM.BC(), paramdMM.afD(), paramdMM.arG());
    cwO.a(paramdMM.BC(), paramdMM.afD(), paramdMM.arG());
    int m = 0;
    if (paramcGw == null) {
      paramcGw = new cGw();
      m = 1;
    }
    paramdqg.a(paramcGw);

    bKR localbKR = new bKR(10);
    int n = 2147483647;
    long[] arrayOfLong = null;
    for (int i1 = 0; i1 < i; i1++)
    {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)localArrayList.get(i1);
      ScreenElement localScreenElement = localDisplayedScreenElement.bpc();

      if (localbKR.add(localDisplayedScreenElement.bpf()))
      {
        int i4 = localScreenElement.ddI();
        int i5 = localScreenElement.ddJ();
        short s2 = localScreenElement.ddH();

        short s3 = cwO.U(i4, i5, s2);
        if (Math.abs(s3 - s2) <= 2) {
          s2 = s3;
        }

        if (m != 0) {
          cwO.a(j, k, i4, i5, paramcGw);
        }
        paramdqg.af(i4, i5, s2);
        int i6 = paramdqg.cXv();
        if ((i6 != -1) && (i6 != 0))
        {
          if (i6 < n)
          {
            n = i6;
            arrayOfLong = (long[])paramdqg.cXt().clone();
          }
        }
      }
    }
    if (arrayOfLong == null) {
      return null;
    }

    int[][] arrayOfInt = new int[n][3];
    for (int i2 = 0; i2 < n; i2++) {
      int i3 = n - 1 - i2;
      arrayOfInt[i2][0] = dqg.jT(arrayOfLong[i3]);
      arrayOfInt[i2][1] = dqg.jU(arrayOfLong[i3]);
      arrayOfInt[i2][2] = dqg.jV(arrayOfLong[i3]);
    }
    return new cuB(arrayOfInt);
  }

  public static cYk a(cXf paramcXf, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a(paramcXf, paramInt1, paramInt2, paramBoolean, paramBoolean);
  }

  public static cYk a(cXf paramcXf, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) || (paramBoolean2))
    {
      localArrayList = paramcXf.ak(paramInt1, paramInt2);
      if (localArrayList.size() != 0) {
        localObject = (cUo)localArrayList.get(0);
        if ((localObject != null) && (
          ((paramBoolean1) && (((cUo)localObject).afD() == 0)) || ((paramBoolean2) && (((cUo)localObject).afD() > 0))))
        {
          return ((cUo)localObject).atB();
        }

      }

    }

    ArrayList localArrayList = paramcXf.a(paramInt1, paramInt2, 0.0F, bYP.hoH);
    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return null;
    }

    Object localObject = ((DisplayedScreenElement)localArrayList.get(0)).bpc();
    return new cYk(((ScreenElement)localObject).ddI(), ((ScreenElement)localObject).ddJ(), ((ScreenElement)localObject).ddH());
  }

  public static ArrayList b(cXf paramcXf, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramcXf, paramInt1, paramInt2, paramBoolean1, paramBoolean2, hpo);
  }

  public static ArrayList a(cXf paramcXf, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, bur parambur)
  {
    if ((paramBoolean1) || (paramBoolean2))
    {
      localArrayList1 = paramcXf.ak(paramInt1, paramInt2);
      if (!localArrayList1.isEmpty()) {
        cUo localcUo = (cUo)localArrayList1.get(0);
        if ((localcUo != null) && (
          ((paramBoolean1) && (localcUo.afD() == 0)) || ((paramBoolean2) && (localcUo.afD() > 0) && (parambur.c(localcUo)))))
        {
          ArrayList localArrayList2 = new ArrayList(1);
          localArrayList2.add(localcUo.atB());
          return localArrayList2;
        }

      }

    }

    ArrayList localArrayList1 = paramcXf.a(paramInt1, paramInt2, 0.0F, bYP.hoH);
    if ((localArrayList1 == null) || (localArrayList1.isEmpty())) {
      return null;
    }
    return O(localArrayList1);
  }

  private static ArrayList O(ArrayList paramArrayList) {
    int i = paramArrayList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      ScreenElement localScreenElement = ((DisplayedScreenElement)paramArrayList.get(j)).bpc();
      localArrayList.add(new cYk(localScreenElement.ddI(), localScreenElement.ddJ(), localScreenElement.ddH()));
    }
    return localArrayList;
  }
}