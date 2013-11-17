import com.ankamagames.wakfu.client.binaryStorage.AchievementListBinaryData;
import java.util.Arrays;

class cQm
  implements gd
{
  cQm(cdb paramcdb)
  {
  }

  public void a(AchievementListBinaryData paramAchievementListBinaryData)
  {
    int i = paramAchievementListBinaryData.getId();

    cYu[] arrayOfcYu1 = paramAchievementListBinaryData.bzG();
    cYu[] arrayOfcYu2 = new cYu[arrayOfcYu1.length];
    System.arraycopy(arrayOfcYu1, 0, arrayOfcYu2, 0, arrayOfcYu1.length);
    Arrays.sort(arrayOfcYu2, aMc.eqV);

    int[] arrayOfInt = new int[arrayOfcYu2.length];
    int j = 0; for (int k = arrayOfcYu2.length; j < k; j++) {
      arrayOfInt[j] = arrayOfcYu2[j].sY();
    }

    dmz localdmz = new dmz(i);
    localdmz.Z(arrayOfInt);

    sx.bbD.a(localdmz);
  }
}