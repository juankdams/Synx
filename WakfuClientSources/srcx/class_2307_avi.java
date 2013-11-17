import org.apache.log4j.Logger;

final class avi extends dcW
{
  private static Logger K = Logger.getLogger(avi.class);

  public boolean a(bpy parambpy) {
    int i = parambpy.a();

    if ((this.kLP == null) || (((arl)this.kLP).getId() != i)) {
      K.error("[_FL_] Frame invalide à la réception d'un message " + bpy.class.getSimpleName());
      return false;
    }

    vr localvr = new vr(parambpy.getId(), dPD.mid.bJ(), 0, i, parambpy.AD());

    bnc.bxw().a((arl)this.kLP, localvr);
    bnc.bxw().d(this.kLP);

    return false;
  }
}