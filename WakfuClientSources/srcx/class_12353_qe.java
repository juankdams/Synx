public enum qe
{
  private short aDx;

  private qe(short arg3)
  {
    short s;
    this.aDx = s;
  }

  public String getName() {
    switch (bkV.fBr[ordinal()]) {
    case 1:
      return bU.fH().getString("chat.friendList");
    case 2:
      return bU.fH().getString("chat.ignoreList");
    }
    return name();
  }

  public short nc()
  {
    return this.aDx;
  }

  public static qe s(short paramShort) {
    for (qe localqe : values()) {
      if (localqe.nc() == paramShort) {
        return localqe;
      }
    }
    return null;
  }
}