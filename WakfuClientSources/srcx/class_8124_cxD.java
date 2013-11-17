import java.util.ArrayList;

public class cxD
{
  public static final cxD ilA = new cxD();

  private final ArrayList aBf = new ArrayList();

  public boolean a(baa parambaa)
  {
    return this.aBf.add(parambaa);
  }

  public cUb b(dlp paramdlp) {
    dAg localdAg = new dAg();
    localdAg.c(paramdlp);
    a(localdAg);
    return localdAg;
  }

  public cUb a(aTz paramaTz) {
    dAg localdAg = new dAg();
    localdAg.c(paramaTz);
    a(localdAg);
    return localdAg;
  }

  public cUb c(cUb paramcUb) {
    dAg localdAg = new dAg();
    localdAg.c(paramcUb.cJh());
    localdAg.setName(paramcUb.getName());
    localdAg.Cd(paramcUb.cJi());
    localdAg.Ce(paramcUb.cJk());
    localdAg.lS(paramcUb.aGa());
    localdAg.hk(paramcUb.IT());
    localdAg.by(paramcUb.cJn());
    localdAg.t(paramcUb.cJo());
    localdAg.u(paramcUb.cJl());
    localdAg.v(paramcUb.cJm());
    localdAg.lU(paramcUb.cJq());
    localdAg.w(paramcUb.cJr());
    a(localdAg);
    return localdAg;
  }

  private void a(dAg paramdAg) {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((baa)this.aBf.get(i)).b(paramdAg);
  }

  public String toString()
  {
    return "PetFactory{m_listeners=" + this.aBf.size() + '}';
  }
}