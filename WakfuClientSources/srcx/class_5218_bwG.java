import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bwG extends dnT
{
  private static final Logger K;
  private static final aoL ghe;
  private static final dEO ghf;

  public static void bEl()
  {
    cHu localcHu = ghe.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      dcY localdcY = (dcY)localcHu.value();
      localdcY.cxD();
    }
    ghe.clear();
  }

  public static void gg(long paramLong) {
    dcY localdcY = (dcY)ghe.remove(paramLong);
    if (localdcY != null)
      localdcY.cxD();
  }

  public aEe a(aEe paramaEe, float[] paramArrayOfFloat)
  {
    super.a(paramaEe, paramArrayOfFloat);
    if (paramaEe == null) {
      return null;
    }

    Su localSu = i(paramaEe);
    if (localSu == null) {
      return paramaEe;
    }

    String str = KV.cD(paramaEe.getMessage());
    long l = localSu.getId();

    boolean bool = ceb.cgG().h(str, l);

    if (bool) {
      return paramaEe;
    }

    if (str.length() == 0) {
      return null;
    }

    dcY localdcY = a(l, paramaEe);
    if (localdcY == null) {
      K.error("La bulle stockée pour le mobdile de " + paramaEe.getSourceName() + " n'appartient plus à personne !");
      return paramaEe;
    }

    paramaEe.setMessage(cOg.replace(paramaEe.getMessage(), str, localdcY.setText(str)));

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      localdcY.setTarget(localcUo);
      localdcY.setYOffset((int)(localcUo.ats() * 10.0F));
      localdcY.setBubbleIsVisible(true);
      localdcY.cIP();

      localdcY.setColor(new bNa(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramaEe.aQj() == 1 ? 0.0F : 0.75F));

      int i = l != byv.bFN().bFO().getId() ? 1 : 0;
      if (i != 0) {
        localdcY.setBubbleObserver(byv.bFN().bFO().aeL());
      }
    }

    return paramaEe;
  }

  private static dcY a(long paramLong, aEe paramaEe)
  {
    dcY localdcY = (dcY)ghe.get(paramLong);
    if (localdcY == null) {
      return b(paramLong, paramaEe);
    }

    if (!a(localdcY, paramLong, paramaEe)) {
      return null;
    }
    return localdcY;
  }

  private static dcY b(long paramLong, aEe paramaEe) {
    String str = bMt.bTO();
    dcY localdcY = bMt.jR(str);
    localdcY.t(false, paramaEe.isResizable());
    ghe.put(paramLong, localdcY);
    return localdcY;
  }

  private static boolean a(dcY paramdcY, long paramLong, aEe paramaEe) {
    agn localagn = paramdcY.getTarget();
    if (localagn == null) {
      return false;
    }
    if ((!bB) && (paramLong != ((cUo)localagn).getId())) throw new AssertionError("Le mobile de " + paramaEe.getSourceName() + " ne correspond pas à l'ancien");
    paramdcY.cxC();
    return true;
  }

  private static Su i(aEe paramaEe) {
    String str = paramaEe.getSourceName();
    long l = paramaEe.aQk();
    if ((str == null) && (l == -1L)) {
      return null;
    }

    if (l == -1L) {
      return CA.Lv().bt(str);
    }
    return CA.Lv().bj(l);
  }

  public static dcY bEm() {
    return (dcY)ghe.get(byv.bFN().bFO().getId());
  }

  static
  {
    K = Logger.getLogger(bwG.class);
    ghe = new aoL();
    ghf = new bPS();

    WakfuClientInstance.awy().cUV().a(ghf);
  }
}