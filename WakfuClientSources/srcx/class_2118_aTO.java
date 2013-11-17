class aTO
  implements eA
{
  private boolean first = true;

  aTO(bPu parambPu, StringBuilder paramStringBuilder) {  } 
  public boolean a(short paramShort, Object paramObject) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramShort);
    this.aBU.append("=");
    this.aBU.append(paramObject);
    return true;
  }
}