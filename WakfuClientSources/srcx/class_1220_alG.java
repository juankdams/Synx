import org.apache.log4j.Logger;

final class alG
  implements dxp
{
  private static final Logger K = Logger.getLogger(alG.class);

  public void e(Kb paramKb) {
    K.info("[BAG INVENTORY] Ajout du sac " + paramKb);
  }

  public void f(Kb paramKb) {
    K.info("[BAG INVENTORY] Retrait du sac " + paramKb);
  }

  public void q(gA paramgA) {
    K.info("[BAG INVENTORY] Ajout de l'item " + paramgA);
  }

  public void r(gA paramgA) {
    K.info("[BAG INVENTORY] Retrait de l'item " + paramgA);
  }
}