class dbe
  implements eH
{
  private boolean first = true;

  dbe(bEw parambEw, StringBuilder paramStringBuilder) {  } 
  public boolean a(Object paramObject, byte paramByte) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramObject);
    this.aBU.append("=");
    this.aBU.append(paramByte);
    return true;
  }
}