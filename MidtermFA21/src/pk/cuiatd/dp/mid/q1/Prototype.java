package pk.cuiatd.dp.mid.q1;

public interface Prototype extends Cloneable {
	public AccessControl clone() throws CloneNotSupportedException;
}
