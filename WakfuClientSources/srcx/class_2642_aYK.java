final class aYK
{
  public static dMA m(aYQ paramaYQ)
  {
    short s = paramaYQ.readShort();
    int i = paramaYQ.readByte();
    Object localObject;
    switch (i) {
    case 0:
      localObject = new dMA();
      break;
    case 1:
      localObject = new bMj();
      break;
    case 2:
      localObject = new bMf();
      break;
    case 3:
      localObject = new UD();
      break;
    case 4:
      localObject = new bLN();
      break;
    case 5:
      localObject = new Uu();
      break;
    case 6:
      localObject = new Ui();
      break;
    case 7:
      localObject = new ajK();
      break;
    case 8:
      localObject = new bLP();
      break;
    case 9:
      localObject = new Ur();
      break;
    case 10:
      localObject = new Pl();
      break;
    case 12:
      localObject = new HW();
      break;
    case 11:
      localObject = new ajI();
      break;
    case 13:
      localObject = new XL();
      break;
    case 14:
      localObject = new bL();
      break;
    case 15:
      localObject = new czY();
      break;
    case 49:
      localObject = new TS();
      break;
    case 82:
      localObject = new TT();
      break;
    case -77:
      localObject = new bET();
      break;
    default:
      if (!bB) throw new AssertionError("shape type unsupported");
      localObject = null;
    }

    ((dMA)localObject).d(paramaYQ);
    ((dMA)localObject).bP(s);

    return localObject;
  }
}