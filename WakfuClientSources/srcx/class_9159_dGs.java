class dGs
  implements bWp
{
  dGs(dpr paramdpr, bZH parambZH, bMD parambMD)
  {
  }

  public void a(dKD paramdKD, bJz parambJz)
  {
    gA localgA;
    if (paramdKD.asL() == bKq.gNh) {
      localgA = (gA)this.lQX.dB((short)(int)-(paramdKD.oj() + 1L));
      if ((localgA == null) && (2145 != paramdKD.ok())) {
        parambJz.e(paramdKD);
      }
    }

    if (paramdKD.asL() == bKq.gNg) {
      localgA = (gA)this.lQX.hh(paramdKD.ok());
      if ((localgA != null) && (localgA.isActive())) {
        if (localgA.isUsable())
          paramdKD.bg((byte)2);
        else
          paramdKD.bg((byte)3);
      }
      else {
        localgA = (gA)this.lQY.ye(paramdKD.ok());
        if ((localgA != null) && (localgA.isActive())) {
          azO[] arrayOfazO = localgA.oi().bKn().nh();
          if (arrayOfazO.length == 0)
          {
            if (localgA.isUsable())
              paramdKD.bg((byte)4);
            else {
              paramdKD.bg((byte)1);
            }
          }
          else if ((localgA.oi().a(azO.dRM)) || (localgA.oi().a(azO.dRN)))
          {
            paramdKD.bg((byte)5);
          }
          else paramdKD.bg((byte)0);
        }
        else
        {
          parambJz.f(parambJz.c(paramdKD), true);
        }
      }
    }
  }
}