public class PE
{
  final dBf cid;
  Object aOd;
  final cKH cie;

  protected PE(dBf paramdBf, Object paramObject, cKH paramcKH)
  {
    this.cid = paramdBf;
    this.cid.a(this);
    this.aOd = (this.cid.getResultProvider() == null ? paramObject : this.cid.getResultProvider().getResult(paramObject));
    this.cie = paramcKH;
  }
}