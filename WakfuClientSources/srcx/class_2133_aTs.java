public class aTs
{
  public static final String PACKAGE = "wakfu.split";
  public static byte eRb;
  public static byte dMs;
  public static long eRc;
  public static long eRd;
  private static int eRe;
  private static gA aUe;
  private static BG aWp;
  private static short eRf;
  private static Long eRg;
  private static int eRh;

  public static void decreaseSplitCount(cSx paramcSx, aTp paramaTp)
  {
    if (paramaTp.getText().length() == 0) {
      return;
    }
    int i = bUD.aR(paramaTp.getText());
    i--;
    a(paramaTp, i, true);
  }

  public static void keyType(cSx paramcSx, aTp paramaTp)
  {
    if (((paramcSx instanceof ctH)) && 
      (((ctH)paramcSx).getKeyChar() == '\n')) {
      validSplit(paramcSx);
      return;
    }

    if (paramaTp.getText().length() == 0) {
      return;
    }
    int i = bUD.aR(paramaTp.getText());
    a(paramaTp, i, false);
  }

  private static void a(aTp paramaTp, int paramInt, boolean paramBoolean) {
    if (paramInt < 0) {
      paramInt = 0;
      paramBoolean = true;
    } else if (paramInt > eRe) {
      paramInt = eRe;
      paramBoolean = true;
    }
    eRh = paramInt;
    if (paramBoolean)
      paramaTp.setText(String.valueOf(paramInt));
  }

  public static void increaseSplitCount(cSx paramcSx, aTp paramaTp) {
    if (paramaTp.getText().length() == 0) {
      return;
    }
    int i = bUD.aR(paramaTp.getText());
    i++;
    a(paramaTp, i, true);
  }

  public static void validSplit(cSx paramcSx) {
    int i = 0;
    short s = 0;
    if (biQ())
      i = eRh;
    else {
      s = (short)eRh;
    }

    cBQ.cxL().mW("splitStackDialog");
    if ((s > 0) || (i > 0))
    {
      Object localObject;
      switch (eRf) {
      case 16804:
      case 16810:
      case 16811:
      case 16820:
        break;
      case 16825:
        localObject = new czW();
        ((czW)localObject).d(eRf);
        ((czW)localObject).setItem(aUe);
        ((czW)localObject).l(s);
        ((czW)localObject).setSourceUniqueId(eRc);
        ((czW)localObject).setDestinationUniqueId(eRd);
        ((czW)localObject).cz(dMs);
        cjO.clE().j((cWG)localObject);
        return;
      case 19324:
      case 19325:
        localObject = new bzu();
        ((bzu)localObject).e(i);
        ((bzu)localObject).d(eRf);
        cjO.clE().j((cWG)localObject);
        return;
      case 19321:
      case 19327:
        localObject = new czW();
        ((czW)localObject).d(eRf);
        ((czW)localObject).setItem(aUe);
        ((czW)localObject).l(s);
        ((czW)localObject).setDestinationUniqueId(getDestinationUniqueId());
        ((czW)localObject).cz(getDestinationPosition());
        cjO.clE().j((cWG)localObject);
        return;
      case 19140:
      case 19141:
      case 19320:
      case 19326:
        localObject = new czW();
        ((czW)localObject).d(eRf);
        ((czW)localObject).c(aUe.oj());
        ((czW)localObject).ar(s);
        ((czW)localObject).cz(dMs);
        cjO.clE().j((cWG)localObject);
        return;
      case 17304:
        localObject = new cHE();
        ((cHE)localObject).aC((short)dMs);
        ((cHE)localObject).setItem(aUe);
        ((cHE)localObject).l(s);
        ((cHE)localObject).d(eRf);
        cjO.clE().j((cWG)localObject);
        return;
      case 16844:
        localObject = new czW();
        ((czW)localObject).setItem(aUe);
        ((czW)localObject).l(s);
        ((czW)localObject).d(eRf);
        cjO.clE().j((cWG)localObject);
        return;
      case 19258:
        localObject = new dce();
        ((dce)localObject).setItem(aUe);
        ((dce)localObject).ar(s);
        cjO.clE().j((cWG)localObject);
        return;
      case 17305:
        localObject = new cHE();
        ((cHE)localObject).setMerchantItem(aWp);
        ((cHE)localObject).aC((short)dMs);
        ((cHE)localObject).iJ(eRd);
        ((cHE)localObject).l(s);
        ((cHE)localObject).d(17305);
        cjO.clE().j((cWG)localObject);

        dce localdce = new dce();
        localdce.setItem(aUe);
        localdce.ar(s);
        cjO.clE().j(localdce);
        return;
      }

      if (aYP.feK.bnQ())
      {
        cBQ.cxL().mW("splitStackDialog");
        if (s > 0) {
          localObject = new bVD();
          ((bVD)localObject).setExchangeId(eRg.longValue());
          ((bVD)localObject).setItem(aUe);
          ((bVD)localObject).uh(s);
          ((bVD)localObject).d(eRf);
          cjO.clE().j((cWG)localObject);
        }

      }
      else
      {
        localObject = new czW();
        ((czW)localObject).cz(dMs);
        ((czW)localObject).setSourcePosition(eRb);
        ((czW)localObject).setSourceUniqueId(eRc);
        ((czW)localObject).setDestinationUniqueId(eRd);
        ((czW)localObject).setItem(aUe);
        ((czW)localObject).l(s);
        ((czW)localObject).d(eRf);
        cjO.clE().j((cWG)localObject);
      }
    }
  }

  private static boolean biQ()
  {
    return (eRf == 16823) || (eRf == 19324) || (eRf == 19325);
  }

  public static void setMaxQuantity(int paramInt)
  {
    eRe = paramInt;
  }

  public static void setMessageType(short paramShort) {
    eRf = paramShort;
  }

  public static void setExchangeId(long paramLong) {
    eRg = Long.valueOf(paramLong);
  }

  public static void setMerchantItem(BG paramBG) {
    aWp = paramBG;
  }

  public static void setItem(gA paramgA) {
    aUe = paramgA;
    eRh = paramgA.nP();
  }

  public static void setSourceUniqueId(long paramLong) {
    eRc = paramLong;
  }

  public static void setSourcePosition(byte paramByte) {
    eRb = paramByte;
  }

  public static void setDestinationPosition(Byte paramByte) {
    dMs = paramByte.byteValue();
  }

  public static void setDestinationUniqueId(long paramLong) {
    eRd = paramLong;
  }

  public static byte getSourcePosition() {
    return eRb;
  }

  public static byte getDestinationPosition() {
    return dMs;
  }

  public static long getSourceUniqueId() {
    return eRc;
  }

  public static long getDestinationUniqueId() {
    return eRd;
  }

  public static int getMaxQuantity() {
    return eRe;
  }

  public static gA getItem() {
    return aUe;
  }

  public static BG getMerchantItem() {
    return aWp;
  }

  public static short getMessageType() {
    return eRf;
  }

  public static Long getExchangeId() {
    return eRg;
  }
}