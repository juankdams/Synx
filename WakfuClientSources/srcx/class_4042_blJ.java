import org.apache.log4j.Logger;

public final class blJ
{
  private static Logger K = Logger.getLogger(blJ.class);

  private static final bWH fCR = new anh();

  public static bWH bwM() {
    return fCR;
  }

  public static void a(int paramInt, bES parambES)
  {
    Object localObject;
    switch (paramInt) {
    case 4122:
      localObject = new cbz();
      break;
    case 6200:
      localObject = new cqM();
      break;
    case 6204:
      localObject = new aqS();
      break;
    case 8014:
      localObject = new dfW();
      break;
    case 4520:
      localObject = new beB();
      break;
    case 4522:
      localObject = new crB();
      break;
    case 8412:
      localObject = new bla();
      break;
    case 8302:
      localObject = new avi();
      break;
    case 8108:
      localObject = new axW();
      break;
    case 4524:
      localObject = new dBH();
      break;
    case 4528:
      localObject = new cKA();
      break;
    case 8410:
      localObject = new ato();
      break;
    case 4506:
      localObject = new ben();
      break;
    case 8106:
      localObject = new cUH();
      break;
    case 8002:
      localObject = new cnF();
      break;
    case 8028:
      localObject = new dgJ();
      break;
    case 8010:
      localObject = new brM();
      break;
    case 8304:
      localObject = new bDZ();
      break;
    case 4300:
      localObject = new beM();
      break;
    case 202:
      localObject = new tN();
      break;
    case 8033:
      localObject = new Mk();
      break;
    case 8034:
      localObject = new Wz();
      break;
    case 8120:
      localObject = new ciP();
      break;
    case 8124:
      localObject = new qp();
      break;
    case 8122:
      localObject = new Rg();
      break;
    case 8110:
      localObject = new aHs();
      break;
    case 8116:
      localObject = new dMk();
      break;
    case 4123:
      localObject = new dRd();
      break;
    case 8200:
      localObject = new aJy();
      break;
    default:
      K.warn("ATTENTION : l'id de message passé en parametre n'est pas géré par la factory : " + paramInt);
      localObject = fCR;
    }

    ((bWH)localObject).jl(paramInt);
    parambES.a((bWH)localObject);
  }
}