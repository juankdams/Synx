import org.apache.log4j.Logger;

final class cGy extends Mo
{
  private final dpb iBI;

  private cGy(byo parambyo, dpb paramdpb)
  {
    this.iBI = paramdpb;
    this.iBI.ao().a(this);
  }

  public void aS() {
    byo.bFH().error("Le client ne devrait pas sérialiser le groupe du NPC");
  }

  public void aT() {
    byo.a(this.iK, this.iBI.lpG);
    if (byo.i(this.iK) != 0L)
      cWz.cKu().b(this.iK, this.iBI.lpH);
    else if ((!byo.j(this.iK)) && (!this.iK.cQK()))
      byo.asz().error("Déserialisation d'un NPC id=" + byo.k(this.iK) + " avec un groupId=0 : anormal");
  }
}