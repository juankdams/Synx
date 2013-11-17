import org.apache.log4j.Logger;

public final class apA
{
  private static Logger K = Logger.getLogger(apA.class);

  public static void a(int paramInt, bES parambES)
  {
    Object localObject;
    switch (paramInt) {
    case 4127:
      localObject = new cZ();
      break;
    case 4126:
      localObject = new bDz();
      break;
    case 8156:
      localObject = new aop();
      break;
    case 4124:
      localObject = new dEA();
      break;
    case 8040:
      localObject = new cSf();
      break;
    case 8300:
      localObject = new buH();
      break;
    case 8012:
      localObject = new baW();
      break;
    case 8000:
      localObject = new cMv();
      break;
    case 4508:
      localObject = new cIh();
      break;
    case 8114:
      localObject = new cUj();
      break;
    case 8150:
      localObject = new PZ();
      break;
    case 8026:
      localObject = new bqg();
      break;
    case 8158:
      localObject = new ayu();
      break;
    case 4214:
      localObject = new zK();
      break;
    case 8308:
      localObject = new cYx();
      break;
    case 8310:
      localObject = new Ds();
      break;
    case 4170:
      localObject = new bQR();
      break;
    case 8030:
      localObject = new daJ();
      break;
    case 5240:
      localObject = new dLz();
      break;
    case 8100:
      localObject = new yN();
      break;
    case 8104:
      localObject = new bjF();
      break;
    case 8202:
      localObject = new bXP();
      break;
    case 8016:
      localObject = new Ls();
      break;
    default:
      K.warn("ATTENTION : l'id de message passé en parametre n'est pas géré par la factory : " + paramInt);
      localObject = blJ.bwM();
    }

    ((bWH)localObject).jl(paramInt);
    parambES.a((bWH)localObject);
  }
}