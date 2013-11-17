class bCx
  implements dFU
{
  public boolean a(mE parammE)
  {
    String str1 = parammE.he();
    String str2 = parammE.uo();
    String str3 = bU.fH().getString("group.guild.invitation", new Object[] { str1, str2 });
    String str4 = Cn.et(4);

    cKX localcKX = cBQ.cxL().a(str3, str4, 2073L, 102, 1);

    localcKX.a(new bRx(this));

    return false;
  }

  public int vN() {
    return 20056;
  }
}