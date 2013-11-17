import java.nio.ByteBuffer;

class dko
  implements ddz
{
  private gA aUe;

  dko()
  {
  }

  dko(gA paramgA)
  {
    this.aUe = paramgA;
  }

  public byte[] j() {
    dGD localdGD = new dGD();
    this.aUe.a(localdGD);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(localdGD.O());
    localdGD.g(localByteBuffer);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    dGD localdGD = new dGD();
    localdGD.h(paramByteBuffer);

    this.aUe = Hh.QM().c(localdGD);
  }

  public void a(cfH paramcfH) {
    paramcfH.ai(this.aUe);
  }

  public adY cfD() {
    return adY.cUQ;
  }

  public String toString()
  {
    return "AddItemChange{m_item=" + this.aUe + '}';
  }
}