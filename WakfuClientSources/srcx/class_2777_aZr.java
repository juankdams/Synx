import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class aZr
{
  private static final Logger K = Logger.getLogger(aZr.class);

  private static final aZr ffV = new aZr();

  private static final String[] ffW = (String[])localArrayList.toArray(new String[localArrayList.size()]);

  private static long ffX = -9223372036854775808L;
  private static long ffY = byn.jp("CharacterImage-Default");

  private final aXt ffZ = new aXt();
  private final btQ fga = new btQ();
  private final aXt fgb = new aXt();

  private static final int[] fgc = { 1036, 1037, 1038, 1039, 1040 };

  private static final int[] fgd = { 1007, 1011, 1051 };

  private static final int[] fge = new int[0];

  private static void a(ArrayList paramArrayList, String[] paramArrayOfString)
  {
    for (String str : paramArrayOfString)
      paramArrayList.add(str);
  }

  public static aZr boo()
  {
    return ffV;
  }

  public void a(long paramLong, bxz parambxz) {
    ArrayList localArrayList = (ArrayList)this.ffZ.get(paramLong);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.ffZ.c(paramLong, localArrayList);
    }

    if (!localArrayList.contains(parambxz))
      localArrayList.add(parambxz);
  }

  public void b(long paramLong, bxz parambxz)
  {
    ArrayList localArrayList = (ArrayList)this.ffZ.get(paramLong);
    if (localArrayList == null) {
      return;
    }

    localArrayList.remove(parambxz);
    if (localArrayList.size() == 0)
      this.ffZ.remove(paramLong);
  }

  private long bop()
  {
    return byn.jp("CharacterImage-" + ffX++);
  }

  public uz eZ(long paramLong)
  {
    return i(paramLong, false);
  }

  public uz i(long paramLong, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.fga.N(paramLong))) {
      localObject = tq.Bg().aw(this.fga.gd(paramLong));
      if (localObject != null) {
        return localObject;
      }

    }

    Object localObject = (Jj)this.fgb.remove(paramLong);
    if (localObject != null) {
      ((Jj)localObject).cancel();
    }

    Su localSu = CA.Lv().bj(paramLong);

    if (localSu == null) {
      uz localuz = tq.Bg().aw(ffY);
      if (localuz != null) {
        return localuz;
      }
      String str = ay.bd().a("defaultSmallMonsterIllustrationPath", "defaultIconPath", new Object[0]);
      return tq.Bg().b(dHL.lSB.dhZ(), ffY, str, false);
    }

    a(localSu.aeL(), paramLong);

    return null;
  }

  private void a(long paramLong, uz paramuz, String paramString) {
    ArrayList localArrayList = (ArrayList)this.ffZ.get(paramLong);
    if (localArrayList == null) {
      return;
    }

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      bxz localbxz = (bxz)localArrayList.get(i);
      localbxz.a(paramuz, paramString);
    }
  }

  private crX a(byte[] paramArrayOfByte, long paramLong) {
    crX localcrX = crX.b(paramArrayOfByte, "PNG");
    if (localcrX == null) {
      a(paramLong, null, "Impossible de charger l'image.");
      return null;
    }
    return localcrX;
  }

  private void a(bAF parambAF, long paramLong) {
    float f1 = 0.7F;
    float f2 = -6.0F;
    float f3 = 2.0F;
    int i = bUD.aR(parambAF.asS());
    if (Arrays.binarySearch(fgc, i) >= 0) {
      f1 = -0.5F;
      f2 = -3.0F;
      f3 = 2.0F;
    }
    if (Arrays.binarySearch(fgd, i) >= 0) {
      f1 = 0.3F;
      f2 = -1.0F;
      f3 = 2.0F;
    }

    Jj localJj = new Jj(64, 64, f3, f1, f2, WakfuClientInstance.awy().rs());
    this.fgb.c(paramLong, localJj);
    String str1;
    if (Arrays.binarySearch(fge, i) >= 0)
      str1 = "1_AnimStatique-HorsCombat";
    else {
      str1 = "1_AnimStatique";
    }

    dR localdR = parambAF.aty();
    if (localdR == null) {
      String str2 = "";
      if ((parambAF instanceof cew)) {
        Su localSu = ((cew)parambAF).cbD();
        str2 = localSu.toString();
      }
      K.error("On veut générer une image d'un anm null pour actor " + parambAF.getId() + " name=" + str2);
      return;
    }
    localJj.a(localdR, str1, ffW);

    localJj.a("png", new bBZ(this, paramLong));
  }

  public void fa(long paramLong)
  {
    if (this.ffZ.N(paramLong))
      i(paramLong, true);
  }

  static
  {
    ArrayList localArrayList = new ArrayList();

    a(localArrayList, diq.ph("JAMBE"));
    a(localArrayList, diq.ph("PIED"));
  }
}