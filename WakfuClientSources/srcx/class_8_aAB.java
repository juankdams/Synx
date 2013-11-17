import org.apache.log4j.Logger;

public final class aAB
{
  private static final Logger K = Logger.getLogger(aAB.class);

  public static void a(int paramInt, bES parambES)
  {
    Object localObject;
    switch (paramInt) {
    case 4170:
      localObject = new WR();
      break;
    case 4114:
      localObject = new mk();
      break;
    case 4126:
      localObject = new daf();
      break;
    case 4122:
      localObject = new cWF();
      break;
    case 8154:
      localObject = new dUf();
      break;
    case 8202:
      localObject = new xO();
      break;
    case 8300:
      localObject = new Pe();
      break;
    case 8006:
      localObject = new cnZ();
      break;
    case 8000:
      localObject = new ca();
      break;
    case 8038:
      localObject = new iu();
      break;
    case 8302:
      localObject = new cIL();
      break;
    case 8108:
      localObject = new any();
      break;
    case 8150:
      localObject = new cBL();
      break;
    case 7906:
      localObject = new dHH();
      break;
    case 7904:
      localObject = new ciy();
      break;
    case 7902:
      localObject = new cxY();
      break;
    case 8004:
      localObject = new dTp();
      break;
    case 8002:
      localObject = new GF();
      break;
    case 8028:
      localObject = new dfE();
      break;
    case 8026:
      localObject = new cBR();
      break;
    case 4300:
      localObject = new abm();
      break;
    case 8110:
      localObject = new TX();
      break;
    case 7998:
      localObject = new cFw();
      break;
    default:
      K.warn("ATTENTION : l'id de message passé en parametre n'est pas géré par la factory : " + paramInt);
      localObject = blJ.bwM();
    }

    ((bWH)localObject).jl(paramInt);
    parambES.a((bWH)localObject);
  }
}