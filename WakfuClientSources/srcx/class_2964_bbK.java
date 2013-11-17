public class bbK
{
  private static final cYq fkW = new cYq(cYq.cLM());

  public static boolean a(CS paramCS, dxL paramdxL) {
    if (!paramCS.isActive()) {
      return false;
    }

    if (paramCS.bnd() == null) {
      return true;
    }

    dxL localdxL = paramdxL.a(paramCS.bnd(), paramCS.bne());
    fkW.set(paramCS.getStartTime());
    if (localdxL.R(fkW)) {
      return true;
    }

    paramCS.setActive(false);
    return false;
  }

  public static boolean b(CS paramCS, dxL paramdxL) {
    if ((paramCS.isComplete()) && (!paramCS.bnc())) {
      return false;
    }

    if ((!paramCS.isComplete()) && (a(paramCS, paramdxL))) {
      return false;
    }

    if (e(paramCS, paramdxL)) {
      return false;
    }

    if (d(paramCS, paramdxL)) {
      return false;
    }

    if ((c(paramCS, paramdxL)) && (!paramCS.bnf())) {
      return false;
    }

    return true;
  }

  public static boolean c(CS paramCS, dxL paramdxL) {
    return (!a(paramCS, paramdxL)) && (paramCS.getStartTime() != 0L);
  }

  public static boolean d(CS paramCS, dxL paramdxL) {
    if ((paramCS.bnd() == null) || (paramCS.getStartTime() == 0L))
    {
      return false;
    }

    fkW.set(paramCS.getStartTime());
    cYq localcYq = new cYq(paramdxL.a(paramCS.bnd(), paramCS.bne()));

    return localcYq.R(fkW);
  }

  public static boolean e(CS paramCS, dxL paramdxL) {
    if ((paramCS.bnb() != 0L) && (paramCS.LZ() != 0L)) {
      fkW.set(paramCS.LZ());
      fkW.E((int)(paramCS.bnb() / 1000L), 0, 0, 0);
      if (paramdxL.Q(fkW)) {
        return true;
      }
      paramCS.bn(0L);
    }
    return false;
  }

  public static boolean f(CS paramCS, dxL paramdxL) {
    if ((!paramCS.isComplete()) && (paramCS.getDuration() != 0) && (paramCS.getStartTime() != 0L))
    {
      fkW.set(paramCS.getStartTime());
      fkW.E(paramCS.getDuration() / 1000, 0, 0, 0);
      if (paramdxL.Q(fkW)) {
        return true;
      }
    }
    return false;
  }

  public static cds g(CS paramCS, dxL paramdxL) {
    if (paramCS.LZ() == 0L) {
      return cds.hwQ;
    }

    cYq localcYq = cYq.jq(paramCS.LZ());
    localcYq.E((int)(paramCS.bnb() / 1000L), 0, 0, 0);

    return paramdxL.V(localcYq);
  }

  public static cds a(aXM paramaXM, dxL paramdxL) {
    if (paramaXM.bnd() == null) {
      return cds.hwQ;
    }

    cYq localcYq = new cYq(paramdxL.a(paramaXM.bnd(), paramaXM.bne()));
    localcYq.n(paramaXM.bne());

    return paramdxL.V(localcYq);
  }

  public static cds h(CS paramCS, dxL paramdxL) {
    if (paramCS.getDuration() == 0) {
      return cds.hwQ;
    }

    cYq localcYq = cYq.jq(paramCS.getStartTime());
    localcYq.E(paramCS.getDuration() / 1000, 0, 0, 0);

    return paramdxL.V(localcYq);
  }

  public static cds i(CS paramCS, dxL paramdxL) {
    if (paramCS.bnd() == null) {
      return cds.hwQ;
    }

    fkW.set(paramCS.getStartTime());
    cYq localcYq = new cYq(paramdxL.a(paramCS.bnd(), paramCS.bne()));

    if (!localcYq.R(fkW)) {
      return cds.hwQ;
    }

    localcYq.n(paramCS.bne());
    return paramdxL.V(localcYq);
  }
}