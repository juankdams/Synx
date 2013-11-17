import org.apache.log4j.Logger;

public class cLu extends cGj
{
  private static final Logger K = Logger.getLogger(cLu.class);
  public static final String bC = "description";
  public static final String RH = "iconUrl";
  public static final String aEx = "quantity";
  public static final String[] bF = { "description", "iconUrl" };
  private final acg iKZ;

  public cLu(acg paramacg)
  {
    this.iKZ = paramacg;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    int[] arrayOfInt;
    int j;
    Object localObject;
    if (paramString.equals("description")) {
      arrayOfInt = this.iKZ.aor();
      j = (arrayOfInt != null) && (arrayOfInt.length > 0) ? arrayOfInt[0] : 0;
      localObject = this.iKZ.aos();
      if ((localObject == bSa.hbU) || (localObject == bSa.hbY)) {
        bBn localbBn = Hh.QM().dh(j);
        return localbBn.getName();
      }if (localObject == bSa.hbV)
        return bU.fH().getString("unlockedTitle", new Object[] { bU.fH().b(34, j, new Object[0]) });
      if (localObject == bSa.hbW)
        return bU.fH().b(80, j, new Object[0]);
      if (localObject == bSa.hbX)
        return bU.fH().getString("landmark.gfx");
      if (localObject == bSa.hbZ)
        return bU.fH().getString("xpGain", new Object[] { Integer.valueOf(j) });
      if (localObject == bSa.hca) {
        byte b = (byte)j;
        int k = this.iKZ.aor()[1];
        qE localqE = qE.z(b);
        String str = "aptitude.points.gain." + localqE;
        return bU.fH().getString(str, new Object[] { Integer.valueOf(k) });
      }if (localObject == bSa.hcb)
        return bU.fH().getString("reward.spellRestat");
      if (localObject == bSa.hcc)
        return bU.fH().b(8, this.iKZ.aor()[0], new Object[0]);
      if (localObject == bSa.hcd)
        return bU.fH().getString("reward.learnRecipe");
      if (localObject == bSa.hce)
        return bU.fH().getString("kama.shortGain", new Object[] { Integer.valueOf(j) });
      if (localObject == bSa.hcf) {
        return bU.fH().getString("guild.pointsGain", new Object[] { Integer.valueOf(j) });
      }
      return null;
    }if (paramString.equals("iconUrl")) {
      arrayOfInt = this.iKZ.aor();
      j = (arrayOfInt != null) && (arrayOfInt.length > 0) ? arrayOfInt[0] : 0;
      localObject = (bSa)this.iKZ.aos();
      switch (aVb.eWI[localObject.ordinal()]) {
      case 1:
      case 2:
        chm localchm = (chm)Hh.QM().dh(j);
        return localchm.cbh().getFieldValue("iconUrl");
      case 3:
        return ay.bd().K(j);
      case 4:
        return ay.bd().H(j);
      case 5:
        return ay.bd().a("pointsOfInterestIconPath", "defaultIconPath", new Object[] { Integer.valueOf(j) });
      }
      try
      {
        return String.format(ay.bd().getString("rewardTypeIconsPath"), new Object[] { Integer.valueOf(((bSa)localObject).getId()) });
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage(), localbdh);
        return null;
      }

    }

    if (paramString.equals("quantity")) {
      if ((this.iKZ.aos() == bSa.hbY) || (this.iKZ.aos() == bSa.hbU))
      {
        int i = this.iKZ.aor()[1];
        return Integer.valueOf(i);
      }
      return Integer.valueOf(1);
    }
    return null;
  }
}